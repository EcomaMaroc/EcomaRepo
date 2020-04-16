package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "deliveryMan")
public class DeliveryMan {

	@Id
    private long id;
	private Person Person;
	private Role Role;
	private double Rating;
	private String Type;
	private long DeliveredsIteamsNbr;
	
	public DeliveryMan() {
		
	}

	public DeliveryMan(long id, Person person, Role role, double rating, String type,
			long deliveredsIteamsNbr) {
		super();
		this.id = id;
		this.Person = person;
		this.Role = role;
		this.Rating = rating;
		this.Type = type;
		this.DeliveredsIteamsNbr = deliveredsIteamsNbr;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role role) {
		Role = role;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public long getDeliveredsIteamsNbr() {
		return DeliveredsIteamsNbr;
	}

	public void setDeliveredsIteamsNbr(long deliveredsIteamsNbr) {
		DeliveredsIteamsNbr = deliveredsIteamsNbr;
	}

	@Override
	public String toString() {
		return "DeliveryMan [id=" + id + ", Person=" + Person + ", Role=" + Role + ", Rating=" + Rating + ", Type="
				+ Type + ", DeliveredsIteamsNbr=" + DeliveredsIteamsNbr + "]";
	}	
}
