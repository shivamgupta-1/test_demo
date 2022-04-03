package com.shopping.profile.UserProfileService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shopping.profile.UserProfileService.pojo.UserProfile;

@Service
public interface ProfileService {

	public UserProfile addNewCustomerProfile(UserProfile userProfile);

	public List<UserProfile> getAllProfiles();

	public Optional<UserProfile> getByProfileId(int profileId);

	public void deleteProfile(int profileId);

	public void addNewMerchantProfile(UserProfile userProfile);

	public void addNewDeliveryProfile(UserProfile userProfile);

	public UserProfile findByMobileNo(Long mobileNumber);

	public UserProfile getByUserName(String fullName);

	public void updateProfile(int id, UserProfile userProfile);

}
