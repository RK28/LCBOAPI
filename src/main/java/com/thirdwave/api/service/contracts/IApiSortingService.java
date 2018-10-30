package com.thirdwave.api.service.contracts;

import java.util.List;

import com.thirdwave.api.model.Product;

public interface IApiSortingService {

	List<Product> buildServiceResponse(List<Product> products,String priceFilter);
}
