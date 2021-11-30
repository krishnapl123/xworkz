package exception_handling;

import exception_handling.exception.cashLessException;

public class MedicalInsurance {
	
	public void canAvailCashLess(String name,double totalHouresInHospital)throws cashLessException
	{
	   if(name.length()>2 && name.length()<26 && totalHouresInHospital<26)
		   {
			   System.out.println("he can avail avail cashlesss");
			   
		   }
		   else
		   {
			   System.out.println("he can't avail cashless ");
			   throw new cashLessException();
		   }
	   }
		
	}

