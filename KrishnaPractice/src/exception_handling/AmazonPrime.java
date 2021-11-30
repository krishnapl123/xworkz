package exception_handling;

import exception_handling.exception.NotAPrimeMemberException;

public class AmazonPrime {
	
	public void freeDelivery(boolean primeMember,String country) throws NotAPrimeMemberException
	{
		if(primeMember && country=="india")
		{
			System.out.println("he is a prime member");
		}
		else
		{
			System.out.println("he is not a perime member");
			throw new NotAPrimeMemberException();
		}
	}

}
