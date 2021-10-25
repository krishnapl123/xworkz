package com.java.constructor;

public class MangoTree extends Tree{
	
	String name;
	String type;
	
	MangoTree(){
		this("Mango Tree","Zera Mango");
		System.out.println("Mango teee is default constructor..");
		
	}
	
	MangoTree(String name,String type){
		
		System.out.println("This is parameterized constructor..");
		this.name=name;
		this.type=type;
		
		
	}
	

}
