package com.hiberus.test.logistic.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.test.logistic.entities.LogisticResponse;
import com.hiberus.test.logistic.entities.Order;
import com.hiberus.test.logistic.service.LogisticService;

@RestController
public class LogisticController
{
	@Autowired
	private LogisticService logisticService;

	@PostMapping("/createOrder")
	public LogisticResponse createOrder(@RequestHeader("priceTotal") String priceTotal, @RequestBody Order order)
	{
		LogisticResponse response = new LogisticResponse(false, "Order not created", "");
		Double priceTotalD = Double.parseDouble(priceTotal);
		
		if (order != null && priceTotalD >= 0)
		{
			HashMap<String, Object> responseOrder = logisticService.createOrder(order, priceTotalD);

			if (responseOrder.get("isOrderCreated") != null
					&& new Boolean(responseOrder.get("isOrderCreated").toString()).booleanValue() == true)
			{
				response = new LogisticResponse(true, "Order Succesfull", responseOrder.get("path").toString());
			}
			else
			{
				response = new LogisticResponse(false, "Order not created", "");
			}
		}

		return response;
	}
}
