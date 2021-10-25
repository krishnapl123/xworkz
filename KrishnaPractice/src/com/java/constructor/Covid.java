package com.java.constructor;

public class Covid extends Virus {
	
	String name;
	String shape;
	
	
	Covid(){
		
	this("Corona","Sperical");
		
	System.out.println("Scientists have discovered vaccine for " +name+ "viuus...");
	
	}
	
   Covid(String name,String shape){
		
		System.out.println("Nmae and shape of virus");
		this.name=name;
		this.shape=shape;
		System.out.println("name=" +name+ " " +"shape=" +shape);
		
	}
	
	

}
