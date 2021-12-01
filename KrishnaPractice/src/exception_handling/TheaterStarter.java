package exception_handling;

import exception_handling.constants.TicketType;
import exception_handling.exception.HouseFullRuntimeException;

public class TheaterStarter {

	public static void main(String args[]) 
	{
		Theater theater=new Theater("Mugilpete");
		theater.bookTicket("Mugilpete", TicketType.BALCONY, 3);
		
		
		
		System.out.println("after booking");
	}
}
