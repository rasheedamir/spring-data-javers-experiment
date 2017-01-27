package com.as.javers.test;

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
    private String id;
    private String holderName;
    private OffsetDateTime creationDate;

    public String getId()
    {
        return id;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public OffsetDateTime getCreationDate()
    {
        return creationDate;
    }
}
