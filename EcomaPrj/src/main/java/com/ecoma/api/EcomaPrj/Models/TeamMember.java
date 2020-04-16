package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "teamMember")
public class TeamMember {

	@Id
    private long id;
	private Person Person;
	private Role Role;
	private Admin Admin; 
	
	public TeamMember() {
		
	}

	public TeamMember(long id, Person person, Role role, Admin admin) {
		super();
		this.id = id;
		Person = person;
		Role = role;
		Admin = admin;
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

	public Admin getAdmin() {
		return Admin;
	}

	public void setAdmin(Admin admin) {
		Admin = admin;
	}

	@Override
	public String toString() {
		return "TeamMember [id=" + id + ", Person=" + Person + ", Role=" + Role + ", Admin=" + Admin + "]";
	}
	
	
}
