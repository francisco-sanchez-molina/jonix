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
import com.tectonica.jonix.codelist.CountryCodes;
import com.tectonica.jonix.codelist.ProductContentTypes;
import com.tectonica.jonix.codelist.ProductFormDetailsList175;
import com.tectonica.jonix.codelist.ProductFormFeatureTypes;
import com.tectonica.jonix.codelist.ProductFormsList150;
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixProductFormFeature;
import com.tectonica.jonix.struct.JonixProductIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Product part composite</h1>
 * <p>
 * A repeatable group of data elements which together describe an item which is part of or contained within a
 * multiple-item product or a trade pack. The composite must be used with all multiple-item products to specify (for
 * example) the item(s) and item quantities included in a multi-volume set, a filled dumpbin, or a classroom pack. In
 * other cases, where parts are not individually identified, it is used to state the product form(s) and the quantity or
 * quantities of each form contained within the product.
 * </p>
 * <p>
 * Each instance of the &lt;ProductPart&gt; composite must carry a &lt;ProductForm&gt; code and a quantity, even if the
 * quantity is ‘1’. If the composite refers to a number of copies of a single item, the quantity must be sent as
 * &lt;NumberOfCopies&gt;, normally accompanied by a &lt;ProductIdentifier&gt;. If the composite refers to a number of
 * <em>different</em> items of the same form, without identifying them individually, the quantity must be sent as
 * &lt;NumberOfItemsOfThisForm&gt;.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ProductPart&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;productpart&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class ProductPart implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ProductPart";
	public static final String shortname = "productpart";

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
	 * (this field is optional)
	 */
	public PrimaryPart primaryPart;

	/**
	 * (this list may be empty)
	 */
	public List<ProductIdentifier> productIdentifiers;

	/**
	 * (this field is required)
	 */
	public ProductForm productForm;

	/**
	 * (this list may be empty)
	 */
	public List<ProductFormDetail> productFormDetails;

	/**
	 * (this list may be empty)
	 */
	public List<ProductFormFeature> productFormFeatures;

	/**
	 * (this list may be empty)
	 */
	public List<ProductFormDescription> productFormDescriptions;

	/**
	 * (this list may be empty)
	 */
	public List<ProductContentType> productContentTypes;

	/**
	 * (this field is required)
	 */
	public NumberOfItemsOfThisForm numberOfItemsOfThisForm;

	/**
	 * (this field is optional)
	 */
	public NumberOfCopies numberOfCopies;

	/**
	 * (this field is optional)
	 */
	public CountryOfManufacture countryOfManufacture;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public ProductPart()
	{}

	public ProductPart(org.w3c.dom.Element element)
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
				if (name.equals(PrimaryPart.refname) || name.equals(PrimaryPart.shortname))
					primaryPart = new PrimaryPart(element);
				else if (name.equals(ProductIdentifier.refname) || name.equals(ProductIdentifier.shortname))
					productIdentifiers = JPU.addToList(productIdentifiers, new ProductIdentifier(element));
				else if (name.equals(ProductForm.refname) || name.equals(ProductForm.shortname))
					productForm = new ProductForm(element);
				else if (name.equals(ProductFormDetail.refname) || name.equals(ProductFormDetail.shortname))
					productFormDetails = JPU.addToList(productFormDetails, new ProductFormDetail(element));
				else if (name.equals(ProductFormFeature.refname) || name.equals(ProductFormFeature.shortname))
					productFormFeatures = JPU.addToList(productFormFeatures, new ProductFormFeature(element));
				else if (name.equals(ProductFormDescription.refname) || name.equals(ProductFormDescription.shortname))
					productFormDescriptions = JPU.addToList(productFormDescriptions,
							new ProductFormDescription(element));
				else if (name.equals(ProductContentType.refname) || name.equals(ProductContentType.shortname))
					productContentTypes = JPU.addToList(productContentTypes, new ProductContentType(element));
				else if (name.equals(NumberOfItemsOfThisForm.refname) || name.equals(NumberOfItemsOfThisForm.shortname))
					numberOfItemsOfThisForm = new NumberOfItemsOfThisForm(element);
				else if (name.equals(NumberOfCopies.refname) || name.equals(NumberOfCopies.shortname))
					numberOfCopies = new NumberOfCopies(element);
				else if (name.equals(CountryOfManufacture.refname) || name.equals(CountryOfManufacture.shortname))
					countryOfManufacture = new CountryOfManufacture(element);
			}
		});
	}

	public boolean isPrimaryPart()
	{
		return (primaryPart != null);
	}

	public ProductFormsList150 getProductFormValue()
	{
		return (productForm == null) ? null : productForm.value;
	}

	public List<ProductFormDetailsList175> getProductFormDetailValues()
	{
		if (productFormDetails != null)
		{
			List<ProductFormDetailsList175> list = new ArrayList<>();
			for (ProductFormDetail i : productFormDetails)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters
	 */
	public List<String> getProductFormDescriptionValues()
	{
		if (productFormDescriptions != null)
		{
			List<String> list = new ArrayList<>();
			for (ProductFormDescription i : productFormDescriptions)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<ProductContentTypes> getProductContentTypeValues()
	{
		if (productContentTypes != null)
		{
			List<ProductContentTypes> list = new ArrayList<>();
			for (ProductContentType i : productContentTypes)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length integer, maximum four digits
	 */
	public Integer getNumberOfItemsOfThisFormValue()
	{
		return (numberOfItemsOfThisForm == null) ? null : numberOfItemsOfThisForm.value;
	}

	/**
	 * Raw Format: Variable-length integer, maximum four digits
	 */
	public Integer getNumberOfCopiesValue()
	{
		return (numberOfCopies == null) ? null : numberOfCopies.value;
	}

	public CountryCodes getCountryOfManufactureValue()
	{
		return (countryOfManufacture == null) ? null : countryOfManufacture.value;
	}

	public JonixProductIdentifier findProductIdentifier(ProductIdentifierTypes productIDType)
	{
		if (productIdentifiers != null)
		{
			for (ProductIdentifier x : productIdentifiers)
			{
				if (x.getProductIDTypeValue() == productIDType)
					return x.asJonixProductIdentifier();
			}
		}
		return null;
	}

	public List<JonixProductIdentifier> findProductIdentifiers(java.util.Set<ProductIdentifierTypes> productIDTypes)
	{
		if (productIdentifiers != null)
		{
			List<JonixProductIdentifier> matches = new ArrayList<>();
			for (ProductIdentifier x : productIdentifiers)
			{
				if (productIDTypes == null || productIDTypes.contains(x.getProductIDTypeValue()))
					matches.add(x.asJonixProductIdentifier());
			}
			return matches;
		}
		return null;
	}

	public JonixProductFormFeature findProductFormFeature(ProductFormFeatureTypes productFormFeatureType)
	{
		if (productFormFeatures != null)
		{
			for (ProductFormFeature x : productFormFeatures)
			{
				if (x.getProductFormFeatureTypeValue() == productFormFeatureType)
					return x.asJonixProductFormFeature();
			}
		}
		return null;
	}

	public List<JonixProductFormFeature> findProductFormFeatures(
			java.util.Set<ProductFormFeatureTypes> productFormFeatureTypes)
	{
		if (productFormFeatures != null)
		{
			List<JonixProductFormFeature> matches = new ArrayList<>();
			for (ProductFormFeature x : productFormFeatures)
			{
				if (productFormFeatureTypes == null
						|| productFormFeatureTypes.contains(x.getProductFormFeatureTypeValue()))
					matches.add(x.asJonixProductFormFeature());
			}
			return matches;
		}
		return null;
	}
}
