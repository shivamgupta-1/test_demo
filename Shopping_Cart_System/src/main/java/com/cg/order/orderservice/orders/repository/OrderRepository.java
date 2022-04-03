package com.cg.order.orderservice.orders.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.order.orderservice.orders.Orders;

@Repository
public interface OrderRepository {
	List<Orders> findByCustomerId(Integer customerId);

	Orders findFirstByOrderByOrderIdDesc();
}
