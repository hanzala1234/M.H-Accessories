package com.something;


import java.io.*;

import java.util.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Response
 */
@WebServlet("/Response")
public class Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Response() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
	
	
	//PrintWriter pw=response.getWriter();
	
	try {
	
		ArrayList<String> heirarchy = new ArrayList<String>();
	
	Connection connect = (Connection)getServletContext().getAttribute("Database");

	
	
	
String	url=request.getParameter("category");
if(url==null)url="All Products";	
	int count = url.length()-url.replace(">","").length();

int startindex=0;

for(int i=0;i<=count;i++) {

	int current=url.indexOf(">",startindex);
	if(current!=-1) {
		
	heirarchy.add(url.substring(startindex,current));
	
	startindex=current+1;
}
	else {
		heirarchy.add(url.substring(startindex));
	
	}
	}



ArrayList<folder> All_Folders=(ArrayList<folder>)getServletContext().getAttribute("Folders");
String category=heirarchy.get(heirarchy.size()-1);
boolean file=false;
folder found = null;
for(int i =0;i<All_Folders.size();i++) {
	folder d =All_Folders.get(i);
	
	if(d.get_Name().equals(category)) {
found=d;
		if(d.file_exsist)
		file = true;

break;
	}
		
}
request.setAttribute("cateogries",heirarchy);
if(file) {
	ArrayList<Product> items=sql_query.getCategoryItems(connect, category);
	request.setAttribute("Products",items);
	
	rd.forward(request,response);	
}
else {
	ArrayList<String> sub=found.get_Subfolder();
	ArrayList<folder> sending = new ArrayList<>();
	for(int j =0;j<sub.size();j++) {
		for(int i =0;i<All_Folders.size();i++) {
			
			if(sub.get(j).equals(All_Folders.get(i).get_Name())) {
				sending.add(All_Folders.get(i));
			}
			
		}		
		
	}
	request.setAttribute("Folders",sending);
	request.setAttribute("heading",found.get_Name());
	rd=request.getRequestDispatcher("display1.jsp");
	
	rd.forward(request, response);
	
	}




		// TODO Auto-generated catch block
		
	
	
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
