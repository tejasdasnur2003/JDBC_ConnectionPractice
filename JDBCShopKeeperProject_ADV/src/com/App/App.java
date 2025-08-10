package com.App;

import java.sql.SQLException;
import java.util.Scanner;

import com.DAO.ShopKeeperDao;
import com.Entity.ShopKeeper;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ShopKeeperDao sk=new ShopKeeperDao();
		/*sk.createTable();
		System.out.println("Database Created..");*/
		
		
		Scanner sc=new Scanner(System.in);
		ShopKeeperDao skd=new ShopKeeperDao();
		System.out.println("Enter the Id: ");
		int id=sc.nextInt();
		System.out.println("Enter ShopName: ");
		String ShopName=sc.next();
		System.out.println("Enter Product Name: ");
		String Product=sc.next();
		System.out.println("Enter Wieght in KG : ");
		double Weight=sc.nextDouble();
		System.out.println("Enter the Price: ");
		int Price=sc.nextInt();
		ShopKeeper sk=new ShopKeeper(id,ShopName,Product,Weight,Price);
		skd.insertData(sk);
		
		
		
	}

}
