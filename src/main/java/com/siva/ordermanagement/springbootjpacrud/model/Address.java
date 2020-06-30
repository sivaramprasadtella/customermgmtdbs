package com.siva.ordermanagement.springbootjpacrud.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String streetName;
	private String townName;
	private String zipCode;
	protected String getStreetName() {
		return streetName;
	}
	protected void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	protected String getTownName() {
		return townName;
	}
	protected void setTownName(String townName) {
		this.townName = townName;
	}
	protected String getZipCode() {
		return zipCode;
	}
	protected void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
