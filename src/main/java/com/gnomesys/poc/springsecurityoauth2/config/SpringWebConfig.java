package com.gnomesys.poc.springsecurityoauth2.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.gnomesys.poc.springsecurityoauth2.component.spring.converter.CalendarToLongConverter;
import com.gnomesys.poc.springsecurityoauth2.component.spring.converter.LongToCalendarConverter;

@Configuration
@EnableWebMvc
@ComponentScan("com.gnomesys.poc.springsecurityoauth2.controller")
public class SpringWebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// Register custom converters
		registry.addConverter(new LongToCalendarConverter());
		registry.addConverter(new CalendarToLongConverter());
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}

}
