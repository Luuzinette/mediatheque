package com.plb.mediatheque.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "title")
    private String title;
	
	@Column(name = "nbr_copies")
    private Long nbrCopies;
	
	@Column(name = "release_date")
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
	
	@Transient
	boolean isDisponible() {
		return nbrCopies > 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", nbrCopies=");
		builder.append(nbrCopies);
		builder.append(", releaseDate=");
		builder.append(releaseDate);
		builder.append("]");
		return builder.toString();
	}

}