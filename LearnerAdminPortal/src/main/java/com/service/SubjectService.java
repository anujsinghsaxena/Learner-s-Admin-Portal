package com.service;

import java.util.List;

import com.bean.StudentBean;
import com.bean.SubjectBean;
import com.dao.SubjectDao;

public class SubjectService {
	SubjectDao sl= new SubjectDao();
	 
	public List<SubjectBean> listSubjects(){
	 return sl.subjectList();
 }
	public boolean DeleteSubject(int sno) {
		return sl.deleteSubject(sno);
	}
	public boolean AddSubject(SubjectBean bean) {
		return sl.addSubject(bean);
	}
}