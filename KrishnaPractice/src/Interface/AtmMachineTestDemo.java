package Interface;

public class AtmMachineTestDemo {
	
	public static void main(String args[]) {
		
		DebitCard debitcard=new DebitCard();
		CreditCard creditcard=new CreditCard();
		
		
		AtmMachine atmmachine=new AtmMachine();
		
		atmmachine.insert(debitcard);
		
	}

}
