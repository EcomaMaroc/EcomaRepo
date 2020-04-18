package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author k.bhf
 */
@Document(collection = "person")
public class Person {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String picture;
    private String password;
    private String adress;
    private int age;
    private String cin;

    public Person() {
    }

	public Person(long id, String firstName, String lastName, String phone, String email, String picture,
			String password, String adress, int age, String cin) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.picture = picture;
		this.password = password;
		this.adress = adress;
		this.age = age;
		this.cin = cin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", picture=" + picture + ", password=" + password + ", adress=" + adress
				+ ", age=" + age + ", cin=" + cin + "]";
	}    
}
