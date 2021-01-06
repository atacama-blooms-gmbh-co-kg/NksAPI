package de.atacama.apenio.nks.api.builder;

import de.atacama.apenio.nks.api.builder.rest.RestRequestBuilder;

public class Nks {

    private String path = "";

    private Nks()
    {
        this.path += NksRestAttributes.PUBLIC_SERVER;
        //TODO Ping Server
        this.path += NksRestAttributes.SERVICE_PATH;
    }

    private Nks(String serverAddress)
    {
        this.path += serverAddress;
        //TODO Ping Server
        this.path += NksRestAttributes.SERVICE_PATH;
    }


    /// <summary>
    /// Nksverbindung zum öffentlichen Server
    /// </summary>
    public static Nks newConnection()
    {
        return new Nks();
    }

    /// <summary>
    /// Nksverbindung zu einem bestimmten Server
    /// </summary>
    public static Nks newConnection(String serverAddress)
    {
        return new Nks(serverAddress);
    }

    /// <summary>
    /// Bereitet Anfrage an den NKS vor
    /// </summary>
    public RestRequestBuilder prepareRequest()
    {
        return new RestRequestBuilder(this.path);
    }
}
