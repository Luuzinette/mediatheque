package com.plb.mediatheque.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.plb.mediatheque.repository.ItemRepository;

public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;

}
