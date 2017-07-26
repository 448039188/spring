package com.shopper.dao;

import java.util.List;

import com.shopper.entity.product;

public interface productDao {
	public boolean add(product product);
	public boolean update(product oldproduct,product newproduct);
	public boolean delete(product product);
	public List<product> getAll();
	public product getByPid(int pid);
}
