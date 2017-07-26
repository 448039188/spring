package com.shopper.dao;

import java.util.List;

import com.shopper.entity.order;

public interface orderDao {
	public boolean add(order order);
	public boolean update(order oldorder,order neworder);
	public boolean delete(order order);
	public List<order> getAll();
	public order getById(int oid);
}
