package exception_handling;

import exception_handling.exception.NotEligibleForVote;

public class ElectionCommission {
	
	public void canVote(String name,int age)throws NotEligibleForVote
	{
		if(name.length()>2 && name.length()<26 && age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
			throw new  NotEligibleForVote();
		}
	}

}
