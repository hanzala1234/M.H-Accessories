package com.something;
import java.sql.*;
import java.util.*;
public class sql_query {
	
 static ArrayList<Product> getCategoryItems(Connection connect,String category) {
	ArrayList<Product> items = new ArrayList<Product>();
	
	PreparedStatement ps;
	try {
		ps = connect.prepareStatement("Select * from product Where category=?");
	
	//ps.setString(1, heirarchy.get(heirarchy.size()-1));
	ps.setString(1, category);
	ResultSet rs=ps.executeQuery();
		String name=null;
		while(rs.next()) {
		
			name=rs.getString(6);
		
		Product p1 = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),"images/"+name);
		items.add(p1);
		}	}
	
		 catch (SQLException e) {
			e.printStackTrace();
			}

	return items;
}
 static Product getProduct(Connection connect,int id) {
	 Product e=null;
	 PreparedStatement ps;
	 try {
		 ps=connect.prepareStatement("Select * from product where id=?");
		 ps.setInt(1, id);
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {
			String name=rs.getString(6);
			e=new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),"images/"+name);
		 }
		 
	 }catch(SQLException es ) {
	es.printStackTrace();
	 }
	 
 
 return e;
 }



}
