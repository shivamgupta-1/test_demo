package com.shopping.profile.UserProfileService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.profile.UserProfileService.pojo.UserProfile;
import com.shopping.profile.UserProfileService.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	@Override
	public UserProfile addNewCustomerProfile(UserProfile userProfile) {

		return profileRepository.save(userProfile);

	}

	@Override
	public List<UserProfile> getAllProfiles() {
		return profileRepository.findAll();
	}

	@Override
	public Optional<UserProfile> getByProfileId(int profileId) {

		return profileRepository.findById(profileId);

	}

	@Override
	public void deleteProfile(int profileId) {
		profileRepository.deleteById(profileId);
	}

	@Override
	public void addNewMerchantProfile(UserProfile userProfile) {

	}

	@Override
	public void addNewDeliveryProfile(UserProfile userProfile) {

	}

	@Override
	public UserProfile findByMobileNo(Long mobileNumber) {
		return profileRepository.findAllByMobileNumber(mobileNumber);

	}

	@Override
	public UserProfile getByUserName(String fullName) {
		return profileRepository.findByfullName(fullName);
	}



	@Override
	public void updateProfile(int id, UserProfile userProfile) {
		profileRepository.save(userProfile);
	}

}
