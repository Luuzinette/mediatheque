package com.plb.mediatheque.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BorrowLimitException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BorrowLimitException(String message) {
		super(message);
	}

}
