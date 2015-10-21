package com.gnomesys.poc.springsecurityoauth2.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gnomesys.poc.springsecurityoauth2.domain.UserProfile;

@Controller
@RequestMapping("/private")
public class PrivateAPI {
	@RequestMapping("/profile")
	@ResponseBody
	public UserProfile getProfile(@RequestParam String userId) {
		UserProfile profile = new UserProfile();
		profile.setDateOfBirth(Calendar.getInstance());
		profile.setName("dummyName");
		profile.setUserId("dummyUserId");
		return profile;
	}
}
