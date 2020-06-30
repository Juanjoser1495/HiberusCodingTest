package com.hiberus.test.billService.entites;

public class BillServiceResponse
{
	private boolean costProcesed;
	private String message;
	private double productsCost;

	public BillServiceResponse()
	{
		super();
	}

	public BillServiceResponse(boolean costProcesed, String message, double productsCost)
	{
		super();
		this.costProcesed = costProcesed;
		this.message = message;
		this.productsCost = productsCost;
	}

	public boolean isCostProcesed()
	{
		return costProcesed;
	}

	public void setCostProcesed(boolean costProcesed)
	{
		this.costProcesed = costProcesed;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public double getProductsCost()
	{
		return productsCost;
	}

	public void setProductsCost(double productsCost)
	{
		this.productsCost = productsCost;
	}
}
