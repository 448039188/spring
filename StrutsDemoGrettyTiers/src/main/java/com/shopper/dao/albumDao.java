package com.shopper.dao;

import java.util.List;

import com.shopper.entity.album;

public interface albumDao {
	public boolean add(album album);
	public boolean update(album oldalbum,album newalbum);
	public boolean delete(album album);
	public List<album> getAll();
	public album getById(int aid);
}
