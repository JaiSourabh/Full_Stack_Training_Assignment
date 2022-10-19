package com.yash.pms.dao;

import com.yash.pms.exception.ProductAlreadyException;
import com.yash.pms.exception.ProductNotFoundException;
import com.yash.pms.model.Product;

public interface ProductDao {
	public void addProduct(Product p) throws ProductAlreadyException;
	public void deleteProduct(int id) throws ProductNotFoundException;
	public Product[] getAllProducts();
	public Product updateProduct(int id,Product p);
	public Product getProductById(int id);
	
}
