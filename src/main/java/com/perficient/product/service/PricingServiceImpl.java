package com.perficient.product.service;

import java.math.BigDecimal;

public class PricingServiceImpl {

	public BigDecimal getPrice(Long productId) {
		
		if (productId == null) {
			throw new IllegalArgumentException("productId can not be null");
		}
		
		return new BigDecimal("25.00");
	}

}
