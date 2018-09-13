<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*"
import="com.something.*"
import="java.util.*" 

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="mystyle.css" type="text/css" rel="stylesheet">
<link href="Confirmation.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<%!
String getLink(ArrayList<String> some){
	String link="Respond?category=";
	for(String a :some){
		link+=a;
		link+="%3E";
	}
	link=link.substring(0, link.length()-3);
	
	return link;
}
%>
<% 
Product p=(Product)request.getAttribute("purchased");

ArrayList<String> categories=(ArrayList)request.getAttribute("cateogries");
%>
<div  class="header">
<img src="images/logo.png"   >

 <a href="" >Your Orders</a>

<a href=""  id ="active">Shop Now</a>
<a href="Home.html" >Home</a>
</div>
<div class="content">
<img src=<%=p.getimage() %> >
<div class="specification">
<h1><%=p.getheading() %></h1>
<p><%=p.getdiscription() %></p>
<p> Category:<a href="" id="category"><%=p.getcategory() %></a></p>
<p><b>Price:  </b><span style="color:#0387e9;font-size:29px"> Rs <%=p.getprice() %></span></p>
<a href="">Add to Cart <img src="images/cart.png" ></a>


</div>
</div>
</body>
</html>