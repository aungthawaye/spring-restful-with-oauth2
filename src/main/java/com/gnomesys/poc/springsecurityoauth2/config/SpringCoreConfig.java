package com.gnomesys.poc.springsecurityoauth2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.gnomesys.poc.springsecurityoauth2")
@Import({ SpringSecurityConfig.class, SpringWebConfig.class,
		SpringOAuth2Config.class })
public class SpringCoreConfig {

}
