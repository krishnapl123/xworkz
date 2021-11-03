package clone_method;

public class CloneMethodDemo {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		Vegetable carrot=new Vegetable("carrot",20.11);
		
	    Vegetable copiedCarrot=(Vegetable) carrot.clone();
		
		
		System.out.println(copiedCarrot.name);
		System.out.println(copiedCarrot.price);
		
		
	}
}
