package de.atacama.apenio.nks.api.builder.query.simple;

import de.atacama.apenio.nks.api.model.NksEntry;

public class SimpleEntryBuilder<T> {
    private NksEntry entry;

    private T builder;

    public SimpleEntryBuilder(NksEntry entry, T builder) {
        entry = entry;
        builder = builder;
    }

    /// <summary>
    /// Setze die Dom�ne des Konzepts
    ///
    /// </summary>
    /// <param name="domain">Name der Dom�ne</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleEntryBuilder<T> setDomain(String domain) {
        entry.setDom(domain);
        return this;
    }

    /// <summary>
    /// F�ge ein Strukturelement dem Konzept hinzu
    ///
    /// </summary>
    /// <param name="str">Name der Struktur</param>
    /// <returns>Sich selbst f�r chaining</returns>
    public SimpleEntryBuilder<T> addStructure(String str) {
        entry.addStructure(str);
        return this;
    }

    /// <summary>
    /// Beende Bearbeitung des Konzepts
    ///
    /// </summary>
    /// <returns>Sich selbst f�r chaining</returns>
    public T done() {
        return builder;
    }
}
