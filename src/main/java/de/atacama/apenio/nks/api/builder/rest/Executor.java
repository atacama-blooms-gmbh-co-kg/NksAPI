package de.atacama.apenio.nks.api.builder.rest;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.NksResponse;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.io.net.RestClient;

public class Executor {

    protected Type type;

    protected String path;

    protected NksQuery query;

    public Executor(Type type, String path)
    {
        this.path = path;
        this.type = type;
    }
    /// <summary>
    /// Gebe das gebaute Queryobjekt zurück
    /// </summary>
    public NksQuery getQuery()
    {
        return query;
    }

    public String getPath()
    {
        return path;
    }

    /// <summary>
    /// Führe Anfrage an den Server durch
    /// </summary>
    public NksResponse execute()
    {
        switch (type){
            case GET:
                return RestClient.INSTANCE.get(path);

            case POST:
                return RestClient.INSTANCE.post(query,path);

            default:
                //TODO: Throw Exception
                return null;
        }




    }
}
