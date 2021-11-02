package type_cast.primitive_typecast;

public class PrimitiveTypeCastTypeDemo {

	public static void main(String args[]) {
		
		//implicit type casting
		
		byte b=10;
		int i=b;
		System.out.println("i: " +i);
		
		// explicit type casting
         
		double d=1000.10012345678912;
		float f=(float)d;
		
		System.out.println("d: " +d);
		System.out.println("f: " +f);
		
		char c='A';
		int o=c;
		
		char h='@';
		int p=h;
		System.out.println("o: " +o);
		System.out.println("p: " +p);
		
		
	
	}
}
