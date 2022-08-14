package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.ClassBean;
import com.bean.ClassReportBean;
import com.bean.StudentBean;
import com.dao.ClassListDao;
import com.dao.StudentListDao;

public class ClassReportService {

	 public List<ClassBean> classdetails(int cno) {
		 ArrayList<ClassReportBean> alldetails=new ArrayList<ClassReportBean>();
		
		 ClassListDao cl= new ClassListDao();
		
		
		 return cl.classreportlist(cno);
		 
	 }
	 public List<StudentBean> StudentClassDetails(int cno){
		 StudentListDao sl=new StudentListDao();
		return sl.studentclasslist(cno);
	 }
	
	
}