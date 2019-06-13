package de.atacama.apenio.nks.api.builder.rest.get;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.rest.Executor;

public class UidBuilder extends Executor {
    public UidBuilder(String path) {
        super(Type.GET, path);
    }

    /// <summary>
    /// Erhalte Antwort als Baum
    /// </summary>
    public Executor tree()
    {
        return new Executor(Type.GET,getPath() + NksRestAttributes.TREE);
    }

    /// <summary>
    /// Erhalte Antwort als Liste
    /// </summary>
    public Executor list()
    {
        return new Executor(Type.GET,getPath() + NksRestAttributes.LIST);
    }
}
