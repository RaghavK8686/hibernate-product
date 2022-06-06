package com.ty.product.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.product.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product saveProduct(Product product) {

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;
	}

	public Product getProductById(int id) {
		Product product = entityManager.find(Product.class, id);

		if (product != null) {
			return product;

		} else {
			return null;
		}
	}

	public Product validateProduct(String brand, String name) {
		String sql = "select product from Product product where product.brand=?1 and product.name=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, brand);
		query.setParameter(2, name);

		List<Product> list = query.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		} else
			return null;
	}

	public List<Product> getAllProducts() {
		String sql = "select product from Product product ";
		Query query = entityManager.createQuery(sql);
		List<Product> list = query.getResultList();
		if (list != null)
			return list;
		else
			return null;
	}

	public int deleteProductById(int id) {
		String sql = "select p from Product p where p.id=?1";
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
		}
		return id;
	}

	public Product updateProductById(Product product, int id) {
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;
	}

	public Product getProductByName(String name) {

		Product list = entityManager.find(Product.class, name);
		if (list != null) {
			return list;
		} else
			return null;
	}

	public Product getProductByBrand(String brand) {
		Product list = entityManager.find(Product.class, brand);
		if (list != null) {
			return list;
		} else
			return null;
	}

	public Product getProductByPrice(double price) {
		Product product = entityManager.find(Product.class, price);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public List<Product> getProductByType(String type) {
		Product product = entityManager.find(Product.class, type);
		if (product != null) {
			return null;
		} else
			return null;

	}

	public List<Product> getProductBySize(String size) {
		String sql = "select product from Product product where size=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, size);

		List<Product> product1 = query.getResultList();

		if (product1 != null) {
			return product1;

		} else {
			return null;
		}
	}

	public Product getProductByRating(String rating) {

		Product product = entityManager.find(Product.class, rating);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public Product getProductByRating(int rating) {
		Product product = entityManager.find(Product.class, rating);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}
}
