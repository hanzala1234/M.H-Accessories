package com.something;
import java.util.*;


public class folder {
	ArrayList<String> Folders=new ArrayList<String>();
String name;
String image;
boolean file_exsist;	


public folder(String name,String Image,boolean exsist){
this.name=name;
image=Image;
file_exsist=exsist;
}
	


public String get_Image() {return image;}	
	public String get_Name() {return name;}
public boolean has_Files() {return file_exsist;}	
public void add_Subfolder(String... name){
for(String n :name) {
	Folders.add(n);
	}
}
public ArrayList<String> get_Subfolder(){
	return Folders;
	
}
}
