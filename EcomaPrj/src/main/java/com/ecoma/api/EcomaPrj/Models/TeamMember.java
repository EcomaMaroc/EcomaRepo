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
	private long idPerson;
	private long idRole;
	private long idAdmin; 
	
	public TeamMember() {
		
	}

	public TeamMember(long id, long idperson, long idrole, long idadmin) {
		super();
		this.id = id;
		idPerson = idperson;
		idRole = idrole;
		idAdmin = idadmin;
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

	public long getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

	@Override
	public String toString() {
		return "TeamMember [id=" + id + ", IdPerson=" + idPerson + ", IdRole=" + idRole + ", IdAdmin=" + idAdmin + "]";
	}	
}
