package com.hiberus.test.logistic.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.hiberus.test.logistic.entities.Order;
import com.hiberus.test.logistic.entities.Product;
import com.hiberus.test.logistic.entities.SentOrder;

@Service
public class LogisticService
{

	public HashMap<String, Object> createOrder(Order order, double priceTotal)
	{
		HashMap<String, Object> responseMap = new HashMap<String, Object>();

		try
		{

			SentOrder sentOrder = new SentOrder(Math.random(), order.getClientId(), order.getAddress(), 1234567,
					order.getProducts(), priceTotal, new Date(), order.getDate());

			String pathOrder = "/usr/local/tomcat/order/" + sentOrder.getIdClient() + ".txt";
			FileWriter flwriter = new FileWriter(pathOrder);

			BufferedWriter bfwriter = new BufferedWriter(flwriter);

			bfwriter.write("Id Order: " + sentOrder.getIdOrder() + "\n");
			bfwriter.write("Id Client: " + sentOrder.getIdClient() + "\n");
			bfwriter.write("Addres to send: " + sentOrder.getAddress() + "\n");
			bfwriter.write("Products to Send" + "\n");
			for (Product product : sentOrder.getProducts())
			{
				bfwriter.write("Id Product: " + product.getId() + " Quantiy: " + product.getQuantity() + " Unit cost: "
						+ product.getCost() + "\n");
			}
			bfwriter.write("Total: " + sentOrder.getTotal() + "\n");
			bfwriter.write("Company Phone: " + sentOrder.getCompanyPhone() + "\n");
			bfwriter.close();
			responseMap.put("isOrderCreated", true);
			responseMap.put("path", pathOrder);

		}
		catch (Exception e)
		{
			responseMap.put("isOrderCreated", false);
		}
		;
		return responseMap;
	}
}
