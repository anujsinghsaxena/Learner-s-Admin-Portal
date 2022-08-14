package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentBean;
import com.bean.SubjectBean;

public class SubjectDao {

	public List<SubjectBean> subjectList() {
		 ArrayList<SubjectBean> alldetails=new ArrayList<SubjectBean>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "anujsinghsaxena","Anuj9540@$");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="select * from subjects ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					SubjectBean sb= new SubjectBean();
					sb.setSno((rs.getInt(1)));
					sb.setSubject((rs.getString(2)));
					alldetails.add(sb);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return alldetails;
	 }
	 
	 public boolean deleteSubject (int sno) {
		 StudentBean sb= new StudentBean();
		 boolean value=false;
		 try {  
			 Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "anujsinghsaxena","Anuj9540@$");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="delete from subjects where sno="+ sno;
				int count = stmt.executeUpdate(query);
				if(count>0)
				{
					value=true;
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 return value;
	 }
	 
	 public boolean addSubject (SubjectBean bean) {
		 SubjectBean sb= new SubjectBean();
		 boolean value=false;
		 try {  
			 Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "anujsinghsaxena","Anuj9540@$");
				System.out.println("connection loaded");
				Statement stmt=con.createStatement();
				String query="insert into subjects values("+bean.getSno()+","
						+ "'"+bean.getSubject()+"')";
				int count = stmt.executeUpdate(query);
				if(count>0)
				{
					value=true;
					
				}
				
				
			} catch (Exception e) {
				return value;
			}
			
		 return value;
	 }
	
	
}