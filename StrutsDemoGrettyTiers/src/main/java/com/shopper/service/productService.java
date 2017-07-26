package com.shopper.service;

import java.util.List;

import com.shopper.dao.productDao;
import com.shopper.entity.product;

public class productService {
	public productService() {
		super();
	}
	private productDao productDao;

	public void setproductDao(productDao productDao) {
		this.productDao = productDao;
	}
	
	public productService(productDao productDao){
		this.productDao = productDao;
	}
	public boolean add(product product){
		return productDao.add(product);
	}
	public boolean update(product oldproduct,product newproduct){
		return productDao.update(oldproduct, newproduct);
	}
	public boolean delete(product product){
		return productDao.delete(product);
	}
	public List<product> getAll(){
		return productDao.getAll();
	}
	public product getById(int pid){
		return productDao.getByPid(pid);
	}
}
