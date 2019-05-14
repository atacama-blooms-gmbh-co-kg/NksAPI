package de.atacama.apenio.nks.api.builder.rest.access;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.query.Queries;

public class AccessBuilder {

    private static String path;

    public AccessBuilder(String pPath){
        path = pPath + NksRestAttributes.ACCESS;
    }

    /// <summary>
    /// Zugriff auf die Kataloge
    /// </summary>
    public Queries element()
    {
        return new Queries(Type.POST,path + NksRestAttributes.ELEMENT);
    }
}
