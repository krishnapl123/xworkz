package exception_handling;

import exception_handling.exception.NotEligibleForVote;

public class ElectionCommissionStarter {
	
	public static void main(String args[]) throws NotEligibleForVote{
		
		ElectionCommission electioncommission=new ElectionCommission();
		electioncommission.canVote("Krishna", 17);
	}

}
