package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.TeacherService;

/**
 * Servlet implementation class DeleteTeacher
 */
public class DeleteTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		String action = request.getParameter("submit");
		int tno = Integer.parseInt(request.getParameter("delete"));
		String hello="hello world";
		session.setAttribute("tno", tno);
		session.setAttribute("hello", hello);
	
		if("delete".equals(action)) {
		
		TeacherService ss= new TeacherService();
		boolean b=ss.DeleteTeacher(tno);
			int k=0;
			if(b) {k=1;
				 response.sendRedirect("TeacherDeletedOrNot.jsp?k="+k);  
			}
			else
			{
				 response.sendRedirect("TeacherdeletedOrNot.jsp?k="+k);  
			}
			
		}
		if("update".equals(action)) {
			
			
			
			response.sendRedirect("UpdateTeacherDetails.jsp?tno="+tno);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
