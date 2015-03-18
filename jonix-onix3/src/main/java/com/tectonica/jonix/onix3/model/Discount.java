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

import com.tectonica.jonix.onix3.DU;
import com.tectonica.jonix.onix3.codelist.List3;

public class Discount
{
	public static final String refname = "Discount";
	public static final String shortname = "discount";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public DiscountType discountType; // Optional
	public Quantity quantity; // Optional
	public ToQuantity toQuantity; // Optional
	public DiscountPercent discountPercent; // Required
	public DiscountAmount discountAmount; // Optional

	public static Discount fromDoc(org.w3c.dom.Element element)
	{
		final Discount x = new Discount();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(DiscountType.refname) || name.equalsIgnoreCase(DiscountType.shortname))
					x.discountType = DiscountType.fromDoc(element);
				else if (name.equalsIgnoreCase(Quantity.refname) || name.equalsIgnoreCase(Quantity.shortname))
					x.quantity = Quantity.fromDoc(element);
				else if (name.equalsIgnoreCase(ToQuantity.refname) || name.equalsIgnoreCase(ToQuantity.shortname))
					x.toQuantity = ToQuantity.fromDoc(element);
				else if (name.equalsIgnoreCase(DiscountPercent.refname) || name.equalsIgnoreCase(DiscountPercent.shortname))
					x.discountPercent = DiscountPercent.fromDoc(element);
				else if (name.equalsIgnoreCase(DiscountAmount.refname) || name.equalsIgnoreCase(DiscountAmount.shortname))
					x.discountAmount = DiscountAmount.fromDoc(element);
			}
		});

		return x;
	}
}
