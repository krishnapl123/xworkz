package exception_handling;

import exception_handling.exception.cashLessException;

public class MedicalInsuranceStarter {
	
	public static void main(String args[]) throws cashLessException {
		
		MedicalInsurance medicalinsurance=new MedicalInsurance();
		
		medicalinsurance.canAvailCashLess("purshottam", 29);
		
	}

}
