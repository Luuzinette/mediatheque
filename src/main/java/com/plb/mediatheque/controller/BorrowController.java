package com.plb.mediatheque.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.plb.mediatheque.repository.UsersRepository;
import com.plb.mediatheque.service.BorrowService;

public class BorrowController {
	
	@Autowired
	UsersRepository userRepository;
	
	@Autowired
	BorrowService borrowService;

}
