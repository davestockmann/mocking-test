package com.perficient.product.service;

public class ServiceLocator {

	public static PricingServiceImpl getPricingService() {
		return new PricingServiceImpl();
	}
	
	public static ProductServiceImpl getProductService() {
		return new ProductServiceImpl(getPricingService());
	}
}
