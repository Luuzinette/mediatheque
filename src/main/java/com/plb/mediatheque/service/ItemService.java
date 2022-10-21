package com.plb.mediatheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.repository.ItemRepository;

public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAllDisponible() {
		List<Item> ret =new ArrayList<>();
		for(Item i : itemRepository.findDisponible()) {
			ret.add(i);
		}
		return ret;
	}

}
