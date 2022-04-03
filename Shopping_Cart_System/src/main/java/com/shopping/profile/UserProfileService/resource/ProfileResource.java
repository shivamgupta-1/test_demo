package com.shopping.profile.UserProfileService.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.profile.UserProfileService.pojo.UserProfile;
import com.shopping.profile.UserProfileService.service.ProfileServiceImpl;

@RestController
@RequestMapping("/profile")
public class ProfileResource {

	@Autowired
	private ProfileServiceImpl profileServiceImpl;

	public ProfileResource() {
	}

	@PostMapping("/user")
	public UserProfile addNewCustomerProfile(@RequestBody UserProfile userProfile) {
		return profileServiceImpl.addNewCustomerProfile(userProfile);
	}



	@GetMapping("/users")
	public List<UserProfile> getAllProfiles() {
		return profileServiceImpl.getAllProfiles();

	}

	@GetMapping("/user/{profileId}")
	public Optional<UserProfile> getByProfileId(@PathVariable int profileId) {
		return profileServiceImpl.getByProfileId(profileId);
	}

	@GetMapping("/users2/{mobileNumber}")
	public UserProfile getByPhoneNumber(@PathVariable Long mobileNumber) {
		return profileServiceImpl.findByMobileNo(mobileNumber);
	}

	@PutMapping("/user/{profileId}")
	public void updateProfile(@PathVariable int profileId, @RequestBody UserProfile userProfile) {

		profileServiceImpl.updateProfile(profileId, userProfile);
	}

	@DeleteMapping("/user/{profileId}")
	public void deleteProfile(@PathVariable int profileId) {
		profileServiceImpl.deleteProfile(profileId);
	}

	@GetMapping("/user3/{fullName}")
	public UserProfile getByUserName(@PathVariable String fullName) {
		return profileServiceImpl.getByUserName(fullName);
	}
//	@PostMapping("/merchant")
//	public void addNewMerchantProfile(@RequestBody UserProfile userProfile) {
//		profileServiceImpl.addNewMerchantProfile(userProfile);
//	}
//
//	@PostMapping("/delivery")
//	public void addNewdeliveryProfile(@RequestBody UserProfile userProfile) {
//		profileServiceImpl.addNewDeliveryProfile(userProfile);
//	}
}
