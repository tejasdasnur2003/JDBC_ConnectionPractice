package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.Configuration.ShopKeeper_Configuration;
import com.Entity.ShopKeeper;

public class ShopKeeperDao {
	public void createTable() throws ClassNotFoundException, SQLException {
		String query="CREATE TABLE shopInfo(shopId int,shopName varchar(20),Product varchar(20),Weight double,Price long);";
		Connection conn=ShopKeeper_Configuration.getConnection();
		Statement stm=conn.createStatement();
		stm.execute(query);
		stm.close();
		conn.close();
		
	}
	public void insertData(ShopKeeper sk) throws ClassNotFoundException, SQLException
	{
		String query2="insert into shopinfo values(?,?,?,?,?);";
		Connection conn=ShopKeeper_Configuration.getConnection();
		PreparedStatement ps=conn.prepareStatement(query2);
		ps.setInt(1,sk.getShopId());
		ps.setString(2,sk.getShopName());
		ps.setString(3,sk.getProduct());
		ps.setDouble(4,sk.getWeight());
		ps.setInt(5,sk.getPrice());
		ps.execute();
		ps.close();
		conn.close();
		
		
	}
	

}
