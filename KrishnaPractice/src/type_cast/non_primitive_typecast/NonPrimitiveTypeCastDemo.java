package type_cast.non_primitive_typecast;

public class NonPrimitiveTypeCastDemo {
public static void main(String args[]) {
	
	Laptop laptop=new Dell();
	
   // laptop.name="Dell;" This os also correct
	
	
	Dell dell=(Dell) laptop;
	dell.name="Dell";
	dell.price=1000.98;
	
	
	
	//laptop.name="Dell";
	
	//Dell dell=(Dell)laptop;
	
	//dell.price=1000;
	
	System.out.println("name: " +dell.name);
	System.out.println("price: " +dell.price);
}
}
