package clone_method;

public class Company implements Cloneable {
	
	String name="Infosys";
	Employee employee=new Employee();
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
	

}
