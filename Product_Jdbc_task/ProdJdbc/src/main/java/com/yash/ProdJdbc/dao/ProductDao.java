package com.yash.ProdJdbc.dao;

import java.util.List;

import com.yash.ProdJdbc.entities.Product;

public interface ProductDao {
	public int insertProduct(Product p);
	public int updateProduct(Product p);
	public int deleteProduct(int pid);
	public Product getProdById(int pid);
	public List<Product> getAllProd();
}
