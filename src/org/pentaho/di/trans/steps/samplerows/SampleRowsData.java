/*
 * Copyright (c) 2007 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt. The Original Code is Pentaho 
 * Data Integration.  The Initial Developer is Samatar HASSAN.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.di.trans.steps.samplerows;

import java.util.Set;
import java.util.HashSet;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * @author Samatar
 * @since 24-jan-2008
 *
 */
public class SampleRowsData extends BaseStepData implements StepDataInterface
{

	public Set<Integer> range;
	public int maxLine;
	public boolean addlineField;
	public RowMetaInterface previousRowMeta;
	public RowMetaInterface outputRowMeta;
	public Object[] outputRow;
	public int NrPrevFields;
	
	/**
	 * 
	 */
	public SampleRowsData()
	{
		super();
		range = new HashSet<Integer>();
		maxLine=0;
		addlineField=false;
		outputRow=null;
	}

}
