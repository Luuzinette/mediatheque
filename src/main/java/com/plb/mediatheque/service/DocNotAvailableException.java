package com.plb.mediatheque.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DocNotAvailableException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DocNotAvailableException(String message) {
		super(message);
	}

}