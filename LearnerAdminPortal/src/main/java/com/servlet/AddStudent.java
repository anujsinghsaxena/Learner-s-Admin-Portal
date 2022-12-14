package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.service.StudentService;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			int rno = Integer.parseInt(request.getParameter("rno"));
			//String rno=String.valueOf(no);
			String fname= request.getParameter("fname");
			String lname= request.getParameter("lname");
			int sclass = Integer.parseInt(request.getParameter("sclass"));
			StudentBean sb= new StudentBean();
			sb.setRno(rno);
			sb.setFname(fname);
			sb.setLname(lname);
			sb.setSclass(sclass);
			StudentService ss= new StudentService();
			boolean b=ss.AddStudent(sb);
			int k=0;
			if(b) {k=1;
				 response.sendRedirect("StudentAddedOrNot.jsp?k="+k);  
			}
			else
			{
				 response.sendRedirect("StudentAddedOrNot.jsp?k="+k);  
			}
			}
			catch(Exception ex) {
				int k=0;
				response.sendRedirect("StudentAddedOrNot.jsp?k="+k);
				
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
