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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.atacama.apenio.nks.api.builder.Nks;
import de.atacama.apenio.nks.api.builder.query.simple.SimpleQueryBuilder;

public class Debug {

	public static void main(String[] args) {
		QueryBuilder query = new QueryBuilder();
		query.setLanguage("de");
		query.setSearchDepth(5);
		query.addTarget(new TargetBuilder("InterventionOrdner").addStructure("AkutPflege_"));
		query.addAttribute("MännlichGeschlecht_");
		query.addAttribute("HochaltrigeAlter_");
		query.addSimpleConcept("UA1732");
		query.addSimpleConcept("PC1234");
		query.setSearchText("unterstützen");

		//NksResponse response = NksRequest.INSTANCE.access(query);
		
		//System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(response));
		//System.out.println("Results: " + response.size());

        //NksResponse response = Nks.newConnection("http://apenioapp02:19080").prepareRequest().get().appliances().cName("IA123").execute();
        //NksResponse response = Nks.newConnection("http://apenioapp02:19080").prepareRequest().access().element().createSimpleQuery().addConcept("IA123").done().execute();
        //System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(response));
        //System.out.println("Results: " + response.size());
        /*Nks.newConnection("").prepareRequest().search().proposal().createSimpleQuery()
                .addTargets()
                    .causes()
                        .addStructure("Test").addStructure("")
                    .done()
                    .bodyLocations()
                    .done()
                .done();*/
        Gson gson = new Gson();
        //SimpleQueryBuilder response = Nks.newConnection("http://apenioapp02:19080").prepareRequest().access().element().createSimpleQuery().addTargets().bodyLocations().done().done().setOrder().list();
        //System.out.println(gson.toJson(response.getQuery()));
        //SimpleQueryBuilder response = Nks.newConnection("http://localhost:8080").prepareRequest().access().element().createSimpleQuery().addTargets().bodyLocations().done().done().setOrder().tree().setDepth(2);
        NksResponse response = Nks.newConnection("http://localhost:8080").prepareRequest().get().interventions().cName("IA123").execute();
        //System.out.println(gson.toJson(response.getQuery()));
        System.out.println(gson.toJson(response));


        //NksResponse response = Nks.newConnection("http://apenioapp02:19080").prepareRequest().access().element().createSimpleQuery().

		//NksResponse response = Nks.newConnection("http://localhost:8080").prepareRequest().get().appliances().list().execute();
		/* response = Nks.newConnection("http://localhost:8080").prepareRequest().search()
				.catalog()
				.createSimpleQuery()
				.addTargets()
					.appliances().done()
				.done()
				.setSearchText("Pfeffer").execute();
*/
	}

}
