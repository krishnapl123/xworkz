package exception_handling;

import exception_handling.constants.TicketType;
import exception_handling.exception.HouseFullRuntimeException;

public class Theater {
	
	private final int gandhiClassTicket=5;
	private final int middleClassTicket=5;
	private final int balconyTicket=2;
	private String movieName;
	
	public Theater(String movieName)
	{
		this.movieName=movieName;
	}
	
	public boolean bookTicket(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("involked bookTicket");
		if(movieName.equals(movieName) && TicketType.GANDHI_CLASS.equals(ticketType)) 
		{
		 if(TicketType.GANDHI_CLASS.equals(ticketType) && totalTickets<=this.gandhiClassTicket)
			{
		
			System.out.println(this.movieName.concat(" is booked for ") .concat(ticketType.toString()));
	        return true;
			} else {
				System.err.println("cannot book ticket for ".concat(movieName).concat("ticket is full for ").concat(ticketType.toString()));
			    throw new  HouseFullRuntimeException(  ticketType.toString().concat(" can have maximum 5 tickets only"));
			}
		}
		
		if(movieName.equals(movieName) && TicketType.MIDDLE_CLASS.equals(ticketType)) 
		{
		 if(TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets<=this.middleClassTicket)
			{
		
			System.out.println(this.movieName.concat(" is booked for ") .concat(ticketType.toString()));
	        return true;
			} else {
				System.err.println("cannot book ticket for ".concat(movieName).concat("ticket is full for ").concat(ticketType.toString()));
			    throw new  HouseFullRuntimeException(  ticketType.toString().concat(" can have maximum 5 tickets only"));
			}
		}
		
		if(movieName.equals(movieName) && TicketType.BALCONY.equals(ticketType)) 
		{
		 if(TicketType.BALCONY.equals(ticketType) && totalTickets<=this.balconyTicket)
			{
		
			System.out.println(this.movieName.concat(" is booked for ") .concat(ticketType.toString()));
	        return true;
			} else {
				System.err.println("cannot book ticket for ".concat(movieName).concat("ticket is full for ").concat(ticketType.toString()));
			    throw new  HouseFullRuntimeException(  ticketType.toString().concat(" can have maximum 2 tickets only"));
			}
		}
		
		return false;
	}
}
		
		
		
		
	








		
		
		




