package com.gnomesys.poc.springsecurityoauth2.component.spring.security.authentication;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

public class SampleClientDetailsService implements ClientDetailsService {

	@Override
	public ClientDetails loadClientByClientId(String clientId)
			throws ClientRegistrationException {
		return null;
	}

}
