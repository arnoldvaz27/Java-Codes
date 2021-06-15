/*
Exception means abnormal termination of program.
it is a known as error 
it occurs during runtime
*/
//check exception - during compile time 
//uncheck exception - during run time 
import java.util.Scanner;

class ExceptDemo
{
	public static void main(String args[])
	{
	try
	{
	
		int a,b,c;
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER A  : ");
		a=scr.nextInt();
		System.out.println("ENTER B  : ");
		b=scr.nextInt();
		c=a/b;
		System.out.println("C is "+c);
	}
	
	}
}

		 