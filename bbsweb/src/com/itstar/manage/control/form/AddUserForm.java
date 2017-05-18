/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.itstar.manage.control.form;



import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;


/** 
 * MyEclipse Struts
 * Creation date: 01-22-2010
 * 
 * XDoclet definition:
 * @struts.form name="addUserForm"
 */
public class AddUserForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** userName property */
	private String userName;

	/** userSex property */
	private String userSex;

	/** userPassword property */
	private String userPassword;

	/** image property */
	private FormFile image;

	/** userNName property */
	private String userNName;
	
	/** userEmail property */
	private String userEmail;
	
	/** fileName property */
	private String fileName;

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
	 * Returns the userName.
	 * @return String
	 */
	public String getUserName() {
		return userName;
	}

	/** 
	 * Set the userName.
	 * @param userName The userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** 
	 * Returns the userSex.
	 * @return String
	 */
	public String getUserSex() {
		return userSex;
	}

	/** 
	 * Set the userSex.
	 * @param userSex The userSex to set
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	/** 
	 * Returns the userPassword.
	 * @return String
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/** 
	 * Set the userPassword.
	 * @param userPassword The userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/** 
	 * Returns the image.
	 * @return String
	 */
	public FormFile getImage() {
		return image;
	}

	/** 
	 * Set the image.
	 * @param image The image to set
	 */
	public void setImage(FormFile image) {
		this.image = image;
	}

	/** 
	 * Returns the userNName.
	 * @return String
	 */
	public String getUserNName() {
		return userNName;
	}

	/** 
	 * Set the userNName.
	 * @param userNName The userNName to set
	 */
	public void setUserNName(String userNName) {
		this.userNName = userNName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}