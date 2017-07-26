package com.shopper.service;

import java.util.List;

import com.shopper.dao.collectionDao;
import com.shopper.entity.collection;

public class collectionService {
	public collectionService() {
		super();
	}
	private collectionDao collectionDao;

	public void setcollectionDao(collectionDao collectionDao) {
		this.collectionDao = collectionDao;
	}
	
	public collectionService(collectionDao collectionDao){
		this.collectionDao = collectionDao;
	}
	public boolean add(collection collection){
		return collectionDao.add(collection);
	}
	public boolean update(collection oldcollection,collection newcollection){
		return collectionDao.update(oldcollection, newcollection);
	}
	public boolean delete(collection collection){
		return collectionDao.delete(collection);
	}
	public List<collection> getAll(){
		return collectionDao.getAll();
	}
	public collection getById(int colid){
		return collectionDao.getById(colid);
	}
}
