package com.as.javers.test;

import org.joda.time.DateTime;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Rasheed on 29/01/17.
 */
public class DateTimeToStringConverter implements Converter<DateTime, String>
{
    @Override
    public String convert(DateTime source)
    {
        // ISO8601 time formatted string
        return source.toString();
    }
}
