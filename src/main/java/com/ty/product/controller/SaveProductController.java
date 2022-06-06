package com.ty.product.controller;

import com.ty.product.dao.ProductDao;

import com.ty.product.dto.Product;
import com.ty.product.service.ProductService;

public class SaveProductController {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("TV");
		product.setBrand("Xaomi");
		product.setPrice(3000.00);
		product.setType("LCD");
		product.setSize("40");
		product.setRating(4);
		product.setDescription("Best quality Product");

		ProductService productService=new ProductService();
		Product res = productService.saveProduct(product);
		if (res != null) {
			System.out.println("data inserted");
		} else {
			System.out.println("data not inserted");
		}
	}

}
