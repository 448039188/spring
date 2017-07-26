package com.shopper.service;

import java.util.List;

import com.shopper.dao.userDao;
import com.shopper.entity.User;

public class userService {
	public userService() {
		super();
	}
	private userDao userDao;

	public   void setuserDao(userDao userDao) {
		this.userDao = userDao;
	}
	
	public userService(userDao userDao){
		this.userDao = userDao;
	}
	public boolean add(User user){
		return userDao.add(user);
	}
	public boolean update(User olduser,User newuser){
		return userDao.update(olduser, newuser);
	}
	public boolean delete(User user){
		return userDao.delete(user);
	}
	public List<User> getAll(){
		return userDao.getAll();
	}
	public User getById(int id){
		return userDao.getById(id);
	}

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.login(username, password);
	}

	public boolean save(String username, String password, String email, String tel) {
		// TODO Auto-generated method stub
		return userDao.save(username,password,email,tel);
	}

	public  boolean Query(User user) {
		// TODO Auto-generated method stub
		return userDao.Query(user);
	}
}
