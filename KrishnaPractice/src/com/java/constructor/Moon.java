package com.java.constructor;

public class Moon {
	
	String color;
	String shape;
	int size;
	
	Moon(){
		this("white");
		
		System.out.println("This is default constructor..");
	}
	Moon(String color ){
		this("white","Round");
		
		System.out.println("This is single parameterized  constructor..");
	}
	
  Moon(String color,String shape ){
		this("white","round",450);
		System.out.println("This is two parameterized  constructor..");
	}
  
  Moon(String color,String shape,int size ){
		
		System.out.println("This is three parameterized  constructor..");
		
		this.color=color;
        this.shape=shape;
        this.size=250;
	

}
}
