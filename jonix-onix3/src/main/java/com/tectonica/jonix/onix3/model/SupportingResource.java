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

public class SupportingResource
{
	public static final String refname = "SupportingResource";
	public static final String shortname = "supportingresource";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public ResourceContentType resourceContentType; // Required
	public List<ContentAudience> contentAudiences; // OneOrMore
	public ResourceMode resourceMode; // Required
	public List<ResourceFeature> resourceFeatures; // ZeroOrMore
	public List<ResourceVersion> resourceVersions; // OneOrMore

	public static SupportingResource fromDoc(org.w3c.dom.Element element)
	{
		final SupportingResource x = new SupportingResource();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(ResourceContentType.refname) || name.equalsIgnoreCase(ResourceContentType.shortname))
					x.resourceContentType = ResourceContentType.fromDoc(element);
				else if (name.equalsIgnoreCase(ContentAudience.refname) || name.equalsIgnoreCase(ContentAudience.shortname))
					x.contentAudiences = DU.addToList(x.contentAudiences, ContentAudience.fromDoc(element));
				else if (name.equalsIgnoreCase(ResourceMode.refname) || name.equalsIgnoreCase(ResourceMode.shortname))
					x.resourceMode = ResourceMode.fromDoc(element);
				else if (name.equalsIgnoreCase(ResourceFeature.refname) || name.equalsIgnoreCase(ResourceFeature.shortname))
					x.resourceFeatures = DU.addToList(x.resourceFeatures, ResourceFeature.fromDoc(element));
				else if (name.equalsIgnoreCase(ResourceVersion.refname) || name.equalsIgnoreCase(ResourceVersion.shortname))
					x.resourceVersions = DU.addToList(x.resourceVersions, ResourceVersion.fromDoc(element));
			}
		});

		return x;
	}
}
