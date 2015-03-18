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

package com.tectonica.jonix.onix3.codelist;

import java.util.HashMap;
import java.util.Map;

/**
 * Text type
 */
public enum List153
{
	/**
	 * To be used only in circumstances where the parties to an exchange have agreed to include text which (a) is not for general
	 * distribution, and (b) cannot be coded elsewhere. If more than one type of text is sent, it must be identified by tagging within the
	 * text itself.
	 */
	Sender_defined_text("01"), //

	/**
	 * Limited to a maximum of 350 characters.
	 */
	Short_description_annotation("02"), //

	/**
	 * Length unrestricted.
	 */
	Description("03"), //

	/**
	 * Used for a table of contents sent as a single text field, which may or may not carry structure expressed as XHTML.
	 */
	Table_of_contents("04"), //

	/**
	 * Descriptive blurb taken from the back cover and/or flaps.
	 */
	Flap___cover_copy("05"), //

	/**
	 * A quote taken from a review of the product or of the work in question where there is no need to take account of different editions.
	 */
	Review_quote("06"), //

	/**
	 * A quote taken from a review of a previous edition of the work.
	 */
	Review_quote__previous_edition("07"), //

	/**
	 * A quote taken from a review of a previous work by the same author(s) or in the same series.
	 */
	Review_quote__previous_work("08"), //

	/**
	 * A quote usually provided by a celebrity or another author to promote a new book, not from a review.
	 */
	Endorsement("09"), //

	/**
	 * A promotional phrase which is intended to headline a description of the product.
	 */
	Promotional_headline("10"), //

	/**
	 * Text describing a feature of a product to which the publisher wishes to draw attention for promotional purposes. Each separate
	 * feature should be described by a separate repeat, so that formatting can be applied at the discretion of the receiver of the ONIX
	 * record, or multiple features can be described using appropriate XHTML markup.
	 */
	Feature("11"), //

	/**
	 * A note referring to all contributors to a product – NOT linked to a single contributor.
	 */
	Biographical_note("12"), //

	/**
	 * A statement included by a publisher in fulfillment of contractual obligations, such as a disclaimer, sponsor statement, or legal
	 * notice of any sort. Note that the inclusion of such a notice cannot and does not imply that a user of the ONIX record is obliged to
	 * reproduce it.
	 */
	Publisher_s_notice("13"), //

	/**
	 * A short excerpt from the work.
	 */
	Excerpt("14"), //

	/**
	 * Used for an index sent as a single text field, which may be structured using XHTML.
	 */
	Index("15"), //

	/**
	 * (of which the product is a part.) Limited to a maximum of 350 characters.
	 */
	Short_description_annotation_for_collection("16"), //

	/**
	 * (of which the product is a part.) Length unrestricted.
	 */
	Description_for_collection("17"), //

	/**
	 * As code 11 but used for a new feature of this edition or version.
	 */
	New_feature("18"), //

	Version_history("19"), //

	/**
	 * Short summary statement of open access status and any related conditions (eg “Open access – no commercial use”), primarily for
	 * marketing purposes. Should always be accompanied by a link to the complete license (see <EpubLicense> or code 99 in List 158).
	 */
	Open_access_statement("20"), //

	/**
	 * Short summary statement that the product is available only in digital formats (eg “Digital exclusive”). If a non-digital version is
	 * planned, <ContentDate> can be used to specify the date when exclusivity will end (use content date role code 15).
	 */
	Digital_exclusivity_statement("21");

	public final String value;

	private List153(String value)
	{
		this.value = value;
	}

	private static Map<String, List153> map;

	private static Map<String, List153> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (List153 e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static List153 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
