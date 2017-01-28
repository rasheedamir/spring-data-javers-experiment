package com.as.javers.test;

import org.springframework.core.convert.converter.Converter;

import java.time.OffsetDateTime;

/**
 * Created by Rasheed on 28/01/17.
 */
public class OffsetDateTimeToStringConverter implements Converter<OffsetDateTime, String>
{
    @Override
    public String convert(OffsetDateTime offsetDateTime)
    {
        String str = offsetDateTime.toString();
        System.out.println(str);
        return str;
    }
}
