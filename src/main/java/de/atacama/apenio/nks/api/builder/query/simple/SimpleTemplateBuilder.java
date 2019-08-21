package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.model.NksEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SimpleTemplateBuilder {
    private NksEntry entry;

    private SimpleQueryBuilder builder;

    public SimpleTemplateBuilder(NksQuery query, SimpleQueryBuilder builder) {
        this.entry = new NksEntry(BasicEntries.TEMPLATE);
        this.builder = builder;
        query.setTemplate(entry);
    }

    /// <summary>
    /// Definiere Felder des StandardTemplates
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder defaultTemplate() {
        setLabel();
        setCategory();
        setSuperType();
        setDomain();
        setScore();
        setListIndex();
        setSignature();
        setParentSignature();
        return this;
    }

    /// <summary>
    /// Definiere Felder des Templates für Phänomene
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder phenomenonsTemplate() {
        setLabel();
        setCategory();
        setSuperType();
        setDomain();
        setScore();
        setListIndex();
        setSignature();
        setParentSignature();
        setShapeLabel();
        setShapes();
        return this;
    }

    /// <summary>
    /// Definiere Felder des Templates für Interventionen
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder interventionTemplate() {
        setLabel();
        setCategory();
        setSuperType();
        setDomain();
        setScore();
        setListIndex();
        setSignature();
        setParentSignature();
        addDataRelation("caremin");
        addDataRelation("icnp");
        addDataRelation("ppr");
        addDataRelation("lepmin");
        return this;
    }

    /// <summary>
    /// Definiere Felder des Templates für Structures
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder structureTemplate() {
        setLabel();
        setCategory();
        setSuperType();
        setDomain();
        setScore();
        setListIndex();
        setSignature();
        setParentSignature();
        setStructures();
        return this;
    }

    /// <summary>
    /// Schließe das Bearbeiten des Templates ab
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleQueryBuilder done() {
        return builder;
    }

    /// <summary>
    /// Definiere das Label im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setLabel() {
        entry.setLabel("");
        return this;
    }

    /// <summary>
    /// Definiere die Kategorie im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setCategory() {
        entry.setCat("");
        return this;
    }

    /// <summary>
    /// Definiere den Vorgängertypen im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setSuperType() {
        entry.setSuperType("");
        return this;
    }

    /// <summary>
    /// Definiere die Domäne im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setDomain() {
        entry.setDom("");
        return this;
    }

    /// <summary>
    /// Definiere den Score im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setScore() {
        entry.setScore("");
        return this;
    }

    /// <summary>
    /// Definiere den ListIndex im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setListIndex() {
        entry.setListIndex(0);
        return this;
    }

    /// <summary>
    /// Definiere die Signatur im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setSignature() {
        entry.setSignature("");
        return null;
    }

    /// <summary>
    /// Definiere die Signatur des Vorgängers im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setParentSignature() {
        entry.setParentSignature("");
        return null;
    }

    /// <summary>
    /// Definiere die Structures im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setStructures() {
        entry.setStructures(new HashSet<String>());
        return this;
    }

    /// <summary>
    /// Definiere die Datenrelationen im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setDataRelation() {
        entry.setDataRelation(new HashMap<>());
        return this;
    }

    /// <summary>
    /// Definiere die Objektrelationen im Template
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setObjectRelation() {
        entry.setObjectRelation(new HashMap<>());
        return this;
    }

    /// <summary>
    /// Definiere bestimmte Datenrelation im Template
    ///
    /// </summary>
    /// <param name="str">Name der Relation</param>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder addDataRelation(String str) {
        if (entry.getDataRelation() == null) {
            setDataRelation();
        }
        entry.getDataRelation().put(str, new HashSet<>());
        return this;
    }

    /// <summary>
    /// Definiere bestimmte Objektrelation im Template
    ///
    /// </summary>
    /// <param name="str">Name der Relation</param>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder addObjectRelation(String str) {
        if (entry.getObjectRelation() == null) {
            setObjectRelation();
        }
        entry.getObjectRelation().put(str, new HashSet<>());
        return this;
    }

    /// <summary>
    /// Definiere Ausprägungen im Tempate
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setShapes() {
        entry.setShapes(new HashMap<Integer, HashSet<String>>());
        return this;
    }

    /// <summary>
    /// Definiere Label der Ausprägungen im Tempate
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public SimpleTemplateBuilder setShapeLabel() {
        entry.setShapeLabel(new ArrayList<String>());
        return this;
    }

    public SimpleTemplateBuilder setDeprecatedElements() {
        entry.setDeprecated(true);
        return this;
    }
}
