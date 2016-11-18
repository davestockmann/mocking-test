package com.perficient.product.service;

import java.math.BigDecimal;

public class SomeOtherService {

	
	public BigDecimal getPrice(Long id) {
		ProductServiceImpl productService = ServiceLocator.getProductService();
		
		return productService.findPrice(id);
	}
}
