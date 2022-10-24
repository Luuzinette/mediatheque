package com.plb.mediatheque.service;

import java.time.LocalDateTime;
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
    
    
    public Borrow makeABorrow(Users borrower, Set<Item> items) throws BorrowLimitException, DocNotAvailableException {
    	
    	borrower = usersRepository.findById(borrower.getId()).orElseThrow(() -> new EntityNotFoundException("Cet utilisateur n'existe pas."));
		int emprunt = borrower.getBorrowedItems().size();

		if (emprunt + items.size() > 3) {
			throw new BorrowLimitException("La limite de 3 emprunts a été atteinte pour cet utilisateur.");
		}

		List<Item> docDispo = new ArrayList<>();

		for (Item i : items) {
			List<Item> result = itemRepository.findDisponible(); 
			if (result.size() == 0) {
				throw new DocNotAvailableException("Le document désiré n'est pas disponible.");
			} else {
				docDispo.add(result.get(0));
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
	
}
