package com.something;

public class Product {
String heading,discription,category;
int id,price;
String image;

Product(int id,String heading,String discription,int price,String category,String image){
	this.image=image;
	this.heading=heading;
	this.id=id;
	this.discription=discription;
	this.price=price;
	this.category=category;

}


public void setheading(String heading) {
	this.heading=heading;
}
public void setdiscripiton(String discription) {
	this.discription=discription;
}
public void setprice(int price) {
	this.price=price;
}
public void setcategory(String category) {
	this.category=category;
}
public void setimage(String image) {
	this.image=image;
}

public int getid() {return id;}
public String getheading() {return heading;}
public String getdiscription() {return discription;}
public int getprice() {return price;}
public String getcategory(){return category;}
public String getimage() {return image;}






}
