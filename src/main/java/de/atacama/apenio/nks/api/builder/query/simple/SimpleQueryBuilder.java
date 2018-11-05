package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.rest.Executor;
import de.atacama.apenio.nks.api.model.NksEntry;

public class SimpleQueryBuilder extends Executor {

    public SimpleQueryBuilder(Type type, String path) {
        super(type, path);
        query = new NksQuery();
        query.setLang("DE");
    }

    /// <summary>
    /// F�ge ein oder mehrere Attribute dem Query hinzu
    ///
    /// </summary>
    /// <returns>AttributeBuilder in welchem ein oder mehrere Attribute gew�hlt werden k�nnen</returns>
    public AttributeBuilder addAttributes() {
        return new AttributeBuilder(query, this);
    }

    /// <summary>
    /// F�ge ein oder mehrere Elemente der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>TargetBuilder in welchem ein oder mehrere Ziele gew�hlt werden k�nnen</returns>
    public SimpleTargetBuilder addTargets() {
        return new SimpleTargetBuilder(query, this);
    }

    /// <summary>
    /// F�ge ein Element mittels seines cName der Konzeptmenge hinzu
    ///
    /// </summary>
    /// <param name="cName">der cName oder auch Konzeptname</param>
    /// <returns>SimpleEntryBuilder um Strukturelemente etc. diesem Konzept hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleQueryBuilder> addConcept(String cName) {
        NksEntry entry = new NksEntry(cName);
        query.addConcept(entry);
        return new SimpleEntryBuilder<SimpleQueryBuilder>(entry, this);
    }

    /// <summary>
    /// F�ge ein NksEntry der Konzeptmenge hinzu
    ///
    /// </summary>
    /// <param name="entry">Nks Entry-Objekt</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder addConcept(NksEntry entry) {
        query.addConcept(entry);
        return this;
    }

    /// <summary>
    /// F�ge ein Element mittels seines cName und einer Dom�ne der Konzeptmenge hinzu
    ///
    /// </summary>
    /// <param name="cName">der cName oder auch Konzeptname</param>
    /// <param name="domain">die Dom�ne des Konzepts</param>
    /// <returns>SimpleEntryBuilder um Strukturelemente etc. diesem Konzept hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleQueryBuilder> addConcept(String cName, String domain) {
        NksEntry entry = new NksEntry(cName);
        entry.setDom(domain);
        query.addConcept(entry);
        return new SimpleEntryBuilder<SimpleQueryBuilder>(entry, this);
    }

    /// <summary>
    /// Definiere mit Hilfe eines Builders das Template f�r die Objekte der Antwort der Anfrage an den Server
    ///
    /// </summary>
    /// <returns>SimpleTemplateBuilder zur Definition eines Tamplates</returns>
    public SimpleTemplateBuilder defineTemplate() {
        return new SimpleTemplateBuilder(query, this);
    }

    /// <summary>
    /// Definiere die Sprache der Anfrage
    ///
    /// </summary>
    /// <param name="language">Sprachcode nach ISO 639-1 norm</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder setLanguage(String language) {
        query.setLang(language);
        return this;
    }

    /// <summary>
    /// Definiere den Suchttext der Anfrage
    ///
    /// </summary>
    /// <param name="text">Suchtext als String</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder setSearchText(String text) {
        query.setText(text);
        return this;
    }

    /// <summary>
    /// Definiere den Text-Kontext der Anfrage
    ///
    /// </summary>
    /// <param name="text">Kontext als String</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder setTextContext(String text) {
        query.setTextContext(text);
        return this;
    }

    /// <summary>
    /// Definiere die Tiefe des Antwortobjekts der Anfrage
    ///
    /// </summary>
    /// <param name="i">Tiefe als Integer</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder setDepth(int i) {
        query.setDepth(i);
        return this;
    }

    /// <summary>
    /// Definiere den Modus der Anfrage
    ///
    /// </summary>
    /// <param name="i">Modus als Integer</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleQueryBuilder setMode(int i) {
        query.setDepth(i);
        return this;
    }

    /// <summary>
    /// Definiere die Ordnung des Antwortobjekts der Anfrage
    /// Default = none
    /// </summary>
    /// <returns>OderBuilder in welchem die Ordnung ausgew�hlt werden kann</returns>
    public OrderBuilder setOrder() {
        return new OrderBuilder(query, this);
    }

    public SimpleQueryBuilder getDeprecatedElements() {
        query.setDepricated(true);
        return this;
    }
}
