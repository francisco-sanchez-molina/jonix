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
import com.tectonica.jonix.codelist.ImageAudioVideoFileFormats;
import com.tectonica.jonix.codelist.ImageAudioVideoFileLinkTypes;
import com.tectonica.jonix.codelist.ImageAudioVideoFileTypes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixMediaFile;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Media file composite</h1>
 * <p>
 * An optional and repeatable group of data elements which together identify and provide pointers to an image, audio or
 * video file, used here to indicate that there is a new cover or jacket image for a reissue. <strong>Please see
 * Group&nbsp;PR.16 for details.</strong>
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;MediaFile&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;mediafile&gt;</td>
 * </tr>
 * </table>
 */
public class MediaFile implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "MediaFile";
	public static final String shortname = "mediafile";

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
	public MediaFileTypeCode mediaFileTypeCode;

	/**
	 * (this field is optional)
	 */
	public MediaFileFormatCode mediaFileFormatCode;

	/**
	 * (this field is optional)
	 */
	public ImageResolution imageResolution;

	/**
	 * (this field is required)
	 */
	public MediaFileLinkTypeCode mediaFileLinkTypeCode;

	/**
	 * (this field is required)
	 */
	public MediaFileLink mediaFileLink;

	/**
	 * (this field is optional)
	 */
	public TextWithDownload textWithDownload;

	/**
	 * (this field is required)
	 */
	public DownloadCaption downloadCaption;

	/**
	 * (this field is optional)
	 */
	public DownloadCredit downloadCredit;

	/**
	 * (this field is optional)
	 */
	public DownloadCopyrightNotice downloadCopyrightNotice;

	/**
	 * (this field is optional)
	 */
	public DownloadTerms downloadTerms;

	/**
	 * (this field is optional)
	 */
	public MediaFileDate mediaFileDate;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public MediaFile()
	{}

	public MediaFile(org.w3c.dom.Element element)
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
				if (name.equals(MediaFileTypeCode.refname) || name.equals(MediaFileTypeCode.shortname))
					mediaFileTypeCode = new MediaFileTypeCode(element);
				else if (name.equals(MediaFileFormatCode.refname) || name.equals(MediaFileFormatCode.shortname))
					mediaFileFormatCode = new MediaFileFormatCode(element);
				else if (name.equals(ImageResolution.refname) || name.equals(ImageResolution.shortname))
					imageResolution = new ImageResolution(element);
				else if (name.equals(MediaFileLinkTypeCode.refname) || name.equals(MediaFileLinkTypeCode.shortname))
					mediaFileLinkTypeCode = new MediaFileLinkTypeCode(element);
				else if (name.equals(MediaFileLink.refname) || name.equals(MediaFileLink.shortname))
					mediaFileLink = new MediaFileLink(element);
				else if (name.equals(TextWithDownload.refname) || name.equals(TextWithDownload.shortname))
					textWithDownload = new TextWithDownload(element);
				else if (name.equals(DownloadCaption.refname) || name.equals(DownloadCaption.shortname))
					downloadCaption = new DownloadCaption(element);
				else if (name.equals(DownloadCredit.refname) || name.equals(DownloadCredit.shortname))
					downloadCredit = new DownloadCredit(element);
				else if (name.equals(DownloadCopyrightNotice.refname) || name.equals(DownloadCopyrightNotice.shortname))
					downloadCopyrightNotice = new DownloadCopyrightNotice(element);
				else if (name.equals(DownloadTerms.refname) || name.equals(DownloadTerms.shortname))
					downloadTerms = new DownloadTerms(element);
				else if (name.equals(MediaFileDate.refname) || name.equals(MediaFileDate.shortname))
					mediaFileDate = new MediaFileDate(element);
			}
		});
	}

	public ImageAudioVideoFileTypes getMediaFileTypeCodeValue()
	{
		return (mediaFileTypeCode == null) ? null : mediaFileTypeCode.value;
	}

	public ImageAudioVideoFileFormats getMediaFileFormatCodeValue()
	{
		return (mediaFileFormatCode == null) ? null : mediaFileFormatCode.value;
	}

	/**
	 * Raw Format: Variable-length integer, suggested maximum length 6 digits
	 */
	public String getImageResolutionValue()
	{
		return (imageResolution == null) ? null : imageResolution.value;
	}

	public ImageAudioVideoFileLinkTypes getMediaFileLinkTypeCodeValue()
	{
		return (mediaFileLinkTypeCode == null) ? null : mediaFileLinkTypeCode.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters
	 */
	public String getMediaFileLinkValue()
	{
		return (mediaFileLink == null) ? null : mediaFileLink.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 1,000 characters (XHTML is enabled in this element -
	 * see ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getTextWithDownloadValue()
	{
		return (textWithDownload == null) ? null : textWithDownload.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 500 characters (XHTML is enabled in this element - see
	 * ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getDownloadCaptionValue()
	{
		return (downloadCaption == null) ? null : downloadCaption.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters (XHTML is enabled in this element - see
	 * ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getDownloadCreditValue()
	{
		return (downloadCredit == null) ? null : downloadCredit.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters (XHTML is enabled in this element - see
	 * ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getDownloadCopyrightNoticeValue()
	{
		return (downloadCopyrightNotice == null) ? null : downloadCopyrightNotice.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 500 characters (XHTML is enabled in this element - see
	 * ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getDownloadTermsValue()
	{
		return (downloadTerms == null) ? null : downloadTerms.value;
	}

	/**
	 * Raw Format: Fixed-length, 8 numeric digits, YYYYMMDD
	 */
	public String getMediaFileDateValue()
	{
		return (mediaFileDate == null) ? null : mediaFileDate.value;
	}

	public JonixMediaFile asJonixMediaFile()
	{
		JonixMediaFile x = new JonixMediaFile();
		x.mediaFileTypeCode = getMediaFileTypeCodeValue();
		x.mediaFileFormatCode = getMediaFileFormatCodeValue();
		x.imageResolution = getImageResolutionValue();
		x.mediaFileLinkTypeCode = getMediaFileLinkTypeCodeValue();
		x.mediaFileLink = getMediaFileLinkValue();
		x.textWithDownload = getTextWithDownloadValue();
		x.downloadCaption = getDownloadCaptionValue();
		x.downloadCredit = getDownloadCreditValue();
		x.downloadCopyrightNotice = getDownloadCopyrightNoticeValue();
		x.downloadTerms = getDownloadTermsValue();
		x.mediaFileDate = getMediaFileDateValue();
		return x;
	}
}
