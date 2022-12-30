package com.kh.vine_ver2.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.kh.vine_ver2.model.vo.Vine;

public class VineDAO {
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String USER = "KH";
	private final String PASSWORD = "KH";
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver"; 
	
	public int inputInfo(Vine vine) {
		String sql = "INSERT INTO WINE_TBL VALUES(?,?,?,?,?,?,DEFAULT,DEFAULT)";
		int result = 0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vine.getWineName());
			pstmt.setString(2, vine.getWinePhone());
			pstmt.setString(3, vine.getWineEmail());
			pstmt.setString(4, vine.getWineDate());
			pstmt.setString(5, vine.getWineTime());
			pstmt.setInt(6, vine.getNumber());
			result = pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
}