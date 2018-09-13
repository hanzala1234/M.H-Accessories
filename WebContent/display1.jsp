<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.io.*"
    import="com.something.*"
    import ="java.util.*"
    %>
    
    
    <% ArrayList<String> categories=(ArrayList)request.getAttribute("cateogries");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="ISO-8859-1">
<title>Prodcuts</title>
<link href="shop1.css" rel="stylesheet" type="text/css">
<link href="mystyle.css" type="text/css" rel="stylesheet">
<script src="myScript.js"> </script>
</head>
<body>

<div  class="header">
<img src="images/logo.png"   >

 <a href="" >Your Orders</a>

<a href=""  id ="active">Shop Now</a>
<a href="Home.html" >Home</a>
</div>
<div class="Side_nav">
<div class="element">
<a href="Shop?cateogry=All Products" >All Products</a>



<div class="element">
<a href="Shop?category=Fashion">Fashion</a>
<div class="components" >

<div class="element">

<a href="Shop?category=Fashion%3EMens Fashion" >Mens Fashion</a>

<div class="components"  >

<a href="Shop?category=Fashion%3EMens Fashion%3EMen's T-Shirt">Men's T-Shirt</a>
<a href="" >Kurta Shalwaar</a>

<a href="">Watches</a>
<a href="Shop?category=Fashion%3EMens Fashion%3EOther items">Other items</a>

</div>



<div class="element" >
<a href=""> Women's Fashion</a>

<div class="components">

<a href="">Ladies Shirts</a>
<a href="">Trouser</a>
<a href="">Make up</a>
<a href="">Watches</a>
<a href="">Other items</a>
</div>
</div>
</div>
</div>
</div>
<div class="element">
<a href=""> Home Accessories</a>

<div class="components">

<a href="Shop?category=machine">Juicer Machines</a>
<a href="">Vacume Cleaner</a>
<a href="">Other items</a>



</div>
</div>
</div>
</div>
<div class="middle">


<%ArrayList<folder> d=(ArrayList<folder>)request.getAttribute("Folders");
int size =d.size();
%>
<h1> <%=(String)request.getAttribute("heading")%></h1>
<% for(int i=0;i<size;i++){ %>
<div class="folder">
<a  id="link">
<img src="images/<%=d.get(i).get_Image()%>">
<h1><%=d.get(i).get_Name() %></h1></a>
</div>
<%} %>
</div>

<script>


//solution 1
var categories=[];
<% 
for(int l=0;l<categories.size();l++){
%>
categories[<%=l%>]="<%=categories.get(l)%>";
<%}%>
add_Image()
linkDisplay(categories);

addLink();//error there
applyHovers();

</script>
</body>
</html>
</html>