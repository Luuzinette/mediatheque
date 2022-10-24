package com.plb.mediatheque.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plb.mediatheque.entity.Borrow;
import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.entity.Users;
import com.plb.mediatheque.repository.BorrowRepository;
import com.plb.mediatheque.repository.ItemRepository;
import com.plb.mediatheque.repository.UsersRepository;

@Service
@Transactional
public class BorrowService {
	
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
    ItemRepository itemRepository;

    @Autowired
    UsersRepository usersRepository;
    
    //Faire un emprunt
    public Borrow makeABorrow(Users borrower, Set<Item> items) throws BorrowLimitException, DocNotAvailableException {
    	
    	borrower = usersRepository.findById(borrower.getId()).orElseThrow(() -> new EntityNotFoundException("Cet utilisateur n'existe pas."));
		int emprunt = borrower.getBorrowedItems().size();

		if (emprunt + items.size() > 3) {
			throw new BorrowLimitException("La limite de 3 emprunts a été atteinte pour cet utilisateur.");
		}

		List<Item> docDispo = new ArrayList<>();

		for(Item item: items){
			Item itemBorrowed = itemRepository.findById(item.getId()).get();
			if(itemBorrowed.getNbrCopies() == 0){
				throw new DocNotAvailableException("Le document désiré n'est pas disponible.");
			} else {
				itemBorrowed.setNbrCopies(itemBorrowed.getNbrCopies() - 1);
				docDispo.add(itemBorrowed);
			}
		}

		Borrow location = new Borrow();
		location.setStartDate(LocalDateTime.now());
		location.setEndDate(LocalDateTime.now().plusDays(7));
		location.setItems(docDispo);
		location.setBorrower(borrower);
        
		borrowRepository.save(location);

		return location;
    }
    
    
    // Rendre un emprunt
    public Borrow returnABorrow(Borrow borrow) throws TimeDepassementException {

    	borrow = borrowRepository.findById(borrow.getId()).orElseThrow(() -> new EntityNotFoundException("Cet emprunt n'existe pas."));

    	List<Item> items = borrow.getItems();

    	for (Item item : items) {
    		Item i = itemRepository.findById(item.getId()).get();
    		i.setNbrCopies(i.getNbrCopies() + 1);
    		itemRepository.save(i);
    		}
    	
    	LocalDateTime startDate=borrow.getStartDate();
		LocalDateTime endDate = borrow.getEndDate();
		long difference = ChronoUnit.DAYS.between(startDate,endDate);
		
		if (difference > 7) {
			throw new TimeDepassementException("La date limite de restitution a été dépassée.");
		}
		
		return borrow;
    	}
}
