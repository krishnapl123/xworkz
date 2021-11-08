package clone_method;

public class RadioCloneDemo {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Radio radio=new Radio();
		
		Radio copiedradio=radio.clone();
		
		System.out.println("Radio object");
		
		System.out.println("Radio name: "+radio.name);
		System.out.println("Radio cost: "+radio.cost);
		
		radio.transister.type="a33";
		System.out.println("Transister name: "+radio.transister.type);
		System.out.println("Transister cost:"+radio.transister.cost);
		
		System.out.println("Copied Radio object");
		
		System.out.println("Copied Radio name: "+copiedradio.name);
		System.out.println("Copied Radio cost: "+copiedradio.cost);
		System.out.println("Copied Transister name: "+copiedradio.transister.type);
		System.out.println("Copied Transister cost:"+copiedradio.transister.cost);

	}

}
