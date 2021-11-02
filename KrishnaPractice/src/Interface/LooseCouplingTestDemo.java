package Interface;

public class LooseCouplingTestDemo {
	
	public static void main(String args[]) {
		
		Epson epson=new Epson();
		Sony sony=new Sony();
		
		Computer computer=new Computer();
		
		computer.slot(sony);
	}

}
