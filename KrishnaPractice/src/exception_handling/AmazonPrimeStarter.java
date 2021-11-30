package exception_handling;

import exception_handling.exception.NotAPrimeMemberException;

public class AmazonPrimeStarter {
	
	
	public static void main(String args[]) throws NotAPrimeMemberException {
		
		AmazonPrime amazonprime=new AmazonPrime();
		amazonprime.freeDelivery(true,"pakistan");
		
	}

}
