package com.hiberus.test.logistic.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LogisticResponse
{
	private boolean orderCreated;
	private String message;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String pathOrder;
	
	public LogisticResponse() {
		super();
	}

	public LogisticResponse(boolean orderCreated, String message, String pathOrder)
	{
		super();
		this.orderCreated = orderCreated;
		this.message = message;
		this.pathOrder = pathOrder;
	}

	public boolean isOrderCreated()
	{
		return orderCreated;
	}

	public void setOrderCreated(boolean orderCreated)
	{
		this.orderCreated = orderCreated;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getPathOrder()
	{
		return pathOrder;
	}

	public void setPathOrder(String pathOrder)
	{
		this.pathOrder = pathOrder;
	}
}
