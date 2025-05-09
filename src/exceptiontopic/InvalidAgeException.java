package exceptiontopic;

// Checked Exception ===> Exception 
//public class InvalidAgeException extends Exception


//UnChecked Exception ===> RuntimeException 
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
