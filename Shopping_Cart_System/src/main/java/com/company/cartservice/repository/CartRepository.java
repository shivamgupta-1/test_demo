package com.company.cartservice.repository;

import com.company.cartservice.entity.Cart;

public interface CartRepository {
	Cart findByCartId(int cartId);
}
