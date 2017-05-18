/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.itstar.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.itstar.bbs.form.UserForm;
import com.itstar.dao.BunUserDao;
import com.itstar.manage.control.UserProcess;
import com.itstar.model.BBSBunUser;
import com.itstar.model.BBSUser;
import com.itstar.util.Utils;

public class LoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
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
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		UserForm userForm = (UserForm) form;
		
		Utils utils = new Utils();
		
		HttpSession session = request.getSession();
		
		String userName = "";
		
		UserProcess u =  UserProcess.getInstance();
		
		BBSUser user = null;
		
		String flag = request.getParameter("flag");
		
		String requestUrl = request.getParameter("pointInfo");
		
		try {
			/*
			 * 判断操作的类型login 是登录操作 out是退出操作
			 */
			if (flag.equals("login")) {
				
				//用户名逗号字符的处理
				userName = utils.replaceDouhao(userForm.getUserName());

				/*
				 * 判断用户是否存在
				 */
				if (u.findName(userName) == 1) {
					
					/*
					 * 校验用户名和密码
					 * 
					 */
					user = u.findLogin(userForm);
					if (user != null) {
						
						session.setAttribute("user", user);
						
						/*
						 * 校验用户的状态是否被禁止
						 */
						
						BunUserDao bundao = new BunUserDao();
						BBSBunUser bunUser = bundao.getBunUserById(user.getUserId());
						
						if(bunUser == null) {
							bunUser = new BBSBunUser();
							bunUser.setBunState("1");	
						}
						session.setAttribute("bunUser", bunUser);
						
						if(requestUrl != null) {
							return (mapping.findForward("index"));
						} else {	
							return (mapping.findForward("success"));
						}	
						
					} else {
						request.setAttribute("passwordWrong", "密码不正确!!");
						return (mapping.findForward("wrong"));
					}
					
				} else {
					request.setAttribute("userWrong", "该用户不存在!!");
					return (mapping.findForward("wrong"));
				}
				
			} else if (flag.equals("out")) {
				
				session.removeAttribute("user");
				
				session.removeAttribute("hot");
				
				session.removeAttribute("id");
				
				request.setAttribute("out", "out");
				
				session.removeAttribute("bunUser");
				
				return mapping.findForward("success");
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return null;

	}
}