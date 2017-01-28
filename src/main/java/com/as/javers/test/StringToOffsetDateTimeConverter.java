package com.as.javers.test;

import org.springframework.core.convert.converter.Converter;

import java.time.OffsetDateTime;

/**
 * Created by Rasheed on 28/01/17.
 */
public class StringToOffsetDateTimeConverter implements Converter<String, OffsetDateTime>
{
    @Override
    public OffsetDateTime convert(String str)
    {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(str);
        System.out.println(offsetDateTime);
        return offsetDateTime;
    }
}
