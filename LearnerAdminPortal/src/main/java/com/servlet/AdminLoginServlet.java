package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.service.AdminLoginService;

/**
 * Servlet implementation class AdminLoginServlet
 */
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			AdminLoginService as= new AdminLoginService();
			LoginBean b= new LoginBean();
			b.setUsername(username);
			b.setPassword(password);
			boolean value=as.validation(b);
			int k=0;
			if(value) {k=1;
				 response.sendRedirect("adminpage.jsp");  
			}
			else
			{
				 response.sendRedirect("invalidAdminDetails.jsp");  
			}
			}
			catch(Exception ex) {
				response.sendRedirect("invalidAdminDetails.jsp");
				
			}
			doGet(request, response);
		}
	}

