/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.itstar.manage.control.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-20-2010
 * 
 * XDoclet definition:
 * @struts.form name="addSectionForm"
 */
public class AddSectionForm extends ActionForm {
	/*
	 * Generated fields
	 */

	
	private String sectionProfile ;
	/*
	/** sectionName property */
	private String sectionName;

	/** sectionState property */
	private String sectionState;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the sectionName.
	 * @return String
	 */
	public String getSectionName() {
		return sectionName;
	}

	/** 
	 * Set the sectionName.
	 * @param sectionName The sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/** 
	 * Returns the sectionState.
	 * @return String
	 */
	public String getSectionState() {
		return sectionState;
	}

	/** 
	 * Set the sectionState.
	 * @param sectionState The sectionState to set
	 */
	public void setSectionState(String sectionState) {
		this.sectionState = sectionState;
	}

	/**
	 * @return the sectionProfile
	 */
	public String getSectionProfile() {
		return sectionProfile;
	}

	/**
	 * @param sectionProfile the sectionProfile to set
	 */
	public void setSectionProfile(String sectionProfile) {
		this.sectionProfile = sectionProfile;
	}
}