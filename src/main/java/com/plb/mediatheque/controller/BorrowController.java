package com.plb.mediatheque.controller;

import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.mediatheque.entity.Borrow;
import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.entity.Users;
import com.plb.mediatheque.repository.BorrowRepository;
import com.plb.mediatheque.repository.UsersRepository;
import com.plb.mediatheque.service.BorrowLimitException;
import com.plb.mediatheque.service.BorrowService;
import com.plb.mediatheque.service.DocNotAvailableException;

@RestController
@RequestMapping("/api/borrows")
public class BorrowController {
	
	@Autowired
	BorrowService borrowService;
	
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	UsersRepository userRepository;
	
	@PostMapping("/users/{idUser}/emprunter")
	public ResponseEntity<Borrow> makeBorrow(@PathVariable Long idUser, @RequestBody Set<Item> items) throws BorrowLimitException, DocNotAvailableException {
		Users borrower = new Users();
		borrower = userRepository.findById(idUser).orElseThrow(() -> new EntityNotFoundException("Cet utilisateur n'existe pas."));
		borrower.setId(idUser);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(borrowService.makeABorrow(borrower, items));
	}
	
	@DeleteMapping("/borrows/{id}/retourner")
	public void returnBorrow(@PathVariable Long id) {
		Borrow borrow = borrowRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cet emprunt n'existe pas."));
		borrow.setId(id);
		
		borrowService.returnABorrow(borrow);
	}

}
