package com.ty.product.controller;

import java.util.List;

import com.ty.product.dto.Product;
import com.ty.product.service.ProductService;

public class GetProductByName {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();

		Product product = productService.getProductByName("Shirt");
		if (product != null) {
			System.out.println("Id is :" + product.getId());
			System.out.println("name is:" + product.getName());
			System.out.println("brand is :" + product.getBrand());
			System.out.println("price is :" + product.getPrice());
			System.out.println("type is :" + product.getType());
			System.out.println("size is :" + product.getSize());
			System.out.println("rating is :" + product.getRating());
		} else {
			System.out.println("product not found");
		}

	}

}
