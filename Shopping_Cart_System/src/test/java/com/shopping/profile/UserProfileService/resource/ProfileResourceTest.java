package com.shopping.profile.UserProfileService.resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.profile.UserProfileService.pojo.UserProfile;
import com.shopping.profile.UserProfileService.service.ProfileServiceImpl;


@WebMvcTest(ProfileResource.class)

class ProfileResourceTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;

	@MockBean
	private ProfileServiceImpl profileServiceImpl;



	UserProfile user1 = new UserProfile(1, "shivam", "cse.png", "gmail232@gmail.com", (long) 63873455, "about",
			LocalDate.of(2018, 12, 31), "Male", "Merchant", "abc@123");
	UserProfile user2 = new UserProfile(2, "anuj", "csp.png", "gmail232@gmail.com", (long) 638734554, "about",
			LocalDate.of(2018, 12, 31), "Male", "Merchant", "abc@123");
	UserProfile user3 = new UserProfile(3, "ashish", "csg.png", "gmail232@gmail.com", (long) 63873456, "about",
			LocalDate.of(2018, 12, 31), "Male", "Merchant", "abc@123");
	@Test
	void getAllProfiles() throws Exception {
		List<UserProfile> profiles = new ArrayList<>();
		profiles.add(user1);
		profiles.add(user2);
		profiles.add(user3);

		Mockito.when(profileServiceImpl.getAllProfiles()).thenReturn(profiles);
		String url = "/profile/users";
		MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk())
				.andExpect(jsonPath("$[2].fullName", is("ashish"))).andReturn();
		String actual = mvcResult.getResponse().getContentAsString();
		String expeted = mapper.writeValueAsString(profiles);
		assertThat(actual).isEqualToIgnoringWhitespace(expeted);
	}

	@Test
	public void getByProfileId() throws Exception {
		Mockito.when(profileServiceImpl.getByProfileId(user1.getProfileId())).thenReturn(java.util.Optional.of(user1));
		String url = "/profile/user/1";
		mockMvc.perform(get(url))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.fullName", is("shivam")));
	}

	@Test
	public void addNewCustomerProfile() throws JsonProcessingException, Exception {
		UserProfile newCustomer = new UserProfile(4, "prabh", "cse.png", "gmail234@gmail.com", (long) 63873458, "about",
				LocalDate.of(2018, 12, 31), "Male", "Merchant", "abc@123");
		UserProfile newCustomer2 = new UserProfile(4, "prabh2", "cse.png", "gmail234@gmail.com", (long) 63873458,
				"about", LocalDate.of(2018, 12, 31), "Male", "Merchant", "abc@123");
		Mockito.when(profileServiceImpl.addNewCustomerProfile(newCustomer)).thenReturn(newCustomer2);
		String url = "/profile/user";

		mockMvc.perform(MockMvcRequestBuilders.post(url).contentType("application/json")
				.content(mapper.writeValueAsString(newCustomer))).andExpect(status().isOk());
				
	}


}
