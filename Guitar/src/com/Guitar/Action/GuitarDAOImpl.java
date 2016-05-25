package com.Guitar.Action;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Guitar.DAO.BaseDao;
import com.Guitar.DAO.GuitarDAO;
import com.Guitar.Model.Guitar;

public class GuitarDAOImpl implements GuitarDAO {



@SuppressWarnings("static-access")
public List queryByLike(String cond) throws Exception  
     {   
	    List all = new ArrayList() ; 
        String sql = "SELECT serialNumber,price,builder,model,type,backWood,topWood FROM Guitar WHERE builder LIKE ? or type LIKE ? or model LIKE ?or backWood LIKE ? or topWood LIKE ?" ;  
         PreparedStatement pstmt = null ;  
         BaseDao bd = null ;  
         bd = new BaseDao();  
         try  
        {  
            pstmt = bd.getConnection().prepareStatement(sql);  
            pstmt.setString(1,"%"+cond+"%") ;  
            pstmt.setString(2,"%"+cond+"%") ;  
            pstmt.setString(3,"%"+cond+"%") ;
            pstmt.setString(4,"%"+cond+"%") ;  
            pstmt.setString(5,"%"+cond+"%") ;
             ResultSet rs = pstmt.executeQuery() ;  
              while(rs.next())  
             {  
            	 Guitar guitar=new Guitar();
            	  guitar.setSerialNumber(rs.getString(1));
					guitar.setPrice(rs.getDouble(2));
					guitar.setBuilder(rs.getString(3));
					guitar.setModel(rs.getString(4));
					guitar.setType( rs.getString(5));
					guitar.setBackWood(rs.getString(6));
					guitar.setTopWood(rs.getString(7));
                    all.add(guitar) ;  
              }  
              
             rs.close() ;  
             pstmt.close() ;  
         }  
       catch (Exception e)  
         {  
            System.out.println(e) ;  
             throw new Exception("操作中出现错误！！！") ;  
        }  
        finally  
        {  
            bd.close() ;  
        }  
        return all ;  
    }

@Override
public void insert(Guitar guitar) throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Guitar guitar) throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(String serialNumber) throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public Guitar queryBySerialNumber(String serialNumber) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List queryAll() throws Exception {
	// TODO Auto-generated method stub
	return null;
}  
  };  
