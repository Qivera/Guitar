package com.Guitar.DAO;

import java.util.*;

import com.Guitar.Model.Guitar;

public interface GuitarDAO {
	  // 增加操作
		public void insert(Guitar guitar) throws Exception ;
		// 修改操作
		public void update(Guitar guitar) throws Exception ;
		// 删除操作
		public void delete(String serialNumber) throws Exception ;
		// 按ID查询，主要为更新使用
		public Guitar queryBySerialNumber(String serialNumber) throws Exception ;
		// 查询全部
		public List queryAll() throws Exception ;
	   // 模糊查询  
	   public List queryByLike(String cond) throws Exception ;  

}
