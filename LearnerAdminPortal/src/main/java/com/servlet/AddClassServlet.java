package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassBean;
import com.service.ClassService;

/**
 * Servlet implementation class AddClassServlet
 */
public class AddClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String sOne = request.getParameter("subjectOne");
		String sTwo = request.getParameter("subjectTwo");
		String sThree = request.getParameter("subjectThree");
		String sOneT = request.getParameter("subjectOneT");
		String sTwoT = request.getParameter("subjectTwoT");
		String sThreeT = request.getParameter("subjectThreeT");
		//String rno=String.valueOf(no);
		int cclass= Integer.parseInt(request.getParameter("cclass"));
		
		ClassBean sb= new ClassBean();
		
		sb.setClno(cclass);
		sb.setsOne(sOne);
		sb.setsTwo(sTwo);
		sb.setsThree(sThree);
		sb.setsOneT(sOneT);
		sb.setsTwoT(sTwoT);
		sb.setsThreeT(sThreeT);
		
		ClassService ss= new ClassService();
		boolean b=ss.AddClass(sb);
		int k=0;
		if(b) {k=1;
			 response.sendRedirect("ClassAddedOrNot.jsp?k="+k);  
		}
		else
		{
			 response.sendRedirect("ClassAddedOrNot.jsp?k="+k);  
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
