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

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Message creation date/time</h1>
 * <p>
 * The date on which the message is sent. Optionally, the time may be added, using the 24-hour clock, with an explicit
 * indication of the time zone if required, in a format based on ISO 8601. Mandatory and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Permitted formats, where 'T' and 'Z' represent themselves (ie the letters T and Z), and where the symbol '&#177;'
 * represents either '+' or '-' to indicate a timezone offset from UTC. YYYYMMDD Date only YYYYMMDDThhmm Date and time
 * (local time of sender) YYYYMMDDThhmmZ Universal time (UTC) &#8224; YYYYMMDDThhmm&#177;hhmm With time zone offset from
 * UTC &#8224; YYYYMMDDThhmmss Date and time (with seconds) YYYYMMDDThhmmssZ Universal time (with seconds)
 * YYYYMMDDThhmmss&#177;hhmm With time zone offset from UTC (with seconds) &#8224; indicates the preferred formats</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;SentDateTime&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;x307&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;x307&gt;20100522T1230Z&lt;/x307&gt; (12.30pm UTC, 22 May 2010)</td>
 * </tr>
 * <tr>
 * <td>Notes</td>
 * <td>The calendar date must use the Gregorian calendar, even if other dates within the message use a different
 * calendar. For all practical purposes, UTC is the same as GMT.</td>
 * </tr>
 * </table>
 */
public class SentDateTime implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "SentDateTime";
	public static final String shortname = "x307";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Permitted formats, where 'T' and 'Z' represent themselves (ie the letters T and Z), and where the
	 * symbol '&#177;' represents either '+' or '-' to indicate a timezone offset from UTC. YYYYMMDD Date only
	 * YYYYMMDDThhmm Date and time (local time of sender) YYYYMMDDThhmmZ Universal time (UTC) &#8224;
	 * YYYYMMDDThhmm&#177;hhmm With time zone offset from UTC &#8224; YYYYMMDDThhmmss Date and time (with seconds)
	 * YYYYMMDDThhmmssZ Universal time (with seconds) YYYYMMDDThhmmss&#177;hhmm With time zone offset from UTC (with
	 * seconds) &#8224; indicates the preferred formats
	 * <p>
	 * (type: dt.DateOrDateTime)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public SentDateTime()
	{}

	public SentDateTime(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getContentAsString(element);
	}
}
