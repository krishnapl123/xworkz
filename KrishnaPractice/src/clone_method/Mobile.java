package clone_method;

public class Mobile implements Cloneable {
	
	String brand="Sony";
	Sim sim=new Sim();

	
	public Object clone() throws  CloneNotSupportedException {
		
		return super.clone();
	}
}

