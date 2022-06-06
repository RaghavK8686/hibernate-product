package com.ty.product.controller;

import java.util.List;

import com.ty.product.dto.Product;
import com.ty.product.service.ProductService;

public class GetAllProductsController {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		List<Product> list=productService.getAllProducts();
		for(Product e:list)
		{
			System.out.println("Id is:"+e.getId());
			System.out.println("Name is :"+e.getName());
			System.out.println("Brand is :"+e.getBrand());
			System.out.println("Price is :"+e.getPrice());
			System.out.println("Type is :"+e.getPrice());
			System.out.println("Size is :"+e.getSize());
			System.out.println("Rating is :"+e.getRating());
			System.out.println("**********************");
		}

	}

}
