package com.shopping.profile.UserProfileService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shopping.profile.UserProfileService.pojo.UserProfile;

@Repository
public interface ProfileRepository extends MongoRepository<UserProfile, Integer> {
	public UserProfile findAllByMobileNumber(Long mobileNumber);

	public UserProfile findByfullName(String fullName);

}
