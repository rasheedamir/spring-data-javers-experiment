package com.as.javers.test;

import org.javers.core.Javers;
import org.javers.core.diff.Change;
import org.javers.core.json.JsonConverter;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rasheed on 13/01/17.
 *
 * The base audit service to avoid code duplication
 */
@Service
public class JaversAuditService
{
    private final Javers javers;

    @Autowired
    public JaversAuditService(Javers javers)
    {
        this.javers = javers;
    }

    public List<Change> getChanges(QueryBuilder jqlQuery)
    {
        List<Change> changes = javers.findChanges(jqlQuery.build());
        changes.sort((o1, o2) -> -1 * o1.getCommitMetadata().get().getCommitDate().compareTo(o2.getCommitMetadata().get().getCommitDate()));
        return changes;
    }

    public List<CdoSnapshot> getSnapshots(QueryBuilder jqlQuery)
    {
        List<CdoSnapshot> snapshots = javers.findSnapshots(jqlQuery.build());
        snapshots.sort((o1, o2) -> -1 * o1.getCommitMetadata().getCommitDate().compareTo(o2.getCommitMetadata().getCommitDate()));
        return snapshots;
    }

    public JsonConverter getJsonConverter()
    {
        return javers.getJsonConverter();
    }
}
