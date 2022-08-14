package com.service;

import java.util.List;


import com.bean.TeacherBean;
import com.dao.TeacherDao;

public class TeacherService {
	TeacherDao sl= new TeacherDao();
	public List<TeacherBean> liststudent(){
		 return sl.teacherlist();
	 }
		public boolean DeleteTeacher(int rno) {
			return sl.deleteteacher(rno);
		}
		public boolean AddTeacher(TeacherBean bean) {
			return sl.addteacher(bean);
		}
	public TeacherBean teacherdetail(int tno) {
		return sl.oneTeacherDetail(tno);
	}
	
	public boolean UpdateTeacher(TeacherBean bean) {
		return sl.updateTeacher(bean);
	}
}