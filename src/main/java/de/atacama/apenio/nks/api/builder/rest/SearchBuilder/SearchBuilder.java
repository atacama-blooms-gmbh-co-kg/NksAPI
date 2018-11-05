package de.atacama.apenio.nks.api.builder.rest.SearchBuilder;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.query.Queries;

public class SearchBuilder {
    private String path;

    public SearchBuilder(String path) {
        path = path;
        path += NksRestAttributes.SEARCH;
    }

    /// <summary>
    /// Zugriff auf die Ad Hoc Interventionen
    /// </summary>
    public Queries adHocIntervention() {
        return new Queries(Type.POST, path + NksRestAttributes.AHI);
    }

    /// <summary>
    /// Zugriff auf die Correlations
    /// </summary>
    public Queries correlation() {
        return new Queries(Type.POST, path + NksRestAttributes.CORRELATION);
    }

    /// <summary>
    /// Zugriff auf die Katalogsuche
    /// </summary>
    public Queries catalog() {
        return new Queries(Type.POST, path + NksRestAttributes.CATALOG);
    }

    /// <summary>
    /// Zugriff auf die Kettensuche
    /// </summary>
    public Queries chain() {
        return new Queries(Type.POST, path + NksRestAttributes.CHAIN);
    }

    /// <summary>
    /// Zugriff auf die Verlinkte Elemente
    /// </summary>
    public Queries link() {
        return new Queries(Type.POST, path + NksRestAttributes.LINK);
    }

    /// <summary>
    /// Zugriff auf Vorschläge
    /// </summary>
    public Queries proposal() {
        return new Queries(Type.POST, path + NksRestAttributes.PROP);
    }

    /// <summary>
    /// Zugriff auf Wortvorschläge
    /// </summary>
    public Queries wordProposal() {
        return new Queries(Type.POST, path + NksRestAttributes.WORD_PROP);
    }
}
