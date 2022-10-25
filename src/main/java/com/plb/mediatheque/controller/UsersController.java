package com.plb.mediatheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.mediatheque.entity.Users;
import com.plb.mediatheque.repository.BorrowRepository;
import com.plb.mediatheque.repository.UsersRepository;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private UsersRepository userRepository; 
	
	@Autowired
	private BorrowRepository borrowRepository;
	
	@GetMapping()
	public List<Users> findAllUser(){
		return userRepository.findAll();
	}

}
