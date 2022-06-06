package com.ty.product.service;

import java.util.List;



import javax.crypto.SecretKey;
import javax.persistence.EntityManager;

import com.ty.product.dao.ProductDao;
import com.ty.product.dto.Product;
import com.ty.product.util.AES;

import static com.ty.product.util.ProductConstants.*;

public class ProductService {

	ProductDao productDao = new ProductDao();
	Product product = new Product();

	public Product saveProduct(Product product) {
		String encName=AES.encrypt(product.getName(), SECRET_KEY);
		String encBrand=AES.encrypt(product.getBrand(), SECRET_KEY);
		product.setName(encName);
		product.setBrand(encBrand);
		return productDao.saveProduct(product);
	}

	public Product getProductById(int id) {
		Product product=productDao.getProductById(id);
		String decName=AES.encrypt(product.getName(), SECRET_KEY);
		String decBrand=AES.encrypt(product.getBrand(), SECRET_KEY);
		product.setName(decName);
		product.setBrand(decBrand);
		
		return productDao.getProductById(id);
	}

	public Product validateProduct(String brand, String name) {
		String encName=AES.encrypt(name, SECRET_KEY);
		String encBrand=AES.encrypt(brand, SECRET_KEY);
		
		return productDao.validateProduct(encBrand, encName);
	}

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public int deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

	public Product updateProductById(int id) {
		return productDao.updateProductById(product, id);
	}

	public Product getProductByName(String name) {
		return productDao.getProductByName(name);
	}

	public Product getProductByBrand(String brand) {
		return productDao.getProductByBrand(brand);
	}

	public Product getProductByPrice(double price) {
		return productDao.getProductByPrice(price);
	}

	public List<Product> getProductByType(String type) {
		return productDao.getProductByType(type);
	}

	public List<Product> getProductBySize(String size) {
		return productDao.getProductBySize(size);
	}

	public Product getProductByRating(String string) {
		return productDao.getProductByRating(string);
	}
}

