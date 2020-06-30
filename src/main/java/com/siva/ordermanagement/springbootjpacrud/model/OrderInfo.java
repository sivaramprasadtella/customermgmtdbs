package com.siva.ordermanagement.springbootjpacrud.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "orderinfo")
public class OrderInfo {

	@Id
	private long id;
	private String customerName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	@Embedded
	private Address address;
	
	
	@OneToMany
	(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY,
    mappedBy = "itemInfoNumber")
	private List<ItemInfo> items;
	
	
	public OrderInfo() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Address getAddress() {
		return address;
	}

	protected void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
