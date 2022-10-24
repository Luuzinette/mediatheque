package com.plb.mediatheque.service;

public class DocNotAvailableException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DocNotAvailableException(String condition) {
		super("Le document désiré n'est pas disponible : "+ condition);
	}

}
