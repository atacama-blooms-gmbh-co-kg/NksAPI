package de.atacama.apenio.nks.api.builder.rest.get;

import de.atacama.apenio.nks.api.builder.NksRestAttributes;

public class GetBuilder {

    private String path;

    public GetBuilder(String path) {
        this.path = path;
        this.path += NksRestAttributes.GET;
    }

    /// <summary>
    /// GET-Zugriff auf Interventionen
    /// </summary>
    public TargetSetBuilder interventions() {
        return new TargetSetBuilder(this.path + NksRestAttributes.INTERVENTIONS);
    }

    /// <summary>
    /// GET-Zugriff auf Ausprägungen
    /// </summary>
    public TargetSetBuilder shapes() {
        return new TargetSetBuilder(this.path + NksRestAttributes.SHAPES);
    }

    /// <summary>
    /// GET-Zugriff auf Phänomene
    /// </summary>
    public TargetSetBuilder phenomenons() {
        return new TargetSetBuilder(this.path + NksRestAttributes.PHENOMENONS);
    }

    /// <summary>
    /// GET-Zugriff auf Körperorte
    /// </summary>
    public TargetSetBuilder bodyLocations() {
        return new TargetSetBuilder(this.path + NksRestAttributes.BODYLOCATIONS);
    }

    /// <summary>
    /// GET-Zugriff auf Ursachen
    /// </summary>
    public TargetSetBuilder causes() {
        return new TargetSetBuilder(this.path + NksRestAttributes.CAUSES);
    }

    /// <summary>
    /// GET-Zugriff auf Hilsmittel
    /// </summary>
    public TargetSetBuilder appliances() {
        return new TargetSetBuilder(this.path + NksRestAttributes.APPLIANCES);
    }

    /// <summary>
    /// GET-Zugriff auf Elemelent des Katalogs über seinen Konzept-Namen
    /// </summary>
    public UidBuilder cName(String uid) {
        return new UidBuilder(this.path + "/" + uid);
    }

    /// <summary>
    /// GET-Zugriff auf Element des Katalogs über seine URI
    /// </summary>
    public UidBuilder uri(String uid) {
        return new UidBuilder(this.path + "/" + uid);
    }
}
