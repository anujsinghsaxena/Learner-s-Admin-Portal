package com.service;

import java.util.List;

import com.bean.StudentBean;
import com.dao.StudentListDao;

public class StudentService {
	StudentListDao sl= new StudentListDao();
 
	public List<StudentBean> liststudent(){
	 return sl.studentlist();
 }
	public boolean deleteStudent(int rno) {
		return sl.deleteStudent(rno);
	}
	public boolean AddStudent(StudentBean bean) {
		return sl.addStudent(bean);
	}
}