package com.gnomesys.poc.springsecurityoauth2.component.spring.security.authentication;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component("clientAuthenticationManager")
public class ClientAuthenticationManager implements AuthenticationManager {

	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		String userId = auth.getName();
		String secretKey = (String) auth.getPrincipal();

		System.out.println("Got userId [" + userId + "] and secretKey ["
				+ secretKey + "]");
		return null;
	}

}
