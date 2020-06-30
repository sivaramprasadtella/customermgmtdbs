package com.siva.ordermanagement.springbootjpacrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iteminfo")
public class ItemInfo {

	
	@Id
	private int itemInfoNumber;
	private String productCode;
	private String productName;
	private int quantity;
	
	protected String getProductCode() {
		return productCode;
	}
	protected void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	protected String getProductName() {
		return productName;
	}
	protected void setProductName(String productName) {
		this.productName = productName;
	}
	protected int getQuantity() {
		return quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
