package com.hiberus.test.logistic.entities;

import java.util.Date;
import java.util.List;

public class SentOrder
{
	private double idOrder;
	private int idClient;
	private String address;
	private int companyPhone = 1234567; 
	private List<Product> products;
	private double total;
	private Date sendDateOrder;
	private Date dateOrder;
	
	public SentOrder() {
		super();
	}

	public SentOrder(double idOrder, int idClient, String address, int companyPhone, List<Product> products, double total,
			Date sendDateOrder, Date dateOrder)
	{
		super();
		this.idOrder = idOrder;
		this.idClient = idClient;
		this.address = address;
		this.companyPhone = companyPhone;
		this.products = products;
		this.total = total;
		this.sendDateOrder = sendDateOrder;
		this.dateOrder = dateOrder;
	}

	public double getIdOrder()
	{
		return idOrder;
	}

	public void setIdOrder(double idOrder)
	{
		this.idOrder = idOrder;
	}

	public int getIdClient()
	{
		return idClient;
	}

	public void setIdClient(int idClient)
	{
		this.idClient = idClient;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getCompanyPhone()
	{
		return companyPhone;
	}

	public void setCompanyPhone(int companyPhone)
	{
		this.companyPhone = companyPhone;
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(List<Product> products)
	{
		this.products = products;
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}

	public Date getSendDateOrder()
	{
		return sendDateOrder;
	}

	public void setSendDateOrder(Date sendDateOrder)
	{
		this.sendDateOrder = sendDateOrder;
	}

	public Date getDateOrder()
	{
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder)
	{
		this.dateOrder = dateOrder;
	}
}

