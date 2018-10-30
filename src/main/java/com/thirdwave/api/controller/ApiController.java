package com.thirdwave.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.thirdwave.api.model.Products;
import com.thirdwave.api.service.ApiSortingService;

@Controller
public class ApiController {

	@Autowired
	ApiSortingService sortService;

	@RequestMapping(value = "productSrch/{userId}", method = RequestMethod.GET)
	public String getProduct(@PathVariable String userId, Model model) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("x-access-key",
				"MDo4NDVhNjhiYy1kN2YzLTExZTgtYWU0Yi05ZjVhNTM2NDM5MDQ6WFp6QlYzQ2hZT2VtUE5GQXFaTzdTMDZ1aUlnWHBQOWdSNUtw"));
		if ("Grant".equalsIgnoreCase(userId)) {
			Products _products = restTemplate.getForObject("https://lcboapi.com/stores/643/products?order=price_in_cents.desc&per_page=100&q=Wine", Products.class);
			model.addAttribute("products",sortService.buildServiceResponse(_products.getResult(),userId));
		} else if ("David".equalsIgnoreCase(userId)) {
			Products _products = restTemplate.getForObject("https://lcboapi.com/stores/643/products?order=price_in_cents.asc&per_page=100&q=Wine", Products.class);
			model.addAttribute("products", sortService.buildServiceResponse(_products.getResult(),userId));
		}

		return "products";
	}
}
