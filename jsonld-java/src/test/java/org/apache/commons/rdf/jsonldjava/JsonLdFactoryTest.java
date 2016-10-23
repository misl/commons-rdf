/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rdf.jsonldjava;

import org.apache.commons.rdf.api.AbstractRDFTermFactoryTest;
import org.apache.commons.rdf.api.RDF;
import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class JsonLdFactoryTest extends AbstractRDFTermFactoryTest {

	@Override
	public RDF createFactory() {
		return new JsonLdRDF();
	}
	
	// TODO: Add support for checking for invalid lang/iri/blanknode IDs
	
	@Test
	@Override
	public void testInvalidLiteralLang() throws Exception {
		Assume.assumeFalse("JSONLD-Java does not validate lang strings", false);		
		super.testInvalidLiteralLang();
	}
	
	@Test
	@Override
	public void testInvalidIRI() throws Exception {
		Assume.assumeFalse("JSONLD-Java does not validate IRIs", false);
		super.testInvalidIRI();
	}
	
	@Ignore
	@Test
	@Override
	public void testPossiblyInvalidBlankNode() throws Exception {
		// TODO: Fix blank node in ntriplesString()
		super.testPossiblyInvalidBlankNode();
	}
}
