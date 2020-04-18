package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "role")
public class Role {
	
	@Id
    private long id;
	private String name;
	
	public Role() {
		
	}

	public Role(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", Name=" + this.name + "]";
	}
	
}
