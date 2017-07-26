package com.shopper.dao;

import java.util.List;

import com.shopper.entity.User;

public interface userDao {
	public boolean add(User user);
	public boolean update(User olduser,User newuser);
	public boolean delete(User user);
	public List<User> getAll();
	public User getById(int id);
	public boolean isExist(String username);
	public boolean login(String username,String password);
	public boolean save(String username, String password, String email, String tel);
	public boolean Query(User user);
}
