package com.shopper.Action;

import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.shopper.dao.userDaoImpl;
import com.shopper.dbutil.dbutil;
import com.shopper.entity.User;
import com.shopper.service.userService;


public class RegisterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private userService userService=new userService();
	private String username;
	private String password;
	private String email;
	  
	private String tel;
	public userService getUserService() {
		return userService;
	}
	public void setUserService(userService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String execute() throws Exception{
		   User user=new User();
		    user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setTel(tel);
		 if(getUsername()!=null){
			 
			 userDaoImpl a = new userDaoImpl();
			 a.add(user);
			 //usersservice.add(users);
			 return SUCCESS;
	      }
		 else
		 {
			 return ERROR;
		 }
	}
}

