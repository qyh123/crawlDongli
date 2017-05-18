/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.itstar.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import com.itstar.bbs.form.UserForm;
import com.itstar.dao.UserDao;
import com.itstar.manage.control.UserProcess;
import com.itstar.manage.dbconnection.DatabaseConnection;
import com.itstar.util.UpLoad;

public class RegisterAction extends  DispatchAction{
	/*
	 * Generated Methods
	 */

	/**
	 * �ж�ע����Ϣ Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws SQLException
	 * @throws IOException
	 * @throws ServletException
	 */
	public ActionForward validateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		UserForm userForm = (UserForm) form;
		String userName = userForm.getUserName();
		PrintWriter out = response.getWriter();
		UserProcess u = UserProcess.getInstance();
		if(userName!=null&& !userName.equals("")) {
			//�ж�������û������ǲ���Ӣ����ĸ�����ֺ�_
			boolean bl = false;
		    byte[] b = userName.getBytes();
		    for(int i =0 ;i <b.length;i++) {
		    	if(b[i]>=48&&b[i]<=57) {
		    		bl= true;
		    	}else if(b[i]>=65&&b[i]<=90) {
		    		bl= true;
		    	}else if(b[i]>=97&&b[i]<=122) {
		    		bl= true;
		    	}else if(b[i]==95) {
		    		bl= true;
		    	}else {
		    		bl= false;	
		    		break;
		    	}
		    }
		    //�жϽ���
		    if(bl==true) {
		    	if (u.findName(userForm.getUserName()) == 1) {
					out.print("�û��ѱ�ע��");
					//request.setAttribute("message2","�û��ѱ�ע��" );

				} else if(userName.length()>15) {
					//request.setAttribute("message2", "�û�û��ע��");
					out.print("�û���������15���ַ�");
				} else {
					out.print("�û�û��ע��");
				}
		    }else {
		    	out.print("���зǷ��ַ�");
		    }	
		} else {
			out.print("������Ϸ����û���");
		}
			return null;
	}
	
	
	/**
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws SQLException 
	 */
	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm) form;
		response.setContentType("text/html;charset=GBK");
	    request.setCharacterEncoding("GBK");
    	FormFile image = null;
    	String fileName = "";
    	boolean bl = false;
    	UpLoad up = new UpLoad();
	    image = userForm.getImage();
        String url = servlet.getServletContext().getRealPath("/uploadHeadImage");
        int fileSize = image.getFileSize();
        
        try {
	 		//���ظ��ύ
		    if(isTokenValid(request)){
		   
		    	if(image != null && fileSize!=0) {
		 			
		    		fileName = "uploadHeadImage\\"+up.upload(url,image);
		    		
		 			userForm.setFileName(fileName);
		 			
		 			System.out.println("userForm:" + userForm.getFileName());
		 			
					UserDao userDao3 = new UserDao();
		 			bl = userDao3.addUser(userForm);
			    	//del.delete(fileName);
		 
		 		} else {
		 			fileName = (url+"\\"+"noavatar.gif");
		 			userForm.setFileName(fileName);
					UserDao userDao3 = new UserDao();
		 			bl = userDao3.addUser(userForm);
		 		}
                saveToken(request);
			} else{
				request.setAttribute("message", "adderror");
		     }
	 	} catch (Exception e) {

			System.out.println("�ļ��ϴ�ʧ��");
	 		e.printStackTrace();
	 		request.setAttribute("message", "adderror");
			
		}
	    if(bl) {
    	    request.setAttribute("message", "addsuccess");
    	    request.setAttribute("userName", userForm.getUserName());
    	    request.setAttribute("userPassword",userForm.getUserPassword());
    	} else {
    		request.setAttribute("message", "adderror");
    	}
	    return mapping.findForward("showMessage");
   }
}