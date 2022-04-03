package com.cg.shopping.productservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.shopping.productservice.entity.Product;

public interface ProductService {

	public void addProduct(Product product);

	public List<Product> getAllProducts();

	public Optional<Product> getProductById(int productId);

	public Optional<Product> getProductByName(String productName);

	public Product updateProducts(Product product);

	public void deleteProductById(int productId);

	public List<Product> getProductByCategory(String category);

	public List<Product> getProductByType(String productType);
}
