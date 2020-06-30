package com.hiberus.test.billService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiberus.test.billService.entites.Product;

@Service
public class BillService
{
	public double getPrice(List<Product> products)
	{
		double priceProducts = 0;

		if (!products.isEmpty())
		{
			for (Product product : products)
			{
				priceProducts += product.getCost() * product.getQuantity();
			}
		}

		return priceProducts;
	}
}
