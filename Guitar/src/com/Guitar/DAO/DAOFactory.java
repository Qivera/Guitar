package com.Guitar.DAO;

import com.Guitar.Action.GuitarDAOImpl;

public class DAOFactory {
	public static GuitarDAO getGuitarDAOInstance()
	{
		return new GuitarDAOImpl() ;
	}
}
