/**
 * 
 */
function hello(b){
	alert("Hello World "+b);
	
}

function addLink(){
	
	var products=document.getElementsByClassName("folder");
	
	var links=document.getElementsByClassName("Side_nav")[0].getElementsByTagName("A");
	
	for(i=0;i<products.length;i++){
	for(c=0;c<links.length;c++){
		
		if(links[c].textContent==products[i].getElementsByTagName("h1")[0].textContent){
			
			products[i].getElementsByTagName("A")[0].href=links[c].href;
			break;
		}
		
	}
		
			
		
	}
	
	
	
}


function add_Image(){
	
	var links=document.getElementsByClassName("Side_nav")[0].getElementsByTagName("A");
	for(n=0;n<links.length;n++){
		if(links[n].nextElementSibling!=null&&links[n].nextElementSibling.tagName=="DIV"){
		
			var img=document.createElement("Img");
			img.src="images/arrow.png";
			
			
		
		links[n].insertAdjacentElement('afterbegin',img);
		}
		}
}
function applyHovers(){
	
	var links=document.getElementsByClassName("Side_nav")[0].getElementsByTagName("A");
 
	for(n=0;n<links.length;n++){
		if(links[n].nextElementSibling!=null){
		links[n].addEventListener("mouseover",function(){
				
			for(u=0;u<links.length;u++){
		if(links[u]==this){
	Hover(links[u]);
	
		}
		}}
			);
		links[n].addEventListener("mouseout",function(){
			
			for(u=0;u<links.length;u++){
		if(links[u]==this){
	unHover(links[u]);
	
		}
		}}
			);
		}}
		
		
	}
	


function Hover(link){
	
	var available=link.getElementsByTagName("IMG");
	if(available.length!=0){ 
	
		available[0].src="images/down.png";
	}
	else {
		var prev=link.parentElement.previousElementSibling;
		
		prev.getElementsByTagName("IMG")[0].src="images/down.png";
	}
}

function unHover(link){
	var available=link.getElementsByTagName("IMG");
	if(available.length!=0&&link.nextElementSibling.style.display!="block"){

		link.getElementsByTagName("IMG")[0].src="images/arrow.png";
	}
	else{
var prev=link.parentElement.previousElementSibling;
		if(prev.nextElementSibling.style.display!="block")
		prev.getElementsByTagName("IMG")[0].src="images/arrow.png";
	}
}

function linkDisplay(categories){

	
	
	var links=document.getElementsByClassName("Side_nav")[0].getElementsByTagName("A");


	

	for(l=0;l<categories.length;l++){
			
		for( b=0;b<links.length;b++){		
			
			
			if(categories[l]==links[b].textContent){
															
var current=links[b];
				
current.style.color="#0387e9";
var t=current.getElementsByTagName("IMG");
if(t.length!=0){ 
t[0].src="images/down.png";
	}

current.nextElementSibling.style.display="block";

		break;
	}	
			
		
	}
}}
