package com.perficient.product.service;

import java.math.BigDecimal;

public class ProductServiceImpl {
	
	private PricingServiceImpl pricingService;
	
	public ProductServiceImpl(PricingServiceImpl pricingService) {
		this.pricingService = pricingService;
	}
	
	public BigDecimal findPrice(Long productId) {
		
		return pricingService.getPrice(productId);
	}

}
