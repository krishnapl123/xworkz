package clone_method;

public class DeepCopyTest {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Car car=new Car();
		Car copiedCar=car.clone();
		
		System.out.println("Car object-------");
		
		
	System.out.println("car brand:"+car.brand);
	System.out.println("car engine id:"+car.engine.modelled);
	
	car.engine.type="Disel";
	System.out.println("car engine Type:"+car.engine.type);
	
	System.out.println("Copied Car object");
			
	System.out.println("Copiedcar brand:"+copiedCar.brand);
	System.out.println("Copiedcar engine id:"+copiedCar.engine.modelled);
	System.out.println("Copiedcar engine type:"+copiedCar.engine.type);
	
	
	
	}

}
