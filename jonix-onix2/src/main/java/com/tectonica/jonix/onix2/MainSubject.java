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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.MainSubjectSchemeIdentifiers;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixMainSubject;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Main subject composite</h1>
 * <p>
 * An optional and repeatable group of data elements which together describe a main subject classification or subject
 * heading which is taken from a recognized scheme other than BISAC or BIC.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;MainSubject&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;mainsubject&gt;</td>
 * </tr>
 * </table>
 */
public class MainSubject implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "MainSubject";
	public static final String shortname = "mainsubject";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is required)
	 */
	public MainSubjectSchemeIdentifier mainSubjectSchemeIdentifier;

	/**
	 * (this field is optional)
	 */
	public SubjectSchemeVersion subjectSchemeVersion;

	/**
	 * (this field is required)
	 */
	public SubjectCode subjectCode;

	/**
	 * (this field is optional)
	 */
	public SubjectHeadingText subjectHeadingText;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public MainSubject()
	{}

	public MainSubject(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(MainSubjectSchemeIdentifier.refname)
						|| name.equals(MainSubjectSchemeIdentifier.shortname))
					mainSubjectSchemeIdentifier = new MainSubjectSchemeIdentifier(element);
				else if (name.equals(SubjectSchemeVersion.refname) || name.equals(SubjectSchemeVersion.shortname))
					subjectSchemeVersion = new SubjectSchemeVersion(element);
				else if (name.equals(SubjectCode.refname) || name.equals(SubjectCode.shortname))
					subjectCode = new SubjectCode(element);
				else if (name.equals(SubjectHeadingText.refname) || name.equals(SubjectHeadingText.shortname))
					subjectHeadingText = new SubjectHeadingText(element);
			}
		});
	}

	public MainSubjectSchemeIdentifiers getMainSubjectSchemeIdentifierValue()
	{
		return (mainSubjectSchemeIdentifier == null) ? null : mainSubjectSchemeIdentifier.value;
	}

	/**
	 * Raw Format: Free form. Suggested maximum length 10 characters, for consistency with other version number
	 * elements.
	 */
	public String getSubjectSchemeVersionValue()
	{
		return (subjectSchemeVersion == null) ? null : subjectSchemeVersion.value;
	}

	/**
	 * Raw Format: Variable-length, alphanumeric, suggested maximum length 20 characters.
	 */
	public String getSubjectCodeValue()
	{
		return (subjectCode == null) ? null : subjectCode.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters.
	 */
	public String getSubjectHeadingTextValue()
	{
		return (subjectHeadingText == null) ? null : subjectHeadingText.value;
	}

	public JonixMainSubject asJonixMainSubject()
	{
		JonixMainSubject x = new JonixMainSubject();
		x.mainSubjectSchemeIdentifier = getMainSubjectSchemeIdentifierValue();
		x.subjectSchemeVersion = getSubjectSchemeVersionValue();
		x.subjectCode = getSubjectCodeValue();
		x.subjectHeadingText = getSubjectHeadingTextValue();
		return x;
	}
}
