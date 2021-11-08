package clone_method;

public class Car implements Cloneable {
	
	String brand="i20";
	Engine engine=new Engine();
	
	
	public Car clone() throws CloneNotSupportedException{
		
		Object obj=(Car) super.clone();
		Car copy=(Car)obj;
		
		copy.engine=new Engine();
		
		return copy;
	}

}
