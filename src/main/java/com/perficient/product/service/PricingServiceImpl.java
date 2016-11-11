package com.perficient.product.service;

import java.math.BigDecimal;

public class PricingServiceImpl {

	public BigDecimal getPrice(Long productId) {
		return new BigDecimal("25.00");
	}

}
