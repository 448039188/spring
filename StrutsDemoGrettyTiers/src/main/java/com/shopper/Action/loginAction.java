package com.shopper.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.shopper.service.userService;
import com.shopper.dao.userDao;
import com.shopper.dao.userDaoImpl;
import com.shopper.entity.User;

public class loginAction extends ActionSupport{
	
	private String username;
	private userService userservice=new userService();
	public userService getUserservice() {
		return userservice;
	}
	public void setUserservice(userService userservice) {
		this.userservice = userservice;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(){
		this.username=username;
	}
	private String password;
	
	public String getPassword(){
		return password;
	}
	public void setPassword(){
		this.password=password;
	}
	
	
	public String execute() throws Exception{
		  userDaoImpl b=new userDaoImpl();
		  userservice.setuserDao(b);		  
		   User user= new User();
		   user.setPassword(getPassword());
		   user.setUsername(getUsername());
		 //ActionContext ctx=ActionContext.getContext();
		 
		  if(userservice.Query(user)==true){
			  return SUCCESS;
		  }else{
			  return ERROR;
		  }
}
}