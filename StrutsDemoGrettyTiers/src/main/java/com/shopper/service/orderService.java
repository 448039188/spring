package com.shopper.service;

import java.util.List;

import com.shopper.dao.orderDao;
import com.shopper.entity.order;

public class orderService {
	public orderService() {
		super();
	}
	private orderDao orderDao;

	public void setorderDao(orderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	public orderService(orderDao orderDao){
		this.orderDao = orderDao;
	}
	public boolean add(order order){
		return orderDao.add(order);
	}
	public boolean update(order oldorder,order neworder){
		return orderDao.update(oldorder, neworder);
	}
	public boolean delete(order order){
		return orderDao.delete(order);
	}
	public List<order> getAll(){
		return orderDao.getAll();
	}
	public order getById(int oid){
		return orderDao.getById(oid);
	}
}
