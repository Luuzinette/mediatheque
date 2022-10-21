package com.plb.mediatheque.repositoryTests;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.plb.mediatheque.entity.Borrow;
import com.plb.mediatheque.entity.Users;
import com.plb.mediatheque.repository.BorrowRepository;

@DataJpaTest
public class BorrowRepositoryTest {
	
	@Autowired
	BorrowRepository borrowRepository;
	
	@Test
	public void findBorrowByUser() {
	Users user = new Users();
	user.setId(1l);
	
	List<Borrow> findResult = borrowRepository.findBorrowsById(user);
	System.out.println("Voici tous les emprunts de cet utilisateur :" + findResult);
	assertTrue(findResult.size() > 0);
	
	}
}
