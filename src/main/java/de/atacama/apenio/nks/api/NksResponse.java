/* Copyright (c) 2017 atacama | Software GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.atacama.apenio.nks.api;

import java.util.*;

import de.atacama.apenio.nks.api.model.NksEntry;

/**
 * Beinhaltet das vollständige Resultat einer Anfrage an den NKS.
 * Falls bei der Anfrage Fehler aufgetreten sind, werden diese
 * als Warning abgelegt.
 * 
 * @author Weert Stamm
 */
public class NksResponse implements Iterable<NksEntry> {

	public static final String FORMAT_JSON = "JSON";
	public static final String FORMAT_XML = "XML";

	private Set<String> warnings = new HashSet<>();

	private List<NksEntry> folders = new ArrayList<>();

	private Integer totalSize;

	protected String requestFormat = FORMAT_JSON;

	NksResponse() {
	}

	@Override
	public Iterator<NksEntry> iterator() {
		return folders.iterator();
	}

	/**
	 * @return die Anzahl der Elemente im Ergebnis
	 */
	public int size() {
		return folders.size();
	}
	
	/////////////////////
	// GETTER & SETTER //
	/////////////////////

	/**
	 * @return eine geordnete Liste der Elemente im Ergebnis
	 */
	public List<NksEntry> getElements() {
		return folders;
	}

	/**
	 * @return Alle Fehler und Warnungen
	 */
	public Set<String> getWarnings() {
		return warnings;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
}
