package clone_method;

public class Radio implements Cloneable {

	String name="Philips";
	double cost=500.00;
	
	Transister transister=new Transister();
	
	public Radio clone() throws CloneNotSupportedException {
		
		Object obj=(Radio) super.clone();
	
		Radio copy=(Radio)obj;
		
		copy.transister=new Transister();
		
		return copy;
		
	}
}
