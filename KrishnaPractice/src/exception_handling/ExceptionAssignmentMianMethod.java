package exception_handling;

public class ExceptionAssignmentMianMethod {
	
	public static void main(String args[]){
		
		ExceptionAssignment exceptionass=new ExceptionAssignment();
		
		exceptionass.createExceptionalEvent();
		exceptionass.createNumberFormatExceptionalEvent();
		
		//exceptionass.createClassNotFoundExceptionalEvent();
		exceptionass.createArrayStoreExceptionalEvent();
		
		
	}

}
