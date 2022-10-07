package com.plb.mediatheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cd")
public class Cd extends Item {
	
	@Column(name = "artist")
    private String artist;
	
	@Column(name = "cd_duration")
    private Long cdDuration;
	
	@Column(name = "nbr_titles")
    private Long nbrTitles;

	public Cd() {
		super();
	}

	public Cd(String artist, Long cdDuration, Long nbrTitles) {
		super();
		this.artist = artist;
		this.cdDuration = cdDuration;
		this.nbrTitles = nbrTitles;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Long getCdDuration() {
		return cdDuration;
	}

	public void setCdDuration(Long cdDuration) {
		this.cdDuration = cdDuration;
	}

	public Long getNbrTitles() {
		return nbrTitles;
	}

	public void setNbrTitles(Long nbrTitles) {
		this.nbrTitles = nbrTitles;
	}
	

}
