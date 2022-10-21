package com.plb.mediatheque.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plb.mediatheque.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	// Trouve le nombre total d'items qui ont des copies disponibles
	@Query("select i from Item i where i.nbrCopies > 0")
	public List<Item> findDisponible();
	
	// Voir les items par type
	@Query("from Dvd")
	public List<Item> findAllDvd();
	
	@Query("from Cd")
	public List<Item> findAllCd();
	
	@Query("from Book")
	public List<Item> findAllBook();
	
	// Voir les nouveautés uniquement
	@Query("from Item i where i.releaseDate >= :date")
	public List<Item> findByReleaseDate(Date date);

}
