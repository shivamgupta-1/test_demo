package com.company.cartservice.service;

import java.util.List;

import com.company.cartservice.entity.Cart;

public interface CartService {
	Cart getcartById(int cartId);

	Cart updateCart(Cart cart);

	List<Cart> getallcarts();

	double cartTotal(Cart cart);

	Cart addCart(int cartId);
}
