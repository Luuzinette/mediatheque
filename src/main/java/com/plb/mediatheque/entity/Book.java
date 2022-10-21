package com.plb.mediatheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book extends Item {
	
	@Column(name = "author")
    private String author;
	
	@Column(name = "num_isbn")
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [author=");
		builder.append(author);
		builder.append(", numIsbn=");
		builder.append(numIsbn);
		builder.append("]");
		return builder.toString();
	}

}
