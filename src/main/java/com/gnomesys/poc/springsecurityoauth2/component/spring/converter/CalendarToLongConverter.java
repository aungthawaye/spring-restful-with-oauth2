package com.gnomesys.poc.springsecurityoauth2.component.spring.converter;

import java.util.Calendar;

import org.springframework.core.convert.converter.Converter;

public class CalendarToLongConverter implements Converter<Calendar, Long> {

	@Override
	public Long convert(Calendar c) {
		return Long.valueOf(c.getTimeInMillis());
	}

}
