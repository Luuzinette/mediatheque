package com.plb.mediatheque.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "borrow")
public class Borrow {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borrowSequenceGenerator")
    @SequenceGenerator(name = "borrowSequenceGenerator", allocationSize = 1)
    private Long id;
	
	@Column(name = "start_date", nullable = false)
	private LocalDateTime startDate;
	
	@Column(name = "endDate", nullable = false)
	private LocalDateTime endDate;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	private Users users;
	
	@ManyToMany
    @JoinColumn(name="item_id")
    private List<Item> items;

	public Borrow() {
		super();
	}

	public Borrow(Long id, LocalDateTime startDate, LocalDateTime endDate, Users users, List<Item> items) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.users = users;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Users getBorrower() {
		return users;
	}

	public void setBorrower(Users users) {
		this.users = users;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
    

}
