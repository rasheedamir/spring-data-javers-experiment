package com.as.javers.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;

/**
 * Created by rasheed on 27/01/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest
{
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void shouldSave()
    {
        Account account = new Account();
        account.holderName = "Rasheed";
        account.openingDateTime = OffsetDateTime.now();

        accountRepository.save(account);
    }
}