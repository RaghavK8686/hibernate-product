package com.ty.product.util;

import static com.ty.product.util.ProductConstants.DRIVER;
import static com.ty.product.util.ProductConstants.PASSWORD;
import static com.ty.product.util.ProductConstants.URL;
import static com.ty.product.util.ProductConstants.USER;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecytionObject {

	static {
		try {
			Class.forName(DRIVER);
		}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

	}
	
	public  static Connection  getConnection() {
		
		try {
		return 	DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
