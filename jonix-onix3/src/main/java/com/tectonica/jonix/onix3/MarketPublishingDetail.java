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
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.MarketPublishingStatuss;
import com.tectonica.jonix.codelist.PublishingDateRoles;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixMarketDate;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Market publishing detail composite</h1>
 * <p>
 * A group of data elements which together give details of the publishing status of a product within a specified market.
 * Optional and non-repeating within an occurrence of the &lt;ProductSupply&gt; block.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;MarketPublishingDetail&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;marketpublishingdetail&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * </table>
 */
public class MarketPublishingDetail implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "MarketPublishingDetail";
	public static final String shortname = "marketpublishingdetail";

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
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this list may be empty)
	 */
	public List<PublisherRepresentative> publisherRepresentatives;

	/**
	 * (this list may be empty)
	 */
	public List<ProductContact> productContacts;

	/**
	 * (this field is required)
	 */
	public MarketPublishingStatus marketPublishingStatus;

	/**
	 * (this list may be empty)
	 */
	public List<MarketPublishingStatusNote> marketPublishingStatusNotes;

	/**
	 * (this list may be empty)
	 */
	public List<MarketDate> marketDates;

	/**
	 * (this list may be empty)
	 */
	public List<PromotionCampaign> promotionCampaigns;

	/**
	 * (this field is optional)
	 */
	public PromotionContact promotionContact;

	/**
	 * (this list may be empty)
	 */
	public List<InitialPrintRun> initialPrintRuns;

	/**
	 * (this list may be empty)
	 */
	public List<ReprintDetail> reprintDetails;

	/**
	 * (this list may be empty)
	 */
	public List<CopiesSold> copiesSolds;

	/**
	 * (this list may be empty)
	 */
	public List<BookClubAdoption> bookClubAdoptions;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public MarketPublishingDetail()
	{}

	public MarketPublishingDetail(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(PublisherRepresentative.refname) || name.equals(PublisherRepresentative.shortname))
					publisherRepresentatives = JPU.addToList(publisherRepresentatives, new PublisherRepresentative(
							element));
				else if (name.equals(ProductContact.refname) || name.equals(ProductContact.shortname))
					productContacts = JPU.addToList(productContacts, new ProductContact(element));
				else if (name.equals(MarketPublishingStatus.refname) || name.equals(MarketPublishingStatus.shortname))
					marketPublishingStatus = new MarketPublishingStatus(element);
				else if (name.equals(MarketPublishingStatusNote.refname)
						|| name.equals(MarketPublishingStatusNote.shortname))
					marketPublishingStatusNotes = JPU.addToList(marketPublishingStatusNotes,
							new MarketPublishingStatusNote(element));
				else if (name.equals(MarketDate.refname) || name.equals(MarketDate.shortname))
					marketDates = JPU.addToList(marketDates, new MarketDate(element));
				else if (name.equals(PromotionCampaign.refname) || name.equals(PromotionCampaign.shortname))
					promotionCampaigns = JPU.addToList(promotionCampaigns, new PromotionCampaign(element));
				else if (name.equals(PromotionContact.refname) || name.equals(PromotionContact.shortname))
					promotionContact = new PromotionContact(element);
				else if (name.equals(InitialPrintRun.refname) || name.equals(InitialPrintRun.shortname))
					initialPrintRuns = JPU.addToList(initialPrintRuns, new InitialPrintRun(element));
				else if (name.equals(ReprintDetail.refname) || name.equals(ReprintDetail.shortname))
					reprintDetails = JPU.addToList(reprintDetails, new ReprintDetail(element));
				else if (name.equals(CopiesSold.refname) || name.equals(CopiesSold.shortname))
					copiesSolds = JPU.addToList(copiesSolds, new CopiesSold(element));
				else if (name.equals(BookClubAdoption.refname) || name.equals(BookClubAdoption.shortname))
					bookClubAdoptions = JPU.addToList(bookClubAdoptions, new BookClubAdoption(element));
			}
		});
	}

	public MarketPublishingStatuss getMarketPublishingStatusValue()
	{
		return (marketPublishingStatus == null) ? null : marketPublishingStatus.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum 300 characters. XHTML is enabled in this element - see Using
	 * XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getMarketPublishingStatusNoteValues()
	{
		if (marketPublishingStatusNotes != null)
		{
			List<String> list = new ArrayList<>();
			for (MarketPublishingStatusNote i : marketPublishingStatusNotes)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 1,000 characters. XHTML is enabled in this element -
	 * see Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getPromotionCampaignValues()
	{
		if (promotionCampaigns != null)
		{
			List<String> list = new ArrayList<>();
			for (PromotionCampaign i : promotionCampaigns)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public String getPromotionContactValue()
	{
		return (promotionContact == null) ? null : promotionContact.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getInitialPrintRunValues()
	{
		if (initialPrintRuns != null)
		{
			List<String> list = new ArrayList<>();
			for (InitialPrintRun i : initialPrintRuns)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getReprintDetailValues()
	{
		if (reprintDetails != null)
		{
			List<String> list = new ArrayList<>();
			for (ReprintDetail i : reprintDetails)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getCopiesSoldValues()
	{
		if (copiesSolds != null)
		{
			List<String> list = new ArrayList<>();
			for (CopiesSold i : copiesSolds)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getBookClubAdoptionValues()
	{
		if (bookClubAdoptions != null)
		{
			List<String> list = new ArrayList<>();
			for (BookClubAdoption i : bookClubAdoptions)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public JonixMarketDate findMarketDate(PublishingDateRoles marketDateRole)
	{
		if (marketDates != null)
		{
			for (MarketDate x : marketDates)
			{
				if (x.getMarketDateRoleValue() == marketDateRole)
					return x.asJonixMarketDate();
			}
		}
		return null;
	}

	public List<JonixMarketDate> findMarketDates(java.util.Set<PublishingDateRoles> marketDateRoles)
	{
		if (marketDates != null)
		{
			List<JonixMarketDate> matches = new ArrayList<>();
			for (MarketDate x : marketDates)
			{
				if (marketDateRoles == null || marketDateRoles.contains(x.getMarketDateRoleValue()))
					matches.add(x.asJonixMarketDate());
			}
			return matches;
		}
		return null;
	}
}
