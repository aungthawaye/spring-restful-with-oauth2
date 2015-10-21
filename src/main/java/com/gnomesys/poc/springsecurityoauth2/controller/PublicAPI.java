package com.gnomesys.poc.springsecurityoauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gnomesys.poc.springsecurityoauth2.domain.SecurityInfo;

@Controller
@RequestMapping("/public")
public class PublicAPI {

	@RequestMapping(value = "/login", produces = { "application/json" })
	@ResponseBody
	public SecurityInfo login(@RequestParam String email,
			@RequestParam String password) {
		SecurityInfo info = new SecurityInfo();
		info.setUserId("sampleUserId");
		info.setSecurityKey("secretKey");
		// Following values will be used by OAuth2 authorization service
		info.setClientId("sampleClientId");
		info.setClientSecret("clientSecretKey");
		return info;
	}
}
