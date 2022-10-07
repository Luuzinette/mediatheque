package com.plb.mediatheque.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemSequenceGenerator")
    @SequenceGenerator(name = "itemSequenceGenerator", allocationSize = 1)
    private Long id;
	
	@Column(name = "title", nullable = false)
    private String title;
	
	@Column(name = "nbr_copies", nullable = false)
    private Long nbrCopies;
	
	@Column(name = "release_date", nullable = false)
	private Date releaseDate;
	
	public Item() {
		
	}

	public Item(Long id, String title, Long nbrCopies, Date releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.nbrCopies = nbrCopies;
		this.releaseDate = releaseDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getNbrCopies() {
		return nbrCopies;
	}

	public void setNbrCopies(Long nbrCopies) {
		this.nbrCopies = nbrCopies;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	

}