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
	private long idPerson;
	private long idRole;
	
	public Admin() {
		
	}

	public Admin(long id, long idPerson, long idRole) {
		super();
		this.id = id;
		this.idPerson = idPerson;
		this.idRole = idRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", idPerson=" + idPerson + ", idRole=" + idRole + "]";
	}
}
