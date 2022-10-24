package com.plb.mediatheque.service;

public class TimeDepassementException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public TimeDepassementException(String condition) {
		super("La date limite de restitution a été dépassée : "+ condition);
	}
}
