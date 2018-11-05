package de.atacama.apenio.nks.api.builder.rest.get;

public class TargetSetBuilder {

    private String path;

    public TargetSetBuilder(String path) {
        this.path = path;
    }

    /// <summary>
    /// GET-Zugriff auf Elemelent des Katalogs �ber seinen Konzept-Namen
    /// </summary>
    public UidBuilder cName(String cname) {
        return new UidBuilder(this.path + "/" + cname);
    }

    /// <summary>
    /// GET-Zugriff auf Element des Katalogs �ber seine URI
    /// </summary>
    public UidBuilder uri(String uid) {
        return new UidBuilder(this.path + "/" + uid);
    }
}
