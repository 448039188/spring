package com.shopper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopper.dbutil.dbutil;
import com.shopper.entity.User;
import com.shopper.entity.product;

public class productDaoImpl implements productDao {
	//获取所有信息
	public List<product> getAll(){
		// TODO Auto-generated method stub
				ResultSet rs=dbutil.executeQuery("select * from product", new Object[]{});
				List<product> productList=new ArrayList<product>();
				try{
					while(rs.next()){
						product product=new product();
						product.setPid(rs.getInt(1));
						product.setPname(rs.getString(2));
						product.setPsn(rs.getString(3));
						product.setPnum(rs.getInt(4));
						product.setPrice(rs.getDouble(5));
						product.setPlmg(rs.getString(6));
						product.setSize(rs.getString(7));
						product.setCid(rs.getInt(8));
						productList.add(product);
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return productList;
			}

	@Override
	//添加商品
	public boolean add(product product) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("insert into product value(pname,psn,pnum,price,plmg,size,cid)", new Object[]{product.getPname(),product.getPsn(),product.getPnum(),product.getPrice(),product.getPlmg(),product.getSize(),product.getCid()});
	}

	
	//修改
	public boolean update(product oldproduct, product newproduct) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("update product set pname=?,psn=?,pnum=?,price=?,plmg=?,size=?,cid=? where id=?", new Object[]{newproduct.getPname(),newproduct.getPsn(),newproduct.getPnum(),newproduct.getPrice(),newproduct.getPlmg(),newproduct.getSize(),newproduct.getCid(),oldproduct.getPid()});
	}

	@Override
	//删除
	public boolean delete(product product) {
		// TODO Auto-generated method stub
		return dbutil.executeUpdate("delete from product where pid=?", new Object[]{product.getPid()});
	}

	@Override
	//id获取所有信息
	public product getByPid(int pid) {
		// TODO Auto-generated method stub
		ResultSet rs=dbutil.executeQuery("select * from product where pid=?", new Object[]{pid});
		product product=null;
		try{
			while(rs.next()){
				product=new product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setPsn(rs.getString(3));
				product.setPnum(rs.getInt(4));
				product.setPrice(rs.getDouble(5));
				product.setPlmg(rs.getString(6));
				product.setSize(rs.getString(7));
				product.setCid(rs.getInt(8));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return product;
	}
	}

