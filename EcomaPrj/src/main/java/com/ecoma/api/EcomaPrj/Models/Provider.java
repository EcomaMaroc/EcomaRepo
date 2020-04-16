package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "provider")
public class Provider {

	@Id
    private long id;
	private String Name;
	private String Phone;
	
    public Provider() {
		
	}

	public Provider(long id, String name,String phone) {
		super();
		this.id = id;
		this.Name = name;
		this.Phone = phone;
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
	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", Name=" + Name + ", Phone=" + Phone + "]";
	}
	
}
