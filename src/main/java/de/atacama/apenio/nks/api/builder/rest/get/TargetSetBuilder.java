package de.atacama.apenio.nks.api.builder.rest.get;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.rest.Executor;




public class TargetSetBuilder {

    private String path;

    public TargetSetBuilder(String path) {
        this.path = path;
    }

    /// <summary>
    /// GET-Zugriff auf Elemelent des Katalogs über seinen Konzept-Namen
    /// </summary>
    public UidBuilder cName(String cname) {
        return new UidBuilder(this.path + "/" + cname);
    }

    /// <summary>
    /// GET-Zugriff auf Element des Katalogs über seine URI
    /// </summary>
    public UidBuilder uri(String uid) {
        return new UidBuilder(this.path + "/" + uid);
    }

    /// <summary>
    /// Erhalte Antwort als Baum
    /// </summary>
    public Executor tree()
    {
        return new Executor(Type.GET,this.path + NksRestAttributes.TREE);
    }

    /// <summary>
    /// Erhalte Antwort als Liste
    /// </summary>
    public Executor list()
    {
        return new Executor(Type.GET,this.path + NksRestAttributes.LIST);
    }
}
