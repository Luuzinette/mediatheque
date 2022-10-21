package com.plb.mediatheque.repositoryTests;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.repository.ItemRepository;

@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	void testFindDisponible() {
			int nbrInit=0;
			List<Item> ret = itemRepository.findDisponible();
			for(Item i : ret) {
				if (i.getNbrCopies()>0) {
					nbrInit+=1;
				}
			}
			System.out.println("Nombre d'items disponibles en plusieurs exemplaires :"+ nbrInit);
			assertEquals(nbrInit, itemRepository.findDisponible().size());
	}

}
