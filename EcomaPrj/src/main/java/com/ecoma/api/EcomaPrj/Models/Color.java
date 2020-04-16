package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "color")
public class Color {

	@Id
    private long id;
	private String Name;
	
	public Color() {
		
	}

	public Color(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", Name=" + Name + "]";
	}
	
}