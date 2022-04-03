package com.company.cartservice.cartresource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.cartservice.entity.Cart;
import com.company.cartservice.repository.CartRepository;

@RestController
public class CartResource {

	@Autowired
	private CartRepository cartRepository;
	public CartResource() {
	}

	@GetMapping("/")
	public ResponseEntity<List<Cart>> getAllCarts() {
		return null;

	}

	@PostMapping("/")
	public void addCart(Cart cart) {

	}

	@GetMapping("/")
	public ResponseEntity<Cart> getCart(int cartId) {
		return null;

	}

	@PutMapping("/")
	public ResponseEntity<Cart> updateCart(Cart cart) {
		return null;

	}

}
