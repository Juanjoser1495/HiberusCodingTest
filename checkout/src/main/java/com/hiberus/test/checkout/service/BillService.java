package com.hiberus.test.checkout.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiberus.test.checkout.entities.BillServiceResponse;
import com.hiberus.test.checkout.entities.Product;

@Service
public class BillService
{
	public double getPriceProducts(List<Product> products) throws JsonProcessingException
	{
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String json = null;

		json = new ObjectMapper().writeValueAsString(products);

		HttpEntity<String> entity = new HttpEntity<String>(json, headers);

		ResponseEntity<BillServiceResponse> result = restTemplate.exchange("http://billservice:8080/BillService/getPriceProducts", HttpMethod.POST, entity, BillServiceResponse.class);
		
		return result.getBody().getProductsCost();
	}
}
