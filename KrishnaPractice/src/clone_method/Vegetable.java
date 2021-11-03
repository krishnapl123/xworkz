package clone_method;

public class Vegetable implements Cloneable {
	
	String name;
	double price;

	public Vegetable(String name,double price){
		
		this.name=name;
		this.price=price;
		
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

}
