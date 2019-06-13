package de.atacama.apenio.nks.api.builder.rest.longTerm;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.query.Queries;

public class LongTermBuilder {

    private String path;

    public LongTermBuilder(String path) {
        this.path = path;
        this.path += NksRestAttributes.LONG_TERM;
    }

    /// <summary>
    /// Risikoanalyse
    /// </summary>
    public Queries Risk() {
        return new Queries(Type.POST, path + NksRestAttributes.RISK);
    }

    /// <summary>
    /// Interventionsvorschläge
    /// </summary>
    public Queries Intervention() {
        return new Queries(Type.POST, path + NksRestAttributes.INTERVENTION_PROPOSAL);
    }
}
