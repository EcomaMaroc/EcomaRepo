package com.ecoma.api.EcomaPrj.Models;

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
	private double Qte;
	private String Description;
	private String BuyerCin;
	private String BuyerAdress;
	private String BuyerName;
	private double Price;
	private boolean AdminIsPayed;
	private boolean DeliveryManIsPayed;
	@DBRef
	private Product Product;
	@DBRef
	private TeamMember TeamMember;
	@DBRef
	private DeliveryMan DeliveryMan;
	@DBRef
	private State State;
	
	public Command() {
		
	}

	public Command(long id, double qte, String description, String buyerCin, String buyerAdress, String buyerName,
			double price, boolean adminIsPayed, boolean deliveryManIsPayed, Product product, TeamMember teamMember,
			DeliveryMan deliveryMan, State state) {
		super();
		this.id = id;
		Qte = qte;
		Description = description;
		BuyerCin = buyerCin;
		BuyerAdress = buyerAdress;
		BuyerName = buyerName;
		Price = price;
		AdminIsPayed = adminIsPayed;
		DeliveryManIsPayed = deliveryManIsPayed;
		Product = product;
		TeamMember = teamMember;
		DeliveryMan = deliveryMan;
		State = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getQte() {
		return Qte;
	}

	public void setQte(double qte) {
		Qte = qte;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getBuyerCin() {
		return BuyerCin;
	}

	public void setBuyerCin(String buyerCin) {
		BuyerCin = buyerCin;
	}

	public String getBuyerAdress() {
		return BuyerAdress;
	}

	public void setBuyerAdress(String buyerAdress) {
		BuyerAdress = buyerAdress;
	}

	public String getBuyerName() {
		return BuyerName;
	}

	public void setBuyerName(String buyerName) {
		BuyerName = buyerName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public boolean isAdminIsPayed() {
		return AdminIsPayed;
	}

	public void setAdminIsPayed(boolean adminIsPayed) {
		AdminIsPayed = adminIsPayed;
	}

	public boolean isDeliveryManIsPayed() {
		return DeliveryManIsPayed;
	}

	public void setDeliveryManIsPayed(boolean deliveryManIsPayed) {
		DeliveryManIsPayed = deliveryManIsPayed;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product product) {
		Product = product;
	}

	public TeamMember getTeamMember() {
		return TeamMember;
	}

	public void setTeamMember(TeamMember teamMember) {
		TeamMember = teamMember;
	}

	public DeliveryMan getDeliveryMan() {
		return DeliveryMan;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		DeliveryMan = deliveryMan;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Command [id=" + id + ", Qte=" + Qte + ", Description=" + Description + ", BuyerCin=" + BuyerCin
				+ ", BuyerAdress=" + BuyerAdress + ", BuyerName=" + BuyerName + ", Price=" + Price + ", AdminIsPayed="
				+ AdminIsPayed + ", DeliveryManIsPayed=" + DeliveryManIsPayed + ", Product=" + Product + ", TeamMember="
				+ TeamMember + ", DeliveryMan=" + DeliveryMan + ", State=" + State + "]";
	}
	
	

}
