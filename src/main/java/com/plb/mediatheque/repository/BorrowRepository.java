package com.plb.mediatheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plb.mediatheque.entity.Borrow;
import com.plb.mediatheque.entity.Users;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
	
	// Trouver les emprunts d'un user
	@Query("select b from Borrow b where b.users= :user")
	List<Borrow> findBorrowsById(Users user);

}
