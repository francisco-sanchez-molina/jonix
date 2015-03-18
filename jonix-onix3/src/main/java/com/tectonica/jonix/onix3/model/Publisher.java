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

public class Publisher
{
	public static final String refname = "Publisher";
	public static final String shortname = "publisher";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public PublishingRole publishingRole; // Required
	public List<PublisherIdentifier> publisherIdentifiers; // OneOrMore
	public PublisherName publisherName; // Optional
	public List<Website> websites; // ZeroOrMore

	public static Publisher fromDoc(org.w3c.dom.Element element)
	{
		final Publisher x = new Publisher();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(PublishingRole.refname) || name.equalsIgnoreCase(PublishingRole.shortname))
					x.publishingRole = PublishingRole.fromDoc(element);
				else if (name.equalsIgnoreCase(PublisherIdentifier.refname) || name.equalsIgnoreCase(PublisherIdentifier.shortname))
					x.publisherIdentifiers = DU.addToList(x.publisherIdentifiers, PublisherIdentifier.fromDoc(element));
				else if (name.equalsIgnoreCase(PublisherName.refname) || name.equalsIgnoreCase(PublisherName.shortname))
					x.publisherName = PublisherName.fromDoc(element);
				else if (name.equalsIgnoreCase(Website.refname) || name.equalsIgnoreCase(Website.shortname))
					x.websites = DU.addToList(x.websites, Website.fromDoc(element));
			}
		});

		return x;
	}
}
