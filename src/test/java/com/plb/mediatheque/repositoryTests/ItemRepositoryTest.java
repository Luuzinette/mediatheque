package com.plb.mediatheque.repositoryTests;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		int nbrCopies =0;
        List<Item> response = itemRepository.findDisponible();
        for(Item i : response) {
            if (i.getNbrCopies()>0) {
                nbrCopies+=1;
            }
        }
        System.out.println("Nombre d'items disponibles : " + nbrCopies);
        assertEquals(nbrCopies, itemRepository.findDisponible().size());
    }
	
//	@Test
//	public void testFindDvd() {
       
//    }
	
	@Test
	void testFindByReleaseDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2010);
		cal.set(0, 0);
		List<Item> response = itemRepository.findByReleaseDate(cal.getTime());
		for(Item i : response) {
			if (i.getReleaseDate()>cal.getTime()) {
				
			}
		}
		System.out.println("Nombre de nouveautés : " + );
		assert
	}

}
