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
 * Creation date: 01-08-2010
 * 
 * XDoclet definition:
 * @struts.form name="deletePostsForm"
 */
public class DeletePostsForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** section property */
	private String section;

	/** postsContent property */
	private String postsContent;

	/** author property */
	private String author;

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
	 * Returns the section.
	 * @return String
	 */
	public String getSection() {
		return section;
	}

	/** 
	 * Set the section.
	 * @param section The section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/** 
	 * Returns the postsContent.
	 * @return String
	 */
	public String getPostsContent() {
		return postsContent;
	}

	/** 
	 * Set the postsContent.
	 * @param postsContent The postsContent to set
	 */
	public void setPostsContent(String postsContent) {
		this.postsContent = postsContent;
	}

	/** 
	 * Returns the author.
	 * @return String
	 */
	public String getAuthor() {
		return author;
	}

	/** 
	 * Set the author.
	 * @param author The author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
}