package com.shopper.dao;

import java.util.List;

import com.shopper.entity.collection;

public interface collectionDao {
	public boolean add(collection collection);
	public boolean update(collection collection,collection newcollection);
	public boolean delete(collection collection);
	public List<collection> getAll();
	public collection getById(int colid);
}
