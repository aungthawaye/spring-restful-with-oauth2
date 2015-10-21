package com.gnomesys.poc.springsecurityoauth2.component.spring.security.userdetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.gnomesys.poc.springsecurityoauth2.domain.UserProfile;

@Component("sampleUserDetailsService")
public class SampleUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		// Client will send username and password pair using Basic
		// Authentication, so it will be base64(username:password)
		// Here user name is the userId which can be extracted from login api
		// and password is the system generated secretKey which also can be
		// extract from login api.

		System.out.println("SampleUserDetailsService : username > " + username);

		if (username.equals("sampleUserId")) {

			// Here is just for sample purpose.
			// In real world, you have to load user information from database.
			UserProfile up = new UserProfile();
			up.setName("Sample User");
			up.setPassword("secretKey");
			up.setUserId("sampleUserId");

			// Create sample user details using the sample user profile.
			SampleUserDetails ud = new SampleUserDetails(up);
			return ud;
		} else
			throw new UsernameNotFoundException(String.format(
					"User %s does not exist!", username));
	}

	public static final class SampleUserDetails implements UserDetails {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private UserProfile userProfile;

		public SampleUserDetails(UserProfile up) {
			this.userProfile = up;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {

			List<SimpleGrantedAuthority> ga = new ArrayList<>();
			// **IMPORTANT **
			// Require prefix "ROLE_"
			ga.add(new SimpleGrantedAuthority("ROLE_USER"));
			return ga;
		}

		@Override
		public String getPassword() {
			return this.userProfile.getPassword();
		}

		@Override
		public String getUsername() {
			return this.userProfile.getUserId();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}

	}

}
