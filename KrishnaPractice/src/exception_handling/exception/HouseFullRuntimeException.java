package exception_handling.exception;

public class HouseFullRuntimeException extends RuntimeException{
	
	public HouseFullRuntimeException() {
		
	}

	
	public HouseFullRuntimeException(String msg)
	{
		super(msg);
	}
}
