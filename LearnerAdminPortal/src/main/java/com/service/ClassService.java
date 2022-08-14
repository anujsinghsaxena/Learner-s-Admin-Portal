package com.service;

import java.util.List;

import com.bean.ClassBean;
import com.bean.StudentBean;
import com.dao.ClassDao;
import com.dao.ClassListDao;
import com.dao.StudentListDao;

public class ClassService {
	ClassListDao sl= new ClassListDao();
	StudentListDao sd= new StudentListDao();
	public List<ClassBean> listclass(){
		 return sl.classlist();
	 }
		public boolean deleteclass(int cno) {
			boolean value=false;
			boolean dc= sl.deleteClass(cno);
			boolean ds= sd.deleteStudentByClass(cno);
			if(dc=ds) {
				value=true;
				return value;
			}
			else {
				return value;
			}
		}
		public boolean AddClass(ClassBean bean) {
			return sl.addClass(bean);
		}
	
}