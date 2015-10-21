package com.gnomesys.poc.springsecurityoauth2.component.spring.converter;

import java.util.Calendar;

import org.springframework.core.convert.converter.Converter;

public class LongToCalendarConverter implements Converter<Long, Calendar> {

	@Override
	public Calendar convert(Long l) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(l);
		return c;
	}

}
