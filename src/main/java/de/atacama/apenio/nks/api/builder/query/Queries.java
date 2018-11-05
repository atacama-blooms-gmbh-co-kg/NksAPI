package de.atacama.apenio.nks.api.builder.query;

import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.query.simple.SimpleQueryBuilder;

public class Queries {

    private Type type;

    private String path;

    public Queries(Type type, String path)
    {
        type = type;
        path = path;
    }

    /// <summary>
    /// Erstellen eines komplexen Query-Objekts mittels builder
    /// </summary>
    public QueryBuilder createQuery()
    {
        return new QueryBuilder(type,path);
    }
    /// <summary>
    /// Erstellen eines komplexen Query-Objekts mittels vereinfachten Builders
    /// </summary>
    public SimpleQueryBuilder createSimpleQuery()
    {
        return new SimpleQueryBuilder(type,path);
    }
}
