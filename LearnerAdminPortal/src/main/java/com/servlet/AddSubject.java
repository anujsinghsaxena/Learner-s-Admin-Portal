package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SubjectBean;
import com.service.SubjectService;

/**
 * Servlet implementation class AddSubject
 */
public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubject() {
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
			int sno = Integer.parseInt(request.getParameter("sno"));
			//String rno=String.valueOf(no);
			String subject= request.getParameter("subject");
			
			SubjectBean sb= new SubjectBean();
			sb.setSno(sno);
			sb.setSubject(subject);
			SubjectService ss= new SubjectService();
			boolean b=ss.AddSubject(sb);
			int k=0;
			if(b) {k=1;
				 response.sendRedirect("SubjectAddedOrNot.jsp?k="+k);  
			}
			else
			{
				 response.sendRedirect("SubjectAddedOrNot.jsp?k="+k);  
			}
			
			}
			catch(Exception ex) {
				int k=0;
				response.sendRedirect("SubjectAddedOrNot.jsp?k="+k);
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
