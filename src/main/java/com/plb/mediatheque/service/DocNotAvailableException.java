package com.plb.mediatheque.service;

public class DocNotAvailableException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DocNotAvailableException(String message) {
		super(message);
	}

}
