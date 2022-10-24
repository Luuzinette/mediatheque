package com.plb.mediatheque.service;

public class BorrowLimitException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BorrowLimitException(String condition) {
		super("La limite de 3 emprunts a été atteinte pour cet utilisateur : "+ condition);
	}

}
