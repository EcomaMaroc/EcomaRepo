package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author k.bhf
 */
@Document(collection = "person")
public class Person {
    @Id
    private int id;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Email;
    private String Picture;
    private String Password;
    private String Adress;
    private int Age;
    private String Cin;

    public Person() {
    }

	public Person(int id, String firstName, String lastName, String phone, String email, String picture,
			String password, String adress, int age, String cin) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Phone = phone;
		this.Email = email;
		this.Picture = picture;
		this.Password = password;
		this.Adress = adress;
		this.Age = age;
		this.Cin = cin;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCin() {
		return Cin;
	}

	public void setCin(String cin) {
		Cin = cin;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone
				+ ", Email=" + Email + ", Picture=" + Picture + ", Password=" + Password + ", Adress=" + Adress
				+ ", Age=" + Age + ", Cin=" + Cin + "]";
	}
    
}
