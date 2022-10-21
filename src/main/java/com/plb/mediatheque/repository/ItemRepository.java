package com.plb.mediatheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plb.mediatheque.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	// Trouve le nombre total d'items qui ont des copies disponibles
	@Query("select i from Item i where i.nbrCopies > 0")
	public List<Item> findDisponible();

}
