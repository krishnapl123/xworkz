package exception_handling;

import exception_handling.exception.MbbsException;

public class AdmissionCellStarter {
	
	public static void main(String args[]) throws MbbsException {
		
		AdmissionCell admissioncell=new AdmissionCell();
		admissioncell.admitForMbbs("Ra", true, true);
		
	}

}
