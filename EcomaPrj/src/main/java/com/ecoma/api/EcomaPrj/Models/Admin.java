package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "admin")
public class Admin {
	
	@Id
    private long id;
	private Person Person;
	private Role Role;
	
	public Admin() {
		
	}
	
	public Admin(long id, Person person, Role role) {
		super();
		this.id = id;
		Person = person;
		Role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", Person=" + Person + ", Role=" + Role + "]";
	}

	
}
