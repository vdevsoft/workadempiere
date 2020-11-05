/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.wipelectric.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for mp_matcon
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_mp_matcon extends PO implements I_mp_matcon, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_mp_matcon (Properties ctx, int mp_matcon_ID, String trxName)
    {
      super (ctx, mp_matcon_ID, trxName);
      /** if (mp_matcon_ID == 0)
        {
			setmp_matcon_ID (0);
        } */
    }

    /** Load Constructor */
    public X_mp_matcon (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_mp_matcon[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set mp_matcon ID.
		@param mp_matcon_ID mp_matcon ID	  */
	public void setmp_matcon_ID (int mp_matcon_ID)
	{
		if (mp_matcon_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_mp_matcon_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_mp_matcon_ID, Integer.valueOf(mp_matcon_ID));
	}

	/** Get mp_matcon ID.
		@return mp_matcon ID	  */
	public int getmp_matcon_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_mp_matcon_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}