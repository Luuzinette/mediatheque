package com.plb.mediatheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.service.ItemService;

public class CatalogueController {
	
	@Autowired
	ItemService itemService ;
	
	@GetMapping("/catalogue")
	public ResponseEntity<List<Item>> findAllDisponible(){
		List<Item> itemsDisponible= itemService.findAllDisponible();
		return ResponseEntity.ok(itemsDisponible);
	}

}
