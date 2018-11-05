package de.atacama.apenio.nks.api.builder.rest;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.rest.SearchBuilder.SearchBuilder;
import de.atacama.apenio.nks.api.builder.rest.access.AccessBuilder;
import de.atacama.apenio.nks.api.builder.rest.get.GetBuilder;
import de.atacama.apenio.nks.api.builder.rest.inference.InferenceBuilder;
import de.atacama.apenio.nks.api.builder.rest.longTerm.LongTermBuilder;

public class RestRequestBuilder {

    private String path;

    public RestRequestBuilder(String path) {
        this.path = path;
        this.path += NksRestAttributes.V2;
    }

    /// <summary>
    /// Anfrage an den Access-Service
    /// </summary>
    public AccessBuilder access() {
        return new AccessBuilder(this.path);
    }

    /// <summary>
    /// Anfrage an den Get-Service
    /// </summary>
    public GetBuilder get() {
        return new GetBuilder(this.path);
    }

    /// <summary>
    /// Anfrage an den Inference-Service
    /// </summary>
    public InferenceBuilder inference() {
        return new InferenceBuilder(this.path);
    }

    /// <summary>
    /// Anfrage an den LongTerm-Service
    /// </summary>
    public LongTermBuilder longTerm() {
        return new LongTermBuilder(this.path);
    }

    /// <summary>
    /// Anfrage an den Search-Service
    /// </summary>
    public SearchBuilder search() {
        return new SearchBuilder(this.path);
    }
}
