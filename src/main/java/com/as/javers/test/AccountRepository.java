package com.as.javers.test;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Rasheed on 27/01/17.
 */
public interface AccountRepository extends MongoRepository<Account, String>
{

}
