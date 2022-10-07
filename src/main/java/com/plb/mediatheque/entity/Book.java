package com.plb.mediatheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "book")
public class Book extends Item {
	
	@Column(name = "author", nullable = false)
    private String author;
	
	@Column(name = "num_isbn", nullable = false)
    private Long numIsbn;

	public Book() {
		super();
	}

	public Book(String author, Long numIsbn) {
		super();
		this.author = author;
		this.numIsbn = numIsbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getNumIsbn() {
		return numIsbn;
	}

	public void setNumIsbn(Long numIsbn) {
		this.numIsbn = numIsbn;
	}

}