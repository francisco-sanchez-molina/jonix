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

package com.tectonica.jonix.codelist;

import com.tectonica.jonix.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 16</b>
 * <p>
 * Description: Work identifier type code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist16">ONIX
 *      Codelist 16 in Reference Guide</a>
 */
public enum WorkIdentifierTypes implements OnixCodelist
{
	Proprietary("01", "Proprietary"), //

	/**
	 * 10-character ISBN of manifestation of work, when this is the only work identifier available - now DEPRECATED in
	 * ONIX for Books, except where providing historical information for compatibility with legacy systems. It should
	 * only be used in relation to products published before 2007 - when ISBN-13 superseded it - and should never be
	 * used as the ONLY identifier (it should always be accompanied by the correct GTIN-13 / ISBN-13 of the
	 * manifestation of the work)
	 */
	ISBN_10("02", "ISBN-10"), //

	/**
	 * Digital Object Identifier (variable length and character set)
	 */
	DOI("06", "DOI"), //

	/**
	 * International Standard Text Code (16 characters: numerals and letters A-F, unhyphenated)
	 */
	ISTC("11", "ISTC"), //

	/**
	 * 13-character ISBN of manifestation of work, when this is the only work identifier available
	 */
	ISBN_13("15", "ISBN-13"), //

	/**
	 * International Standard Recording Code
	 */
	ISRC("18", "ISRC");

	public final String code;
	public final String description;

	private WorkIdentifierTypes(String code, String description)
	{
		this.code = code;
		this.description = description;
	}

	@Override
	public String getCode()
	{
		return code;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	public static WorkIdentifierTypes byCode(String code)
	{
		if (code == null || code.isEmpty())
			return null;
		for (WorkIdentifierTypes e : values())
			if (e.code.equals(code))
				return e;
		return null;
	}
}
