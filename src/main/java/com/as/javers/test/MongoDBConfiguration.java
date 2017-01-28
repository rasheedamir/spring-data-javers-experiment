package com.as.javers.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.CustomConversions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rasheed on 28/01/17.
 */
@Configuration
public class MongoDBConfiguration
{
    @Bean
    public CustomConversions customConversions()
    {
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(new OffsetDateTimeToStringConverter());
        converters.add(new StringToOffsetDateTimeConverter());
        return new CustomConversions(converters);
    }
}
