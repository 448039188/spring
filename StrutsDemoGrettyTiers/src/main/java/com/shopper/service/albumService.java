package com.shopper.service;

import java.util.List;

import com.shopper.dao.albumDao;
import com.shopper.entity.album;

public class albumService {
	public albumService() {
		super();
	}
	private albumDao albumDao;

	public void setalbumDao(albumDao albumDao) {
		this.albumDao = albumDao;
	}
	
	public albumService(albumDao albumDao){
		this.albumDao = albumDao;
	}
	public boolean add(album album){
		return albumDao.add(album);
	}
	public boolean update(album oldalbum,album newalbum){
		return albumDao.update(oldalbum, newalbum);
	}
	public boolean delete(album album){
		return albumDao.delete(album);
	}
	public List<album> getAll(){
		return albumDao.getAll();
	}
	public album getById(int aid){
		return albumDao.getById(aid);
	}
}
