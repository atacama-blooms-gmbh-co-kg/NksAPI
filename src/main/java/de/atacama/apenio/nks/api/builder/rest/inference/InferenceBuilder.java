package de.atacama.apenio.nks.api.builder.rest.inference;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.query.Queries;

public class InferenceBuilder {

    private String path;

    public InferenceBuilder(String path) {
        this.path = path;
        this.path += NksRestAttributes.INFERENCE;
    }

    /// <summary>
    /// Zugriff auf die Probabilities
    /// </summary>
    public Queries Probabilities() {
        return new Queries(Type.POST, path + NksRestAttributes.P_INFERENCE);
    }

    /// <summary>
    /// Zugriff auf die Contradictions
    /// </summary>
    public Queries Contradictions() {
        return new Queries(Type.POST, path + NksRestAttributes.C_INFERENCE);
    }
}
