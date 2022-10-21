package com.plb.mediatheque.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.plb.mediatheque.repository.ItemRepository;

public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;

}
