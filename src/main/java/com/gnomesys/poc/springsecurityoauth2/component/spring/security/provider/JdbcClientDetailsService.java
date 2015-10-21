package com.gnomesys.poc.springsecurityoauth2.component.spring.security.provider;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

public class JdbcClientDetailsService implements ClientDetailsService {

	@Override
	public ClientDetails loadClientByClientId(String arg0) throws ClientRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

}
