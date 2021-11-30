package exception_handling;

import exception_handling.exception.MbbsException;

public class AdmissionCell {
	
	
	public void admitForMbbs(String name,boolean pucCleared,boolean biologyAsCompulsory) throws MbbsException

	{
		System.out.println("involked admitForMbbs");
		
		if(name.length()>2 && name.length()<26 &&  pucCleared && biologyAsCompulsory )
		{
			
			System.out.println("can give mbbs seat");
		}
		else
		{
			System.out.println("cannot give mbbs seat");
			throw new MbbsException();
			
		}
		
		
	}


}
