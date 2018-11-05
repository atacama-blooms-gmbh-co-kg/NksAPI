package de.atacama.apenio.nks.api.builder.query;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.TargetBuilder;
import de.atacama.apenio.nks.api.builder.Type;
import de.atacama.apenio.nks.api.builder.rest.Executor;
import de.atacama.apenio.nks.api.model.NksEntry;

import javax.management.Query;

public class QueryBuilder extends Executor {

    //private NksQuery query = new NksQuery();

    public QueryBuilder(Type type, String path) {
        super(type, path);
        query = new NksQuery();
    }

    /// <summary>
    /// Die Sprache der Antwort
    /// </summary>
    public QueryBuilder setLanguage(String value) {
        query.setLang(value);
        return this;
    }

    /// <summary>
    /// Der Text, nachdem gesucht werden soll
    /// </summary>
    public QueryBuilder setSearchText(String value) {
        query.setText(value);
        return this;
    }

    /// <summary>
    /// Der Textcontext, nachdem gesucht werden soll
    /// </summary>
    public QueryBuilder setTextContext(String value){
        query.setTextContext(value);
        return this;
    }

    /// <summary>
    /// Die Tiefe, die maximal in der Ontologie gesucht werden soll
    /// </summary>
    public QueryBuilder setSearchDepth(int i){
        query.setDepth(i);
        return this;
    }

    /// <summary>
    /// Die Tiefe, die maximal in der Ontologie gesucht werden soll
    /// </summary>
    public QueryBuilder setTemplate(NksEntry entry){
        query.setTemplate(entry);
        return this;
    }

    /// <summary>
    /// Modus in dem Gesucht werden soll
    /// </summary>
    public QueryBuilder setMode(int i){
        query.setMode(i);
        return this;
    }

    /// <summary>
    /// Rückgabetyp
    /// </summary>
    public QueryBuilder setOrder(String str){
        query.setOrder(str);
        return this;
    }

    /// <summary>
    /// Fügt ein einfaches Konzept über den Namen hinzu
    /// </summary>
    /// <param name="conceptName">der cName bzw Konzeptname</param>
    /// <returns>Sich selbst für chaining</returns>
    public QueryBuilder addSimpleConcept(String conceptName) {
        query.addAttribute(new NksEntry(conceptName));
        return this;
    }

    public QueryBuilder getDeprecatedElements() {
        query.setDepricated(true);
        return this;
    }

    /// <summary>
    /// Fügt ein Attribut über den Konzeptnamen hinzu.
    ///
    /// </summary>
    /// <param name="conceptName">der cName oder auch Konzeptname</param>
    /// <returns>Sich selbst für chaining</returns>
    public QueryBuilder addAttribute(String conceptName) {
        query.addAttribute(new NksEntry(conceptName));
        return this;
    }

    /// <summary>
    /// Fügt der Anfrage eine Zielmengenbegrenzung hinzu
    /// </summary>
    /// <param name="targetBuilder">Eine Begrenzung der Zielmenge über ein <see cref="TargetBuilder"/> Objekt</param>
    /// <returns>Sich selbst für chaining</returns>
    public QueryBuilder addTarget(TargetBuilder targetBuilder) {
        query.addTarget(targetBuilder.create());
        return this;
    }
}
