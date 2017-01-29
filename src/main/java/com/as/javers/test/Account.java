package com.as.javers.test;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;

/**
 * Created by Rasheed on 27/01/17.
 */
@Document
public class Account
{
    @Id
    public String id;
    public String holderName;
    public OffsetDateTime java8OpeningDateTime;
    public DateTime jodaOpeningDateTime;
}
