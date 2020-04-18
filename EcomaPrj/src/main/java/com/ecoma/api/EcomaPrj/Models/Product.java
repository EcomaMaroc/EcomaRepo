package com.ecoma.api.EcomaPrj.Models;

import java.util.List;

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
	private String name;
	private double qte;
	private double buyingPrice;
	private double sallingPrice;
	private double corruptPcs;
	private double qteBuyed;
	private double qteSaled;
	private String description;
	private List<Long> idCategory;
	private List<Long> idProvider;
	private List<Long> idColor;
	private List<Long> idSize;
	private List<Long> idState;
	
	public Product() {
		
	}
	public Product(long id, String name, double qte, double buyingPrice, double sallingPrice, double corruptPcs, double qteBuyed,
			double qteSaled, String description, List<Long> idcategory, List<Long> idprovider,List<Long> idcolor, List<Long> idsize, List<Long> idstate) {
		super();
		this.id = id;
		this.name = name;
		this.qte=qte;
		this.buyingPrice = buyingPrice;
		this.sallingPrice = sallingPrice;
		this.corruptPcs = corruptPcs;
		this.qteBuyed = qteBuyed;
		this.qteSaled = qteSaled;
		this.description = description;
		this.idCategory = idcategory;
		this.idProvider = idprovider;
		this.idColor = idcolor;
		this.idSize = idsize;
		this.idState = idstate;
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
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	public double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public double getSallingPrice() {
		return sallingPrice;
	}
	public void setSallingPrice(double sallingPrice) {
		this.sallingPrice = sallingPrice;
	}
	public double getCorruptPcs() {
		return corruptPcs;
	}
	public void setCorruptPcs(double corruptPcs) {
		this.corruptPcs = corruptPcs;
	}
	public double getQteBuyed() {
		return qteBuyed;
	}
	public void setQteBuyed(double qteBuyed) {
		this.qteBuyed = qteBuyed;
	}
	public double getQteSaled() {
		return qteSaled;
	}
	public void setQteSaled(double qteSaled) {
		this.qteSaled = qteSaled;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Long> getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(List<Long> idCategory) {
		this.idCategory = idCategory;
	}
	public List<Long> getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(List<Long> idProvider) {
		this.idProvider = idProvider;
	}
	public List<Long> getIdColor() {
		return idColor;
	}
	public void setIdColor(List<Long> idColor) {
		this.idColor = idColor;
	}
	public List<Long> getIdSize() {
		return idSize;
	}
	public void setIdSize(List<Long> idSize) {
		this.idSize = idSize;
	}
	public List<Long> getIdState() {
		return idState;
	}
	public void setIdState(List<Long> idState) {
		this.idState = idState;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qte=" + qte + ", buyingPrice=" + buyingPrice
				+ ", sallingPrice=" + sallingPrice + ", corruptPcs=" + corruptPcs + ", qteBuyed=" + qteBuyed
				+ ", qteSaled=" + qteSaled + ", description=" + description + ", idCategory=" + idCategory
				+ ", idProvider=" + idProvider + ", idColor=" + idColor + ", idSize=" + idSize + ", idState=" + idState
				+ "]";
	}
}
