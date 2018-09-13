<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*"
import="com.something.*"
import="java.util.*" 

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="shop1.css" rel="stylesheet" type="text/css">
<link href="mystyle.css" type="text/css" rel="stylesheet">
<script src="myScript.js"> </script>
</head>
<body>


<%! 
String getCategories(ArrayList<String> its){
	String display="";
	for(String c:its){
		display=display+c+">";
	}
	display=display.substring(0, display.length()-1);
	return display;
}
	
String getlink(int id){
	String link="BuyNow?id="+String.valueOf(id);
	
	return link;
}	
	
	%>
<%ArrayList<Product> items = (ArrayList)request.getAttribute("Products");
 String cat = items.get(0).getcategory();
 ArrayList<String> categories=(ArrayList)request.getAttribute("cateogries");
%>

<div  class="header" >
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



<div class="components" >





<a href="Shop?category=Fashion%3EMens Fashion%3EMen's T-Shirt"  >Men's T-Shirt</a>
<a href="">Kurta Shalwaar</a>

<a href="">Watches</a>
<a href="Shop?category=Fashion%3EMens Fashion%3EOther items"  >Other items</a>

</div>



<div class="element">
<a href="">Women's Fashion</a>
 
<div class="components"   >

<a href="">Ladies Shirts</a>
<a href="">Trouser</a>
<a href="">Make up</a>
<a href="">Watches</a>
<a href="">Other items</a>
</div>
</div>
</div>


</div>
<div class="element">
<a href="">Home Accessories</a>

<div class="components">

<a href="Shop?category=machine">Juicer Machines</a>
<a href="">Vacume Cleaner</a>
<a href="">Other items</a>

</div></div>

</div></div></div>
<div class="middle">
<p id="some"><%=getCategories(categories) %>
<h1 id="title"><%=cat %></h1>

<script>



</script>

<% 
for(Product d:items){
%>	

<div class="products">

<img src=<%=d.getimage() %>>
<h5><%=d.getheading() %></h5>
<p><%=d.getdiscription() %></p>
<span> Rs: <%=d.getprice() %> </span>
<a href=<%=getlink(d.getid()) %>>Buy Now</a>
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

applyHovers();
add_Image();
linkDisplay(categories);












/*
//solution 2
var title=document.getElementById("title").innerHTML; 
 var components=document.getElementsByClassName("components");
 var names="";
 var count=0;
Loop:
for(i =0;i<components.length;i++){
	
	var links=components[i].getElementsByTagName("A");
	
	for(c=0;c<links.length;c++){
		count+=1;
		
		
	if(links[c].textContent==title){
		//link[c].parentElement.getElementsByTagName("A")[0].innerHTML="this is clicked";	
				links[c].style.color="#0387e9";
				//link[c].parentNode.getElementById("link");
				var d=links[c].parentElement.previousElementSibling;
			//	d.getElementsByTagName("A")[0].innerHTML="dfdfd";
				links[c].parentNode.style.display="block";
				
				components[i].style.display="block";
			
			break Loop;
		}
		
	}
	
}*/


</script>
</html>