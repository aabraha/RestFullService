package com.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mailling-address")
public class MailingAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String address_1;
	private String address_2;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	
	public MailingAddress() {
		
	}

	public MailingAddress(String address_1, String address_2, String city, String state, int zipCode, String country) {
		super();
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "MaillingAddress [id=" + id + ", address_1=" + address_1 + ", address_2=" + address_2 + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
}
