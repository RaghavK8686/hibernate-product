package com.ty.product.controller;

import com.ty.product.service.ProductService;

public class DeleteProductByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService userService=new ProductService();
		userService.deleteProductById(2);
	}

}
