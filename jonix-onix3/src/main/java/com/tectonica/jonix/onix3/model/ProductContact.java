/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.onix3.model;

import java.util.List;

import com.tectonica.jonix.onix3.DU;
import com.tectonica.jonix.onix3.codelist.List3;

public class ProductContact
{
	public static final String refname = "ProductContact";
	public static final String shortname = "productcontact";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public ProductContactRole productContactRole; // Required
	public List<ProductContactIdentifier> productContactIdentifiers; // OneOrMore
	public ProductContactName productContactName; // Optional
	public ContactName contactName; // Optional
	public EmailAddress emailAddress; // Optional

	public static ProductContact fromDoc(org.w3c.dom.Element element)
	{
		final ProductContact x = new ProductContact();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(ProductContactRole.refname) || name.equalsIgnoreCase(ProductContactRole.shortname))
					x.productContactRole = ProductContactRole.fromDoc(element);
				else if (name.equalsIgnoreCase(ProductContactIdentifier.refname)
						|| name.equalsIgnoreCase(ProductContactIdentifier.shortname))
					x.productContactIdentifiers = DU.addToList(x.productContactIdentifiers, ProductContactIdentifier.fromDoc(element));
				else if (name.equalsIgnoreCase(ProductContactName.refname) || name.equalsIgnoreCase(ProductContactName.shortname))
					x.productContactName = ProductContactName.fromDoc(element);
				else if (name.equalsIgnoreCase(ContactName.refname) || name.equalsIgnoreCase(ContactName.shortname))
					x.contactName = ContactName.fromDoc(element);
				else if (name.equalsIgnoreCase(EmailAddress.refname) || name.equalsIgnoreCase(EmailAddress.shortname))
					x.emailAddress = EmailAddress.fromDoc(element);
			}
		});

		return x;
	}
}
