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

/**
 * Price status code
 */
public enum List61
{
	/**
	 * Default.
	 */
	Unspecified("00"), //

	Provisional("01"), //

	Firm("02");

	public final String value;

	private List61(String value)
	{
		this.value = value;
	}

	public static List61 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (List61 e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
