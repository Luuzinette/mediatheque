package com.plb.mediatheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.repository.ItemRepository;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping()
	public ResponseEntity<List<Item>> getAllItems(){
		return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/dvd")
	public ResponseEntity<List<Item>> getAllDvd(){
		return new ResponseEntity<>(itemRepository.findAllDvd(), HttpStatus.OK);
	}
	
	@GetMapping("/cd")
	public ResponseEntity<List<Item>> getAllCd(){
		return new ResponseEntity<>(itemRepository.findAllCd(), HttpStatus.OK);
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Item>> getAllBook(){
		return new ResponseEntity<>(itemRepository.findAllBook(), HttpStatus.OK);
	}
	
}
