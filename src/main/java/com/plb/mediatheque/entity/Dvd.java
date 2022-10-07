package com.plb.mediatheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dvd")
public class Dvd extends Item {
	
	@Column(name = "director", nullable = false)
    private String director;
	
	@Column(name = "dvd_duration", nullable = false)
    private Long dvdDuration;
	
	@Enumerated(EnumType.STRING)
	private Type type;

	public Dvd() {
		super();
	}

	public Dvd(String director, Long dvdDuration, Type type) {
		super();
		this.director = director;
		this.dvdDuration = dvdDuration;
		this.type = type;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Long getDvdDuration() {
		return dvdDuration;
	}

	public void setDvdDuration(Long dvdDuration) {
		this.dvdDuration = dvdDuration;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}