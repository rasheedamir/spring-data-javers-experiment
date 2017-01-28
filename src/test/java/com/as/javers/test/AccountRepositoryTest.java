package com.as.javers.test;

import org.javers.core.diff.Change;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Created by rasheed on 27/01/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest
{
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountAuditService accountAuditService;

    @Test
    public void shouldSave()
    {
        Account account = new Account();
        account.holderName = "Rasheed";
        account.openingDateTime = OffsetDateTime.now();

        account = accountRepository.save(account);
        List<Change> changes = accountAuditService.getAccountChanges(account.id, Optional.empty());
        assertEquals(0, changes.size());

        Account foundOne = accountRepository.findOne(account.id);

        // modify now
        foundOne.holderName = "Rasheed Amir";
        foundOne = accountRepository.save(foundOne);
        changes = accountAuditService.getAccountChanges(foundOne.id, Optional.empty());
        assertEquals(1, changes.size());
    }
}