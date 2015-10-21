package com.gnomesys.poc.springsecurityoauth2.component.spring.security.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

@Component("jdbcAuthenticationProvider")
public class JdbcAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {

		String userName = auth.getName();
		String password = (String) auth.getCredentials();
		
		// TODO: verify the user using the data from database.

		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return new UsernamePasswordAuthenticationToken(userName, password, authorities);
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

}
