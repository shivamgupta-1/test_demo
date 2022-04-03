package com.cg.order.orderservice.orders.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopping.profile.UserProfileService.pojo.Address;

@Repository
public interface AddressRepository {
	List<Address> findByCustomerId(int customerId);
}
