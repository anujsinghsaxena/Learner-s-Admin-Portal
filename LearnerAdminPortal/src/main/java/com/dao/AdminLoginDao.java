package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.LoginBean;



public class AdminLoginDao {

	public static void main(String[] args) {
		AdminLoginDao a = new AdminLoginDao();
		LoginBean b= a.adminLogin("adminuser");
		System.out.println(b.getUsername()+b.getPassword());
		

	}
	
	public LoginBean adminLogin( String username) {
		LoginBean l=new LoginBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "anujsinghsaxena","Anuj9540@$");
			System.out.println("connection loaded");
			Statement stmt=con.createStatement();
			String query="select * from mainuser where USERNAME='"+username+"'";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				l.setUsername(rs.getString(1));
				l.setPassword(rs.getString(2));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}