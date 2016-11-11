package com.perficient.product.service;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PricingServiceImplTest {

	@Mock
	private PricingServiceImpl priceServiceMock;

	@Test
	public void findProduct() {
		Long productId = Long.getLong("39933");
		BigDecimal expectedPrice = new BigDecimal(199.99);

		ArgumentCaptor<Long> productIdCaptor = ArgumentCaptor.forClass(Long.class);
		when(priceServiceMock.getPrice(productIdCaptor.capture())).thenReturn(expectedPrice);

		ProductServiceImpl productService = new ProductServiceImpl(priceServiceMock);
		BigDecimal price = productService.findPrice(productId);

		Assertions.assertThat(price).isEqualTo(expectedPrice);
		Assertions.assertThat(productIdCaptor.getValue()).isEqualTo(productId);
	}

	@Test(expected = IllegalArgumentException.class)
	public void findProduct_ExpectsException() {
		Long productId = null;
		BigDecimal expectedPrice = new BigDecimal(199.99);

		when(priceServiceMock.getPrice(productId)).thenThrow(IllegalArgumentException.class);

		ProductServiceImpl productService = new ProductServiceImpl(priceServiceMock);
		BigDecimal price = productService.findPrice(productId);

	}

}
