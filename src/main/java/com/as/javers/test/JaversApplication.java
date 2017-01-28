package com.as.javers.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class JaversApplication
{
    @PostConstruct
    public void initApplication()
    {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

	public static void main(String[] args)
	{
		SpringApplication.run(JaversApplication.class, args);
	}
}
