package com.Guitar.DAO;

import java.util.*;

import com.Guitar.Model.Guitar;

public interface GuitarDAO {
	  // ���Ӳ���
		public void insert(Guitar guitar) throws Exception ;
		// �޸Ĳ���
		public void update(Guitar guitar) throws Exception ;
		// ɾ������
		public void delete(String serialNumber) throws Exception ;
		// ��ID��ѯ����ҪΪ����ʹ��
		public Guitar queryBySerialNumber(String serialNumber) throws Exception ;
		// ��ѯȫ��
		public List queryAll() throws Exception ;
	   // ģ����ѯ  
	   public List queryByLike(String cond) throws Exception ;  

}
