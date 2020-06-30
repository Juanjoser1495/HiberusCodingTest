package com.hiberus.test.billService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hiberus.test.billService.entites.BillServiceResponse;
import com.hiberus.test.billService.entites.Product;
import com.hiberus.test.billService.service.BillService;

@RestController
@Controller
public class BillServiceController
{
	@Autowired
	public BillService billService;

	@PostMapping("/getPriceProducts")
	public BillServiceResponse getPriceProducts(@RequestBody List<Product> products)
			throws JsonMappingException, JsonProcessingException
	{
		BillServiceResponse response = new BillServiceResponse(false, "Products price not procesed", 0);

		if (products != null)
		{
			return response = new BillServiceResponse(true, "Products price procesed",
					billService.getPrice(products));
		}

		return response;
	}
}
