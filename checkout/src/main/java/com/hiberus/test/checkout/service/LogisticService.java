package com.hiberus.test.checkout.service;

import java.util.HashMap;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiberus.test.checkout.entities.LogisticServiceResponse;
import com.hiberus.test.checkout.entities.Order;

@Service
public class LogisticService
{
	public HashMap<String, Object> createOrder(Order order, double priceTotal) throws JsonProcessingException
	{
		HashMap<String, Object> orderCreated = new HashMap<>();

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("priceTotal", Double.toString(priceTotal));
		
	

		String jsonEntity = new ObjectMapper().writeValueAsString(order);

		HttpEntity<String> entity = new HttpEntity<String>(jsonEntity, headers);

		ResponseEntity<LogisticServiceResponse> result = restTemplate.exchange("http://logisticservice:8080/Logistic/createOrder",
				HttpMethod.POST, entity, LogisticServiceResponse.class);

		if (result.getStatusCode().is2xxSuccessful() && result.getBody().isOrderCreated())
		{
			orderCreated.put("isCreated", true);
			orderCreated.put("pathOrder", result.getBody().getPathOrder());
		}
		else
		{
			orderCreated.put("isCreated", false);
		}

		return orderCreated;
	}
}
