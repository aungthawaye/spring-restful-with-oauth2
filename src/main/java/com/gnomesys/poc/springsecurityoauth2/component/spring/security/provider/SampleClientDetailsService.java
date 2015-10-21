package com.gnomesys.poc.springsecurityoauth2.component.spring.security.provider;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

@Component("sampleClientDetailsService")
public class SampleClientDetailsService implements ClientDetailsService {

	@Override
	public ClientDetails loadClientByClientId(String clientId)
			throws ClientRegistrationException {
		// Here is sample only. In your app, you have to grab client information
		// from your database.
		// In this example, we load UserProfile using clientId
		return null;
	}

	public static final class SampleClientDetails implements ClientDetails {

		@Override
		public Integer getAccessTokenValiditySeconds() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<String, Object> getAdditionalInformation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<String> getAuthorizedGrantTypes() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getClientId() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getClientSecret() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer getRefreshTokenValiditySeconds() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<String> getRegisteredRedirectUri() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<String> getResourceIds() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<String> getScope() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isAutoApprove(String arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isScoped() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSecretRequired() {
			// TODO Auto-generated method stub
			return false;
		}

	}

}
