package exception_handling;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLDataException;
import java.text.ParseException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import javax.lang.model.UnknownEntityException;
import javax.management.BadStringOperationException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;

public class ExceptionAssignment {
	
	public void createExceptionalEvent()
	{
		RuntimeException runtimeexception=new RuntimeException();
		throw runtimeexception;	
	}
	
	public void createNumberFormatExceptionalEvent()
      {
		
		NumberFormatException numberformatexception=new NumberFormatException();
		throw numberformatexception;
		
	}
	
	
	
	public void createArrayStoreExceptionalEvent()
	{
		ArrayStoreException arraystoreexception=new ArrayStoreException();
		throw arraystoreexception;
	}
	
	public void  createCloneNotSupportedExceptionalEvetn() throws CloneNotSupportedException
	{
		CloneNotSupportedException clonenotsupportedexception=new CloneNotSupportedException();
		throw clonenotsupportedexception;
			
	}

	public void  createArithmeticExceptionalEvent()
	{
		ArithmeticException arithmeticexception=new ArithmeticException();
		throw arithmeticexception;
	}
	
	
	public void createClassCastExceptionalEvent()
	{
		 ClassCastException classcastexception=new  ClassCastException();
		 throw classcastexception;
	}
	
	public void createIndexOutOfBoundsExceptionalEvent()
	
	{
		
		 IndexOutOfBoundsException  indexoutOfboundsexception=new  IndexOutOfBoundsException();
		 throw indexoutOfboundsexception;
		
	}
	
	public void createNullPointerExceptionalEvent()
	{
		NullPointerException nullpointerexception=new NullPointerException();
		throw nullpointerexception;
	}
	
	public void createCannotRedoExceptionalEvent()
	{
		CannotRedoException cannotredoexception=new CannotRedoException();
		throw cannotredoexception;
	}
	
	public void createFileSystemAlreadyExistsExceptionalEvent()
	{
		FileSystemAlreadyExistsException fileSystemalreadyexistsexception=new FileSystemAlreadyExistsException();
		throw fileSystemalreadyexistsexception;
	}
	
	public void createFileSystemNotFoundExceptionalEvent()
	{
		FileSystemNotFoundException filesystemnotfoundexception=new FileSystemNotFoundException();
		throw filesystemnotfoundexception;
	}

	public void createWrongMethodTypeExceptionalEvent()
	{
		WrongMethodTypeException wrongmethodtypeexception=new WrongMethodTypeException();
		throw wrongmethodtypeexception;
	}
	
	
	
	public void createDatatypeConfigurationException() throws DatatypeConfigurationException
	{
		DatatypeConfigurationException datatypeconfigurationexception=new DatatypeConfigurationException();
		throw datatypeconfigurationexception;
	}
	
	public void createIllegalClassFormatException() throws IllegalClassFormatException
	{
		IllegalClassFormatException illegalclassformatexception=new IllegalClassFormatException();
				throw illegalclassformatexception;
	}
	
	public void ceateIOExceptionalEvent() throws IOException
	{
		 IOException  iOexception=new  IOException();
		 throw  iOexception;
	}
	
	public void createNamingExceptionalEvent() throws NamingException
	{
		 NamingException  namingexception=new  NamingException();
		 throw namingexception;
	}
	


	
	public void createPrintExceptionalEvent() throws PrintException
	{
		PrintException printexception=new PrintException();
		throw  printexception;
	}
	
	public void createIllegalArgumentExceptionalEvent()
	{
		 IllegalArgumentException  illegalargumentexception=new  IllegalArgumentException();
		 throw illegalargumentexception;
	}
	public void createNegativeArraySizeExceptionalEvent()
	{
		NegativeArraySizeException negativearraysizeexception=new NegativeArraySizeException();
		throw  negativearraysizeexception;
	}
	
	public void createNoSuchElementExceptionalEvent()
	{
		 NoSuchElementException  nosuchelementexception=new  NoSuchElementException();
		 throw  nosuchelementexception;
	}
	
	public void createNoSuchMechanismExceptionalEvent()
	{
		NoSuchMechanismException nosuchmechanismexception=new NoSuchMechanismException();
		throw nosuchmechanismexception;
	}
	
	public void createSQLDataExceptionlEvent() throws SQLDataException
	{
		 SQLDataException   sqldataexception=new   SQLDataException();
		 throw  sqldataexception;
	}
	
	public void createCannotUndoExceptionalEvent()
	{
		CannotUndoException cannotundoexception=new CannotUndoException();
		throw cannotundoexception;
	}
	public void createBufferUnderflowExceptionalEvent()
	{
		BufferUnderflowException bufferunderflowexception=new BufferUnderflowException();
		throw  bufferunderflowexception;
	}
	
	public void createBufferOverflowExceptionalEvent()
	{
		BufferOverflowException bufferoverflowexception=new BufferOverflowException();
		throw bufferoverflowexception;
	}
    
	public void createEmptyStackExceptionalEvent()
	{
		EmptyStackException emptystackexception=new EmptyStackException();
		throw emptystackexception;
	}
	
	
}
