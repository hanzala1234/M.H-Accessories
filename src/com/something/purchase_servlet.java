package com.something;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class purchase_servlet
 */
@WebServlet("/purchase_servlet")
public class purchase_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public purchase_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    //learn how to add backup file of sql database 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		RequestDispatcher rq= request.getRequestDispatcher("Confirmation.jsp");
		
		String some=request.getParameter("id");
		int id=Integer.parseInt(some);
		Connection connect=(Connection)getServletContext().getAttribute("Database");
		
		Product purchased =sql_query.getProduct(connect, id);
	request.setAttribute("purchased",purchased);	
	rq.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
