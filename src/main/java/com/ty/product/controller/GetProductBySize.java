package com.ty.product.controller;

import java.util.List;


import com.ty.product.dto.Product;
import com.ty.product.service.ProductService;

public class GetProductBySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService = new ProductService();

		List<Product> products1 = productService.getProductBySize("10");
		
		if (products1.size() >0) {
			for(Product products:products1) {
			System.out.println("Id is :" + products.getId());
			System.out.println("name is:" + products.getName());
			System.out.println("brand is :" + products.getBrand());
			System.out.println("price is :" + products.getPrice());
			System.out.println("type is :" + products.getType());
			System.out.println("size is :" + products.getSize());
			System.out.println("rating is :" + products.getRating());
			}
		} else {
			System.out.println("product not found");
		}
	}

}
