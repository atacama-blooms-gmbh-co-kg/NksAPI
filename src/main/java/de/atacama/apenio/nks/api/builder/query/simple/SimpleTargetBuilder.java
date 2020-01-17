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
    /// Füge Root der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> root()
    {
        NksEntry entry = new NksEntry(BasicEntries.ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge den Expertenstandard der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> expertStandard()
    {
        NksEntry entry = new NksEntry(BasicEntries.EXPERT_STANDARD);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventions()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionsStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Interventionen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionsBundle()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS_BUNDLE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Interventionen-Bundles der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionsBundleStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTIONS_BUNDLE_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ausprägungen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> shapes()
    {
        NksEntry entry = new NksEntry(BasicEntries.SHAPES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Phänomene der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> phenomenons()
    {
        NksEntry entry = new NksEntry(BasicEntries.PHENOMENONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Strukturelemente der Phänomene der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> phenomenonsStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.PHENOMENONS_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Körperorte der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> bodyLocations()
    {
        NksEntry entry = new NksEntry(BasicEntries.BODYLOCATIONS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Körperorte der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> bodyLocationsStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.BODYLOCATIONS_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Hilfsmittel der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> appliances()
    {
        NksEntry entry = new NksEntry(BasicEntries.APPLIANCES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Hilfsmittel der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> appliancesStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.APPLIANCES_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ursachen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> causes()
    {
        NksEntry entry = new NksEntry(BasicEntries.CAUSES);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der Ursachen der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> causesStructure()
    {
        NksEntry entry = new NksEntry(BasicEntries.CAUSES_STRUCTURE);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der ICD der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> icd()
    {
        NksEntry entry = new NksEntry(BasicEntries.ICD);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Ordnungsstuktur der OPS der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> ops()
    {
        NksEntry entry = new NksEntry(BasicEntries.OPS);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge OPS-Rootelement der Zielmenge hinzu
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> opsRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.OPS_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /**
     * Füge OPS-Rootelement der Zielmenge hinzu
     * @return Aktuelle SimpleEntryBuilder instanz
     */
    public SimpleEntryBuilder<SimpleTargetBuilder> icdRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.ICD_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /**
     * Füge Interventions-Rootelement der Zielmenge hinzu
     * @return Aktuelle SimpleEntryBuilder instanz
     */
    public SimpleEntryBuilder<SimpleTargetBuilder> interventionRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.INTERVENTION_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /**
     * Füge Ursachen-Rootelement der Zielmenge hinzu
     * @return Aktuelle SimpleEntryBuilder instanz
     */
    public SimpleEntryBuilder<SimpleTargetBuilder> causeRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.CAUSE_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /**
     * Füge Hilfsmittel-Rootelement der Zielmenge hinzu
     * @return Aktuelle SimpleEntryBuilder instanz
     */
    public SimpleEntryBuilder<SimpleTargetBuilder> applianceRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.APPLIANCE_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /**
     * Füge Körperort-Rootelement der Zielmenge hinzu
     * @return Aktuelle SimpleEntryBuilder instanz
     */
    public SimpleEntryBuilder<SimpleTargetBuilder> bodyLocationRoot()
    {
        NksEntry entry = new NksEntry(BasicEntries.BODYLOCATION_ROOT);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }


    /// <summary>
    /// Füge Element mittels seines Konzeptnamens der Zielmenge hinzu
    ///
    /// </summary>
    /// <param name="cName">der cName oder auch Konzeptname</param>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    @Deprecated
    public SimpleEntryBuilder<SimpleTargetBuilder> custom(String cName)
    {
        NksEntry entry = new NksEntry(cName);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Element mittels seines Konzeptnamens der Zielmenge hinzu
    ///
    /// </summary>
    /// <param name="cName">der cName oder auch Konzeptname</param>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> conceptByCName(String cName)
    {
        NksEntry entry = new NksEntry(cName);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }

    /// <summary>
    /// Füge Element mittels seiner Signatur der Zielmenge hinzu
    ///
    /// </summary>
    /// <param name="signature">die Signatur des Konzepts</param>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleEntryBuilder<SimpleTargetBuilder> conceptBySignature(String signature)
    {
        NksEntry entry = new NksEntry();
        entry.setSignature(signature);
        query.addTarget(entry);
        return new SimpleEntryBuilder<>(entry,this);
    }


    /// <summary>
    /// Beende das hinzufügen von Elementen zur Zielmenge
    ///
    /// </summary>
    /// <returns>EntryBuilder um gegebenenfalls Strukturelemente dem Ziel hinzuzufügen</returns>
    public SimpleQueryBuilder done()
    {
        return builder;
    }
}
