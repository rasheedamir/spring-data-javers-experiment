package com.as.javers.test;

import org.javers.core.diff.Change;
import org.javers.repository.jql.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by rasheed on 27/01/17.
 */
@Service
public class AccountAuditService
{
    private final JaversAuditService javersAuditService;

    @Autowired
    public AccountAuditService(JaversAuditService javersAuditService)
    {
        this.javersAuditService = javersAuditService;
    }

    public List<Change> getAccountChanges(String accountId, Optional<String> param)
    {
        QueryBuilder jqlQuery = QueryBuilder.byInstanceId(accountId, Account.class);
        jqlQuery = param.isPresent() ? jqlQuery.andProperty(param.get()) : jqlQuery;
        // return javersAuditService.getJsonConverter().toJson(javersAuditService.getChanges(jqlQuery));
        return javersAuditService.getChanges(jqlQuery);
    }
}
