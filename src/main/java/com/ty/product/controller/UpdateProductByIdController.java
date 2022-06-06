package com.ty.product.controller;

import com.ty.product.dao.ProductDao;
import com.ty.product.dto.Product;

public class UpdateProductByIdController {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Dell");
		product.setBrand("DELL");
		product.setPrice(50000.00);
		product.setType("Foldable");
		product.setSize("90cms");
		product.setRating(5);
		product.setDescription("Very good performance");

		ProductDao productDao = new ProductDao();
		Product res = productDao.updateProductById(product, 1);
		if (res != null) {
			System.out.println("data updated");
		} else {
			System.out.println("data not inserted");
		}

	}

}
