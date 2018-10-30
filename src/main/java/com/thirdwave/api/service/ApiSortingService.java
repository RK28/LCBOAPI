package com.thirdwave.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thirdwave.api.model.Product;
import com.thirdwave.api.service.contracts.IApiSortingService;

@Service
public class ApiSortingService implements IApiSortingService {

	@Override
	public List<Product> buildServiceResponse(List<Product> products,String usr) {

		/*List<Product> redlist = new ArrayList<Product>();
		List<Product> whitelist = new ArrayList<Product>();
		List<Product> mergeList = new ArrayList<Product>();

		System.out.println(usr);
		
		
		for (Product product : products) {
			if("Grant".equalsIgnoreCase(usr)&&Double.compare(Double.parseDouble(product.getPrice_in_cents()), Double.valueOf(20.0)) > 0 ) {
				
					System.out.println(product.getSecondary_category());
					if ("White Wine".equalsIgnoreCase(product.getSecondary_category())) {
						whitelist.add(product);

					} else if ("Red Wine".equalsIgnoreCase(product.getSecondary_category())) {
						redlist.add(product);
					}
				
			}else if("David".equalsIgnoreCase(usr)&&Double.compare(Double.parseDouble(product.getPrice_in_cents()), Double.valueOf(20.0)) < 0 ) {
					if ("White Wine".equalsIgnoreCase(product.getSecondary_category())) {
						whitelist.add(product);

					} else if ("Red Wine".equalsIgnoreCase(product.getSecondary_category())) {
						redlist.add(product);
					}
				
			}
			
			
		}

		mergeList.addAll(redlist);
		mergeList.addAll(whitelist);
		System.out.println(mergeList.size());*/
		return products;
	}


}
