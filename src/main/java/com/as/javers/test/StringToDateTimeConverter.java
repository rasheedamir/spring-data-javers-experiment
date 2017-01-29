package com.as.javers.test;

import org.joda.time.DateTime;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Rasheed on 29/01/17.
 */
public class StringToDateTimeConverter implements Converter<String, DateTime>
{
    @Override
    public DateTime convert(String source)
    {
        return DateTime.parse(source);
    }
}
