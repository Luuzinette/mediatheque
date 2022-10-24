package com.plb.mediatheque.serviceTest;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.plb.mediatheque.entity.Borrow;
import com.plb.mediatheque.entity.Item;
import com.plb.mediatheque.entity.Users;
import com.plb.mediatheque.service.BorrowLimitException;
import com.plb.mediatheque.service.BorrowService;
import com.plb.mediatheque.service.DocNotAvailableException;

@SpringBootTest
public class BorrowServiceTest {
	@Autowired
	BorrowService borrowService;
	
	@Test
	void testMakeABorrow() throws BorrowLimitException, DocNotAvailableException {
		Users user3 = new Users();
		user3.setId(3L);
		
		Set<Item> itemBorrowed = new HashSet<>();
		
		Item item1 = new Item();
		item1.setId(1L);
		itemBorrowed.add(item1);
		
		Item item2 = new Item();
		item2.setId(2L);
		itemBorrowed.add(item2);
		
		Borrow borrow = borrowService.makeABorrow(user3, itemBorrowed);

		assertNotNull(borrow.getId());
		assertEquals(2,borrow.getItems().size());
		
	}

}
