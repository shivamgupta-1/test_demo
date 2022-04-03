package com.cg.shopping.productservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.shopping.productservice.entity.Product;
import com.cg.shopping.productservice.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	ProductResource() {
	}

	@PostMapping("/add")
	public void addProducts(Product product) {
		productServiceImpl.addProduct(product);
	}

	@GetMapping("/all")
	public ResponseEntity<List> getAllProducts() {
		productServiceImpl.getAllProducts();
		return null;
	}

	@GetMapping("/find/{productId}")
	public ResponseEntity<List> getProductById(@PathVariable int productId) {
		productServiceImpl.getProductById(productId);
		return null;
	}

	@GetMapping("/type/{productType}")
	public ResponseEntity<List> getProductByType(@PathVariable String productType) {
		productServiceImpl.getProductByType(productType);
		return null;
	}

	@GetMapping("/name/{productName}")
	public ResponseEntity<List> getProductByName(@PathVariable String productName) {
		productServiceImpl.getProductByName(productName);
		return null;
	}

	@GetMapping("/category/{category}")
	public ResponseEntity<List> getProductByCategory(@PathVariable String category) {
		productServiceImpl.getProductByCategory(category);
		return null;
	}

	@PutMapping("/update/{productId}")
	public ResponseEntity<List> updateProduct(@PathVariable int productId, Product product) {
		productServiceImpl.updateProducts(product);
		return null;
	}

	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<List> deleteProduct(@PathVariable int productId) {
		productServiceImpl.deleteProductById(productId);
		return null;
	}
}
