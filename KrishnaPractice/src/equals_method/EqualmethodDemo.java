package equals_method;

public class EqualmethodDemo {
	
	public static void main(String args[]) {
		
		Tree areka=new Tree("areka","green");
		Tree banyan=new Tree("banyan","green");
		Tree banyanCopy=new Tree("banyan","green");
		
		System.out.println(banyan.equals(banyanCopy));	
	}

}
