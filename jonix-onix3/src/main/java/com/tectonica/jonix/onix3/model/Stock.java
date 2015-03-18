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

public class Stock
{
	public static final String refname = "Stock";
	public static final String shortname = "stock";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public LocationIdentifier locationIdentifier; // Optional
	public LocationName locationName; // Optional
	public List<StockQuantityCoded> stockQuantityCodeds; // ZeroOrMore
	public OnHand onHand; // Required
	public Proximity proximity; // Optional
	public OnOrder onOrder; // Optional
	public CBO cbO; // Optional
	public List<OnOrderDetail> onOrderDetails; // ZeroOrMore
	public List<Velocity> velocitys; // ZeroOrMore

	public static Stock fromDoc(org.w3c.dom.Element element)
	{
		final Stock x = new Stock();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(LocationIdentifier.refname) || name.equalsIgnoreCase(LocationIdentifier.shortname))
					x.locationIdentifier = LocationIdentifier.fromDoc(element);
				else if (name.equalsIgnoreCase(LocationName.refname) || name.equalsIgnoreCase(LocationName.shortname))
					x.locationName = LocationName.fromDoc(element);
				else if (name.equalsIgnoreCase(StockQuantityCoded.refname) || name.equalsIgnoreCase(StockQuantityCoded.shortname))
					x.stockQuantityCodeds = DU.addToList(x.stockQuantityCodeds, StockQuantityCoded.fromDoc(element));
				else if (name.equalsIgnoreCase(OnHand.refname) || name.equalsIgnoreCase(OnHand.shortname))
					x.onHand = OnHand.fromDoc(element);
				else if (name.equalsIgnoreCase(Proximity.refname) || name.equalsIgnoreCase(Proximity.shortname))
					x.proximity = Proximity.fromDoc(element);
				else if (name.equalsIgnoreCase(OnOrder.refname) || name.equalsIgnoreCase(OnOrder.shortname))
					x.onOrder = OnOrder.fromDoc(element);
				else if (name.equalsIgnoreCase(CBO.refname) || name.equalsIgnoreCase(CBO.shortname))
					x.cbO = CBO.fromDoc(element);
				else if (name.equalsIgnoreCase(OnOrderDetail.refname) || name.equalsIgnoreCase(OnOrderDetail.shortname))
					x.onOrderDetails = DU.addToList(x.onOrderDetails, OnOrderDetail.fromDoc(element));
				else if (name.equalsIgnoreCase(Velocity.refname) || name.equalsIgnoreCase(Velocity.shortname))
					x.velocitys = DU.addToList(x.velocitys, Velocity.fromDoc(element));
			}
		});

		return x;
	}
}
