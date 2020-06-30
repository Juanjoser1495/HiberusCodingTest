package com.hiberus.test.checkout.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hiberus.test.checkout.entities.CheckoutResponse;
import com.hiberus.test.checkout.entities.Order;
import com.hiberus.test.checkout.service.BillService;
import com.hiberus.test.checkout.service.LogisticService;

@RestController
@Controller
public class CheckoutController
{	
	@Autowired
	public BillService billService;

	@Autowired
	public LogisticService logisticService;

	@PostMapping("/proccessOrder")
	public CheckoutResponse proccesOrder(@RequestBody Order order) throws JsonProcessingException
	{
		CheckoutResponse response = new CheckoutResponse(false, "Order not proccessed");
		if (order != null)
		{
			double priceProducts = billService.getPriceProducts(order.getProducts());

			HashMap<String, Object> responseLogistic = logisticService.createOrder(order, priceProducts);
			if (responseLogistic.get("isCreated") != null
					&& new Boolean(responseLogistic.get("isCreated").toString()).booleanValue() == true)
			{
				return response = new CheckoutResponse(true, "Order proccesed succesfull",
						responseLogistic.get("pathOrder").toString());
			}
			else
			{
				return response = new CheckoutResponse(true, "Order is not proccesed succesfull");
			}
		}
		else
		{
			response = new CheckoutResponse(false, "Order null");
		}

		return response;
	}
}
