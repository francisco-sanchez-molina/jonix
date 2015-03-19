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

package com.tectonica.jonix.onix3;

import java.util.List;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.RecordSourceTypeCodes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class ProductSupply
{
	public static final String refname = "ProductSupply";
	public static final String shortname = "productsupply";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypeCodes sourcetype;
	public String sourcename;

	public List<Market> markets; // ZeroOrMore
	public MarketPublishingDetail marketPublishingDetail; // Optional
	public List<SupplyDetail> supplyDetails; // OneOrMore

	public static ProductSupply fromDoc(org.w3c.dom.Element element)
	{
		final ProductSupply x = new ProductSupply();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypeCodes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(Market.refname) || name.equals(Market.shortname))
					x.markets = DU.addToList(x.markets, Market.fromDoc(element));
				else if (name.equals(MarketPublishingDetail.refname) || name.equals(MarketPublishingDetail.shortname))
					x.marketPublishingDetail = MarketPublishingDetail.fromDoc(element);
				else if (name.equals(SupplyDetail.refname) || name.equals(SupplyDetail.shortname))
					x.supplyDetails = DU.addToList(x.supplyDetails, SupplyDetail.fromDoc(element));
			}
		});

		return x;
	}
}