package type_cast.non_primitive_typecast;

public class NonPrmitiveAssignment {
	
	public static void main(String args[]) {
		
		Vegetable vegetable=new Capsicum();
	
		vegetable.name="capsicum";
		vegetable.color="green";
		
		Capsicum capsicum=(Capsicum)vegetable;
		
		capsicum.price=50;
		
		System.out.println("name: " +capsicum.name);
		System.out.println("color: " +capsicum.color);
		System.out.println("price: " +capsicum.price);
		
			
	}

}
