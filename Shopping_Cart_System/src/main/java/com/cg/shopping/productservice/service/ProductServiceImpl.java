package com.cg.shopping.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.shopping.productservice.entity.Product;
import com.cg.shopping.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		return productRepository.findById(productId);
	}

	@Override
	public Optional<Product> getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}

	@Override
	public Product updateProducts(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> getProductByType(String productType) {
		return productRepository.findByProductType(productType);
	}

}
