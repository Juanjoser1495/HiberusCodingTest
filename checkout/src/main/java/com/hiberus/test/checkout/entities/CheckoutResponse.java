package com.hiberus.test.checkout.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

public class CheckoutResponse
{
	private boolean orderProcesed;
	private String message;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String path;
	
	public CheckoutResponse() {
		super();
	}

	public CheckoutResponse(boolean orderProcesed, String message)
	{
		super();
		this.orderProcesed = orderProcesed;
		this.message = message;
	}
	
	public CheckoutResponse(boolean orderProcesed, String message, String path)
	{
		super();
		this.orderProcesed = orderProcesed;
		this.message = message;
		this.path = path;
	}

	public boolean isOrderProcesed()
	{
		return orderProcesed;
	}

	public void setOrderProcesed(boolean orderProcesed)
	{
		this.orderProcesed = orderProcesed;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}
}
