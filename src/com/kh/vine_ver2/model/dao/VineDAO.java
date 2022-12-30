package com.kh.vine_ver2.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
	
	public Vine selectByPhone(String winePhone) {
		Vine vine = null;
		String sql = "SELECT * FROM WINE_TBL WHERE WINE_PHONE = '"+winePhone+"'";
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
				vine = new Vine();
				vine.setWineName(rset.getString("WINE_NAME"));
				vine.setWinePhone(rset.getString("WINE_PHONE"));
				vine.setWineEmail(rset.getString("WINE_EMAIL"));
				vine.setWineDate(rset.getString("WINE_DATE"));
				vine.setWineTime(rset.getString("WINE_TIME"));
				vine.setNumber(rset.getInt("WINE_NUMBER"));
				vine.setWineSettime(rset.getDate("WINE_SETTIME"));
				vine.setWineCancel(rset.getString("WINE_CALCEL"));
			}
			rset.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vine;
	}
	
	public List<Vine> selectByName(String wineName) {
		List<Vine> vList = null;
		Vine vine = null;
		String sql = "SELECT * FROM WINE_TBL WHERE WINE_NAME = '"+wineName+"'";
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			vList = new ArrayList<Vine>();
			
			while(rset.next()) {
				vine = new Vine();
				vine.setWineName(rset.getString("WINE_NAME"));
				vine.setWinePhone(rset.getString("WINE_PHONE"));
				vine.setWineEmail(rset.getString("WINE_EMAIL"));
				vine.setWineDate(rset.getString("WINE_DATE"));
				vine.setWineTime(rset.getString("WINE_TIME"));
				vine.setNumber(rset.getInt("WINE_NUMBER"));
				vine.setWineSettime(rset.getDate("WINE_SETTIME"));
				vine.setWineCancel(rset.getString("WINE_CALCEL"));
				
				vList.add(vine);
			}
			
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vList;
	}
	
	
	
	
}