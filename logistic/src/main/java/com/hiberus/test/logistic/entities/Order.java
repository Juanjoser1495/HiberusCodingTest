package com.hiberus.test.logistic.entities;

import java.util.Date;
import java.util.List;

public class Order
{
	private int clientId;
	private Date date;
	private String address;
	private List<Product> products;
	
	public Order() {
		super();
	}

	public Order(int clientId, Date date, String address, List<Product> products)
	{
		super();
		this.clientId = clientId;
		this.date = date;
		this.address = address;
		this.products = products;
	}

	public int getClientId()
	{
		return clientId;
	}

	public void setClientId(int clientId)
	{
		this.clientId = clientId;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(List<Product> products)
	{
		this.products = products;
	}
}
