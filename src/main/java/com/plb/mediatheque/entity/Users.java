package com.plb.mediatheque.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "firstname")
    private String firstname;

    @Column(name = "name")
    private String name;
    
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
    
    @OneToMany(mappedBy = "users", cascade = CascadeType.REMOVE)
    private Set<Borrow> borrowedItems = new HashSet<Borrow>();

	public Users() {
		
	}

	public Users(Long id, String firstname, String name, String login, String password, Set<Borrow> borrowedItems) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.name = name;
		this.login = login;
		this.password = password;
		this.borrowedItems = borrowedItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Borrow> getBorrowedItems() {
		return borrowedItems;
	}

	public void setBorrowedItems(Set<Borrow> borrowedItems) {
		this.borrowedItems = borrowedItems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Users [id=");
		builder.append(id);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", name=");
		builder.append(name);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}