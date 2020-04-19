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
	private long idPerson;
	private long idRole;
	private double rating;
	private String type;
	private long deliveredsIteamsNbr;
	
	public DeliveryMan() {
		
	}

	public DeliveryMan(long id, long idperson, long idrole, double rating, String type, long deliveredsIteamsNbr) {
		super();
		this.id = id;
		this.idPerson = idperson;
		this.idRole = idrole;
		this.rating = rating;
		this.type = type;
		this.deliveredsIteamsNbr = deliveredsIteamsNbr;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getDeliveredsIteamsNbr() {
		return deliveredsIteamsNbr;
	}

	public void setDeliveredsIteamsNbr(long deliveredsIteamsNbr) {
		this.deliveredsIteamsNbr = deliveredsIteamsNbr;
	}

	@Override
	public String toString() {
		return "DeliveryMan [id=" + id + ", idPerson=" + idPerson + ", idRole=" + idRole + ", rating=" + rating
				+ ", type=" + type + ", deliveredsIteamsNbr=" + deliveredsIteamsNbr + "]";
	}
}
