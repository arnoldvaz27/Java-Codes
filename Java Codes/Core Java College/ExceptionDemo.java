import java.util.*;
import java.io.*;

class ExceptionDemo
{
	public static void main(String args[]) throws IOException
	{
		int a,b,c;
		Scanner src  = new Scanner(System.in);		
		System.out.println("Enter two values: ");
		try 
		{
			a = src.nextInt();
			b = src.nextInt();
			c = a/b;
			System.out.println("Division is "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(NumberFormatException nfc)
		{
			System.out.println("Number Format exception occurs");
		}
		finally
		{
			System.out.println("Finally executes always");
		}
		System.out.println("main ends");
	}
}