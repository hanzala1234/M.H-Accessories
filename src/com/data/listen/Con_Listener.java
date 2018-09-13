package com.data.listen;


import java.sql.*;
import java.util.*;
import com.something.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Con_Listener implements ServletContextListener  {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent sev) {
		
		String name=sev.getServletContext().getInitParameter("DbObject");
		String user=sev.getServletContext().getInitParameter("DbUser");
		String pass=sev.getServletContext().getInitParameter("DbPass");

		Connection connect;
		
		ArrayList<folder> folders = new ArrayList<>();
		
		folder f1=new folder("Fashion","Fashion1.jpg",false);
		
		f1.add_Subfolder("Mens Fashion","Womens Fashion");
		
		folders.add(f1);
		
		f1= new folder("Mens Fashion","M-Fashion.jpg",false);
		f1.add_Subfolder("Men's T-Shirt","Kurta Shalwaar","Watches","Other items");
		folders.add(f1);
		f1= new folder("Womens Fashion","Fashion.jpeg",false);
		f1.add_Subfolder("Ladies Shirts","Trouser","Watches","Other items");
		folders.add(f1);
		f1= new folder("All Products","",false);
		f1.add_Subfolder("Fashion","Home Accessories");
		folders.add(f1);
		folders.add(new folder("Men's T-Shirt","T-SHIRTS.png",true));
		folders.add(new folder("Other items","Others.png",true));
		folders.add(new folder("Home Accessories","Home Accessories.png",false));
		
		sev.getServletContext().setAttribute("Folders",folders);
		
		try {
        Class.forName("com.mysql.jdbc.Driver");			
			connect=DriverManager.getConnection(name,user,pass);

			sev.getServletContext().setAttribute("Database", connect);
			   
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
