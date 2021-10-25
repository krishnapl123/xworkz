package com.java.constructor;

public class Vegetables {
	
String name;
String color;
int price;

Vegetables(){
	this("Radish");
	System.out.println("This is Default constructor..");
	
}
Vegetables(String name){
	this("Radish","white");
	System.out.println("Name of the Vegetable");
}

Vegetables(String name,String color){
	this("Radish","white",20);
	
	System.out.println("Name and color of vegetable");
	
}

Vegetables(String name,String color,int price){
	
	System.out.println("Name,color and price of vegetable ");
	this.name=name;
	this.color=color;
	this.price=20;
}

}
