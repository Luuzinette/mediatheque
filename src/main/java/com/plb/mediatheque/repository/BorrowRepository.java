package com.plb.mediatheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plb.mediatheque.entity.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
	
	// Trouver les emprunts d'un user
	@Query("select e from Borrow e where e.users.id=?1")
	public List<Borrow> findAllEmpruntsByUserId(Long id);

}
