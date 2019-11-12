package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.model.NksEntry;

public class AttributeBuilder {

    private NksQuery query;

    private SimpleQueryBuilder builder;

    public static String NEWBORN = "NeugeboreneAlter_";
    public static String INFANT = "S�uglingAlter_";
    public static String CHILD = "KindAlter_";
    public static String JUVENILE = "JugendlicheAlter_";
    public static String ADULT = "ErwachseneAlter_";
    public static String AGED = "�ltereAlter_";
    public static String HIGHAGED = "HochaltrigeAlter_";
    public static String MALE = "M�nnlichGeschlecht_";
    public static String FEMALE = "WeiblichGeschlecht_";
    public static String AKUT = "AkutPflege_";
    public static String LZ = "LangzeitPflege_";
    public static String POP = "PopPflege_";
    public static String C4C = "C4cPflege_";
    public static String REHA = "RehaPflege_";

    public AttributeBuilder(NksQuery query, SimpleQueryBuilder builder) {
        this.query = query;
        this.builder = builder;
    }

    /// <summary>
    /// F�ge ein frei w�hlbares Attribut hinzu
    ///
    /// </summary>
    /// <param name="attr">Name des Attribut als String</param>
    /// <returns>Sich selbst f�r chaining</returns>
    private void addAttribute(String attr) {
        query.addAttribute(new NksEntry(attr));
    }

    /// <summary>
    /// F�ge das Attribut Neuggeboren hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder newborn() {
        addAttribute(NEWBORN);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut S�ugling hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder infant() {
        addAttribute(INFANT);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Kind hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder child() {
        addAttribute(CHILD);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Jugendlich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder juvenile() {
        addAttribute(JUVENILE);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Erwachsen hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder adult() {
        addAttribute(ADULT);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut �lter hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder aged() {
        addAttribute(AGED);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Hochaltrig hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder highAged() {
        addAttribute(HIGHAGED);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut M�nnlich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder male() {
        addAttribute(MALE);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Weiblich hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder female() {
        addAttribute(FEMALE);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut AkutPflege hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder akut() {
        addAttribute(AKUT);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut Langzeitpflege hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder lz() {
        addAttribute(LZ);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut PopPflege hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder pop() {
        addAttribute(POP);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut C4cOPflege hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder c4c() {
        addAttribute(C4C);
        return this;
    }

    /// <summary>
    /// F�ge das Attribut RehaPflege hinzu
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public AttributeBuilder reha() {
        addAttribute(REHA);
        return this;
    }

    /// <summary>
    /// Beende das hinzuf�gen von Attributen
    ///
    /// </summary>
    /// <returns>Querybuilder zum weiteren Bearbeitung des Queries</returns>
    public SimpleQueryBuilder done() {
        return builder;
    }
}
