package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.NksQuery;
import de.atacama.apenio.nks.api.model.NksEntry;

public class SimpleTargetBuilder {

    private SimpleQueryBuilder builder;

    private NksQuery query;

    public SimpleTargetBuilder(NksQuery query, SimpleQueryBuilder builder)
    {
        this.query = query;
        this.builder = builder;
    }

    /// <summary>
    /// F�ge Root der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> root()
    {
        NksEntry entry = new NksEntry(BasicEntries.ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge den Expertenstandard der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> expertStandard()
    {
        NksEntry entry = new NksEntry(BasicEntries.EXPERT_STANDARD);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventions()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ordnungsstuktur der Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionsStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ordnungsstuktur der Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionsBundle()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS_BUNDLE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Auspr�gungen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> shapes()
    {
        NksEntry entry = new NksEntry(BasicEntries.SHAPES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ph�nomene der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> phenomenons()
    {
        NksEntry entry = new NksEntry(BasicEntries.PHENOMENONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge K�rperorte der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> bodyLocations()
    {
        NksEntry entry = new NksEntry(BasicEntries.BODYLOCATIONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ordnungsstuktur der K�rperorte der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> bodyLocationsStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.BODYLOCATIONS_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Hilfsmittel der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> appliances()
    {
        NksEntry entry = new NksEntry(BasicEntries.APPLIANCES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ordnungsstuktur der Hilfsmittel der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> appliancesStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.APPLIANCES_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ursachen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> causes()
    {
        NksEntry entry = new NksEntry(BasicEntries.CAUSES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Ordnungsstuktur der Ursachen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> causesStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.CAUSES_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// F�ge Element mittels seines Konzeptnamens der Zielmenge hinzu
    ///
    /// </summary>
    /// <param name="cName">der cName oder auch Konzeptname</param>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> custom(String cName)
    {
        NksEntry entry = new NksEntry(cName);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Beende das hinzuf�gen von Elementen zur Zielmenge
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzuf�gen</returns>
    public SimpleQueryBuilder done()
    {
        return builder;
    }
}