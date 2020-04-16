package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author k.bhf
 */

@Document(collection = "product")
public class Product {

	@Id
    private long id;
	private String Name;
	private double Qte;
	private double BuyingPrice;
	private double SallingPrice;
	private double CorruptPcs;
	private double QteBuyed;
	private double QteSaled;
	private String Description;
	@DBRef
	private Category Category;
	@DBRef
	private Provider Provider;
	@DBRef
	private Color Color;
	@DBRef
	private Size Size;
	@DBRef
	private State State;
	
	public Product() {
		
	}
	public Product(long id, String name, double qte, double buyingPrice, double sallingPrice, double corruptPcs, double qteBuyed,
			double qteSaled, String description, Category category, Provider provider,Color color, Size size, State state) {
		super();
		this.id = id;
		this.Name = name;
		this.Qte=qte;
		this.BuyingPrice = buyingPrice;
		this.SallingPrice = sallingPrice;
		this.CorruptPcs = corruptPcs;
		this.QteBuyed = qteBuyed;
		this.QteSaled = qteSaled;
		this.Description = description;
		this.Category = category;
		this.Provider = provider;
		this.Color = color;
		this.Size = size;
		this.State = state;
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
	
	public double getQte() {
		return Qte;
	}

	public void setQte(double qte) {
		Qte = qte;
	}

	public double getBuyingPrice() {
		return BuyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		BuyingPrice = buyingPrice;
	}

	public double getSallingPrice() {
		return SallingPrice;
	}

	public void setSallingPrice(double sallingPrice) {
		SallingPrice = sallingPrice;
	}

	public double getCorruptPcs() {
		return CorruptPcs;
	}

	public void setCorruptPcs(double corruptPcs) {
		CorruptPcs = corruptPcs;
	}

	public double getQteBuyed() {
		return QteBuyed;
	}

	public void setQteBuyed(double qteBuyed) {
		QteBuyed = qteBuyed;
	}

	public double getQteSaled() {
		return QteSaled;
	}

	public void setQteSaled(double qteSaled) {
		QteSaled = qteSaled;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Category getCategory() {
		return Category;
	}

	public void setCategory(Category category) {
		Category = category;
	}

	public Provider getProvider() {
		return Provider;
	}

	public void setProvider(Provider provider) {
		Provider = provider;
	}

	public Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}

	public Size getSize() {
		return Size;
	}

	public void setSize(Size size) {
		Size = size;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", BuyingPrice=" + BuyingPrice + ", SallingPrice="
				+ SallingPrice + ", CorruptPcs=" + CorruptPcs + ", QteBuyed=" + QteBuyed + ", QteSaled=" + QteSaled
				+ ", Description=" + Description + ", Category=" + Category + ", Provider=" + Provider + ", Color="
				+ Color + ", Size=" + Size + ", State=" + State + "]";
	}
	
}
