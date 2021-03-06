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

import java.util.HashMap;
import java.util.Map;

import com.tectonica.jonix.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 58</b>
 * <p>
 * Description: Price type code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist58">ONIX
 *      Codelist 58 in Reference Guide</a>
 */
public enum PriceTypes implements OnixCodelist
{
	/**
	 * RRP excluding any sales tax or value-added tax
	 */
	RRP_excluding_tax("01", "RRP excluding tax"), //

	/**
	 * RRP including sales or value-added tax if applicable
	 */
	RRP_including_tax("02", "RRP including tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Fixed_retail_price_excluding_tax("03", "Fixed retail price excluding tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Fixed_retail_price_including_tax("04", "Fixed retail price including tax"), //

	/**
	 * Unit price charged by supplier to reseller excluding any sales tax or value-added tax: goods for retail sale
	 */
	Supplier_s_net_price_excluding_tax("05", "Supplier’s net price excluding tax"), //

	/**
	 * Unit price charged by supplier to reseller / rental outlet, excluding any sales tax or value-added tax: goods for
	 * rental (used for video and DVD)
	 */
	Supplier_s_net_price_excluding_tax_rental_goods("06", "Supplier’s net price excluding tax: rental goods"), //

	/**
	 * Unit price charged by supplier to reseller including any sales tax or value-added tax if applicable: goods for
	 * retail sale
	 */
	Supplier_s_net_price_including_tax("07", "Supplier’s net price including tax"), //

	/**
	 * Unit price charged by supplier to a specified class of reseller excluding any sales tax or value-added tax: goods
	 * for retail sale (this value is for use only in countries, eg Finland, where trade practice requires two different
	 * net prices to be listed for different classes of resellers, and where national guidelines specify how the code
	 * should be used)
	 */
	Supplier_s_alternative_net_price_excluding_tax("08", "Supplier’s alternative net price excluding tax"), //

	/**
	 * Unit price charged by supplier to a specified class of reseller including any sales tax or value-added tax: goods
	 * for retail sale (this value is for use only in countries, eg Finland, where trade practice requires two different
	 * net prices to be listed for different classes of resellers, and where national guidelines specify how the code
	 * should be used)
	 */
	Supplier_s_alternative_net_price_including_tax("09", "Supplier’s alternative net price including tax"), //

	/**
	 * Special sale RRP excluding any sales tax or value-added tax. Note 'special sales' are sales where terms and
	 * conditions are different from normal trade sales, when for example products that are normally sold on a
	 * sale-or-return basis are sold on firm-sale terms, where a particular product is tailored for a specific retail
	 * outlet (often termed a 'premium'&#160;product), or where other specific conditions or qualiifications apply.
	 * Further details of the modified terms and conditions should be given in &lt;PriceTypeDescription&gt;
	 */
	Special_sale_RRP_excluding_tax("11", "Special sale RRP excluding tax"), //

	/**
	 * Special sale RRP including sales or value-added tax if applicable
	 */
	Special_sale_RRP_including_tax("12", "Special sale RRP including tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Special_sale_fixed_retail_price_excluding_tax("13", "Special sale fixed retail price excluding tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Special_sale_fixed_retail_price_including_tax("14", "Special sale fixed retail price including tax"), //

	/**
	 * Unit price charged by supplier to reseller for special sale excluding any sales tax or value-added tax
	 */
	Supplier_s_net_price_for_special_sale_excluding_tax("15", "Supplier’s net price for special sale excluding tax"), //

	/**
	 * Unit price charged by supplier to reseller for special sale including any sales tax or value-added tax
	 */
	Supplier_s_net_price_for_special_sale_including_tax("17", "Supplier’s net price for special sale including tax"), //

	/**
	 * Pre-publication RRP excluding any sales tax or value-added tax. Use where RRP for pre-orders is different from
	 * post-publication RRP
	 */
	Pre_publication_RRP_excluding_tax("21", "Pre-publication RRP excluding tax"), //

	/**
	 * Pre-publication RRP including sales or value-added tax if applicable. Use where RRP for pre-orders is different
	 * from post-publication RRP
	 */
	Pre_publication_RRP_including_tax("22", "Pre-publication RRP including tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Pre_publication_fixed_retail_price_excluding_tax("23", "Pre-publication fixed retail price excluding tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products: not used in USA
	 */
	Pre_publication_fixed_retail_price_including_tax("24", "Pre-publication fixed retail price including tax"), //

	/**
	 * Unit price charged by supplier to reseller pre-publication excluding any sales tax or value-added tax
	 */
	Supplier_s_pre_publication_net_price_excluding_tax("25", "Supplier’s pre-publication net price excluding tax"), //

	/**
	 * Unit price charged by supplier to reseller pre-publication including any sales tax or value-added tax
	 */
	Supplier_s_pre_publication_net_price_including_tax("27", "Supplier’s pre-publication net price including tax"), //

	/**
	 * In the US, books are sometimes supplied on 'freight-pass-through' terms, where a price that is different from the
	 * RRP is used as the basis for calculating the supplier's charge to a reseller. To make it clear when such terms
	 * are being invoked, code 31 is used instead of code 01 to indicate the RRP. Code 32 is used for the 'billing
	 * price'
	 */
	Freight_pass_through_RRP_excluding_tax("31", "Freight-pass-through RRP excluding tax"), //

	/**
	 * When freight-pass-through terms apply, the price on which the supplier's charge to a reseller is calculated, ie
	 * the price to which trade discount terms are applied. See also code 31
	 */
	Freight_pass_through_billing_price_excluding_tax("32", "Freight-pass-through billing price excluding tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products, but the price is set by the
	 * importer or local sales agent, not the foreign publisher. In France, 'prix catalogue &#233;diteur &#233;tranger'
	 * &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Importer_s_Fixed_retail_price_excluding_tax("33", "Importer’s Fixed retail price excluding tax"), //

	/**
	 * In countries where retail price maintenance applies by law to certain products, but the price is set by the
	 * importer or local sales agent, not the foreign publisher. In France, 'prix catalogue &#233;diteur &#233;tranger'
	 * &lt;p&gt;NOTE: Introduced in Onix3
	 */
	Importer_s_Fixed_retail_price_including_tax("34", "Importer’s Fixed retail price including tax"), //

	/**
	 * For a product supplied on agency terms, the retail price set by the publisher, excluding any sales tax or
	 * value-added tax
	 */
	Publishers_retail_price_excluding_tax("41", "Publishers retail price excluding tax"), //

	/**
	 * For a product supplied on agency terms, the retail price set by the publisher, including sales or value-added tax
	 * if applicable
	 */
	Publishers_retail_price_including_tax("42", "Publishers retail price including tax");

	public final String code;
	public final String description;

	private PriceTypes(String code, String description)
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

	private static Map<String, PriceTypes> map;

	private static Map<String, PriceTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (PriceTypes e : values())
				map.put(e.code, e);
		}
		return map;
	}

	public static PriceTypes byCode(String code)
	{
		if (code == null || code.isEmpty())
			return null;
		return map().get(code);
	}
}
