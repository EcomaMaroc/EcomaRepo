package com.ecoma.api.EcomaPrj.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "command")
public class Command {
	
	@Id
    private long id;
	private double totalQte;
	private String description;
	private String buyerCin;
	private String buyerAdress;
	private String buyerName;
	private double totalPrice;
	private boolean adminIsPayed;
	private boolean deliveryManIsPayed;
	private List<Long> idProduct;
	private long idTeamMember;
	private long idDeliveryMan;
	private long idState;
	
	public Command() {
		
	}

	public Command(long id, double totalQte, String description, String buyerCin, String buyerAdress, String buyerName,
			double totalPrice, boolean adminIsPayed, boolean deliveryManIsPayed, List<Long> idProduct,
			long idTeamMember, long idDeliveryMan, long idState) {
		super();
		this.id = id;
		this.totalQte = totalQte;
		this.description = description;
		this.buyerCin = buyerCin;
		this.buyerAdress = buyerAdress;
		this.buyerName = buyerName;
		this.totalPrice = totalPrice;
		this.adminIsPayed = adminIsPayed;
		this.deliveryManIsPayed = deliveryManIsPayed;
		this.idProduct = idProduct;
		this.idTeamMember = idTeamMember;
		this.idDeliveryMan = idDeliveryMan;
		this.idState = idState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotalQte() {
		return totalQte;
	}

	public void setTotalQte(double totalQte) {
		this.totalQte = totalQte;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBuyerCin() {
		return buyerCin;
	}

	public void setBuyerCin(String buyerCin) {
		this.buyerCin = buyerCin;
	}

	public String getBuyerAdress() {
		return buyerAdress;
	}

	public void setBuyerAdress(String buyerAdress) {
		this.buyerAdress = buyerAdress;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isAdminIsPayed() {
		return adminIsPayed;
	}

	public void setAdminIsPayed(boolean adminIsPayed) {
		this.adminIsPayed = adminIsPayed;
	}

	public boolean isDeliveryManIsPayed() {
		return deliveryManIsPayed;
	}

	public void setDeliveryManIsPayed(boolean deliveryManIsPayed) {
		this.deliveryManIsPayed = deliveryManIsPayed;
	}

	public List<Long> getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(List<Long> idProduct) {
		this.idProduct = idProduct;
	}

	public long getIdTeamMember() {
		return idTeamMember;
	}

	public void setIdTeamMember(long idTeamMember) {
		this.idTeamMember = idTeamMember;
	}

	public long getIdDeliveryMan() {
		return idDeliveryMan;
	}

	public void setIdDeliveryMan(long idDeliveryMan) {
		this.idDeliveryMan = idDeliveryMan;
	}

	public long getIdState() {
		return idState;
	}

	public void setIdState(long idState) {
		this.idState = idState;
	}

	@Override
	public String toString() {
		return "Command [id=" + id + ", totalQte=" + totalQte + ", description=" + description + ", buyerCin="
				+ buyerCin + ", buyerAdress=" + buyerAdress + ", buyerName=" + buyerName + ", totalPrice=" + totalPrice
				+ ", adminIsPayed=" + adminIsPayed + ", deliveryManIsPayed=" + deliveryManIsPayed + ", idProduct="
				+ idProduct + ", idTeamMember=" + idTeamMember + ", idDeliveryMan=" + idDeliveryMan + ", idState="
				+ idState + "]";
	}
}
