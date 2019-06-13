package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.model.NksEntry;

public class AttributeBuilder {

    private NksQuery query;

    private SimpleQueryBuilder builder;

    public static String NEWBORN = "NeugeboreneAlter_";
    public static String INFANT = "SäuglingAlter_";
    public static String CHILD = "KindAlter_";
    public static String JUVENILE = "JugendlicheAlter_";
    public static String ADULT = "ErwachseneAlter_";
    public static String AGED = "ÄltereAlter_";
    public static String HIGHAGED = "HochaltrigeAlter_";
    public static String MALE = "MännlichGeschlecht_";
    public static String FEMALE = "WeiblichGeschlecht_";

    public AttributeBuilder(NksQuery query, SimpleQueryBuilder builder) {
        this.query = query;
        this.builder = builder;
    }

    /// <summary>
    /// Füge ein frei wählbares Attribut hinzu
    ///
    /// </summary>
    /// <param name="attr">Name des Attribut als String</param>
    /// <returns>Sich selbst für chaining</returns>
    private void addAttribute(String attr) {
        query.addAttribute(new NksEntry(attr));
    }

    /// <summary>
    /// Füge das Attribut Neuggeboren hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder newborn() {
        addAttribute(NEWBORN);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Säugling hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder infant() {
        addAttribute(INFANT);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Kind hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder child() {
        addAttribute(CHILD);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Jugendlich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder juvenile() {
        addAttribute(JUVENILE);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Erwachsen hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder adult() {
        addAttribute(ADULT);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Älter hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder aged() {
        addAttribute(AGED);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Hochaltrig hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder highAged() {
        addAttribute(HIGHAGED);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Männlich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder male() {
        addAttribute(MALE);
        return this;
    }

    /// <summary>
    /// Füge das Attribut Weiblich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst für chaining</returns>
    public AttributeBuilder female() {
        addAttribute(FEMALE);
        return this;
    }

    /// <summary>
    /// Beende das hinzufügen von Attributen
    ///
    /// </summary>
    /// <returns>Querybuilder zum weiteren Bearbeitung des Queries</returns>
    public SimpleQueryBuilder done() {
        return builder;
    }
}
