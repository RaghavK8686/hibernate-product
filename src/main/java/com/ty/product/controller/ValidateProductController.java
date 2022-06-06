package com.ty.product.controller;

import com.ty.product.dto.Product;
import com.ty.product.service.ProductService;

public class ValidateProductController {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		Product product = productService.validateProduct("Xaomi","TV");
		if (product != null) {
			System.out.println("validated");
		} else {
			System.out.println("Product not Found");
		}

	}

}
