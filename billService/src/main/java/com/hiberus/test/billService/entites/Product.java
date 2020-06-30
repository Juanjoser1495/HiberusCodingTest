package com.hiberus.test.billService.entites;

import java.io.Serializable;

public class Product implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int quantity;
	private double cost;
	
	public Product() {
		super();
	}
	
	public Product(int id, int quantity, double cost)
	{
		super();
		this.id = id;
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}
}
