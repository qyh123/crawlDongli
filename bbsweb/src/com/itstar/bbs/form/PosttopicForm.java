/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.itstar.bbs.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 01-21-2010
 * 
 * XDoclet definition:
 * @struts.form name="posttopicForm"
 */
public class PosttopicForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** topicContent property */
	private String topicContent;

	/** sectionID property */
	private String sectionId;

	/** topicTopic property */
	private String topicTopic;
	
	/** userId property */
	private int userId; 
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
	 * Returns the topicContent.
	 * @return String
	 */
	public String getTopicContent() {
		return topicContent;
	}

	/** 
	 * Set the topicContent.
	 * @param topicContent The topicContent to set
	 */
	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}

	/** 
	 * Returns the sectionID.
	 * @return String
	 */
	public String getSectionId() {
		return sectionId;
	}

	/** 
	 * Set the sectionID.
	 * @param sectionID The sectionID to set
	 */
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	/** 
	 * Returns the topicTopic.
	 * @return String
	 */
	public String getTopicTopic() {
		return topicTopic;
	}

	/** 
	 * Set the topicTopic.
	 * @param topicTopic The topicTopic to set
	 */
	public void setTopicTopic(String topicTopic) {
		this.topicTopic = topicTopic;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
}