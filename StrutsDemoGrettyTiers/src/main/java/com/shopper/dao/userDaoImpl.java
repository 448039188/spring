package com.shopper.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopper.Action.RegisterAction;
import com.shopper.dbutil.dbutil;
import com.shopper.entity.User;



public class userDaoImpl implements userDao{
   private String username;
   private String password;
   private String email;
   private String tel;
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



	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("insert into user values(?,?,?,?)",new Object[]{user.getUsername(),user.getPassword(),user.getEmail(),user.getTel()});
	}

	@Override
	public boolean update(User olduser, User newuser) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("update user set password=? username=?", new Object[]{newuser.getPassword(),olduser.getUsername() });
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("delete from user where username=?", new Object[]{user.getUsername()});
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=dbutil.executeQuery("select * from user", new Object[]{});
		List<User> userList=new ArrayList<User>();
		try{
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(2));
				user.setEmail(rs.getString(2));
				user.setTel(rs.getString(2));
				userList.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		ResultSet rs=dbutil.executeQuery("select * from user where username=?", new Object[]{getUsername()});
		User user=null;
		try{
			while(rs.next()){
				user=new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setTel(rs.getString(5));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean isExist(String username) {
		
		// TODO Auto-generated method stub
		ResultSet rs=dbutil.executeQuery("select * from user where username=?",new Object[]{getUsername()});
		if(rs!=null){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean login(String username, String password){
		// TODO Auto-generated method stub
		ResultSet rs=dbutil.executeQuery("select * from user where username=? and password=?", new Object[]{username,password});
		User user=null;
		try {
			while(rs.next()){
			 user=new User();
			 //user.setId(rs.getInt(1));
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			
			}
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			
			
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean save(String username, String password, String email, String tel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public  boolean  Query(User user){
		ResultSet rs=dbutil.executeQuery("select * from user where password=? and username=?", new Object[]{user.getPassword(),user.getUsername()});
		User users1=null;
		try{
			while(rs.next()){
				users1=new User();
				users1.setPassword(rs.getString(2));
				users1.setUsername(rs.getString(1));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(users1!=null){
		  return true;
	    } 
	    else
	   {
		 return false;
	   }
	  }
	
}
