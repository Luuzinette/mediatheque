package com.plb.mediatheque.service;

public class BorrowLimitException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BorrowLimitException(String message) {
		super(message);
	}

}
