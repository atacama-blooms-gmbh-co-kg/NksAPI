package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;

public class OrderBuilder {
    private NksQuery query;
    private SimpleQueryBuilder _builder;

    public OrderBuilder(NksQuery query, SimpleQueryBuilder builder) {
        query = query;
        builder = builder;
    }

    /// <summary>
    /// Setze die Ordnung des Antwortobjekts als Baum
    ///
    /// </summary>
    /// <returns>Querybuilder zum Fortsetzen der Bearbeitung des Queries</returns>
    public SimpleQueryBuilder tree() {
        query.setOrder("tree");
        return _builder;
    }

    /// <summary>
    /// Setze die Ordnung des Antwortobjekts als Liste
    ///
    /// </summary>
    /// <returns>Querybuilder zum Fortsetzen der Bearbeitung des Queries</returns>
    public SimpleQueryBuilder list() {
        query.setOrder("list");
        return _builder;
    }
}
