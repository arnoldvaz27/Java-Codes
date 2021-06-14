/* 1} When interface is implemented by abstract then the methods in abstract is not necessary all methods should be defne in another class.
   2} interface can extend another interface
  3} 

*/


import java.util.Scanner;

interface AR
{
	void get();
	void calculate();
	void display();
}

interface AB
{	
	void display();
	void show();
	
}

class Sum implements AR,AB
{
	int x,y,z;
	Scanner src  = new Scanner(System.in);
	public void get()
	{
		System.out.println("i1 Enter the first number: ");
		x  = src .nextInt();
		System.out.println("i1 Enter the second number: ");
		y  = src .nextInt();		
	}
	public void calculate()
	{
		z = x+y;
	}
	public void display()
	{
		System.out.println("i1 The Sum Is : "+z);
	}
	public void show()
	{
		System.out.println("i1 BYE");
	}
}

class Difference implements AR
{
	int x,y,z;
	Scanner src  = new Scanner(System.in);
	public void get()
	{
		System.out.println("i2 Enter the first number: ");
		x  = src .nextInt();
		System.out.println("i2 Enter the second number: ");
		y  = src .nextInt();		
	}
	public void calculate()
	{
		z = x-y;
	}
	public void display()
	{
		System.out.println("i2 The Difference Is : "+z);
	}	
}

class Main
{
	public static void main(String[] args)
	{
	try
	{
		Class c = Class.forName(args[0]);
		AR i = (AR)c.newInstance();	
		// AR i1 = new Sum();
		// AB i2 = new Sum();
		// AB i4 = (AB)c.newInstance();
		AR i1 = new Difference();
		i1.get();
		i1.calculate();
		i1.display();
		// i2.show();
	}
	catch(Exception e)
	{
		System.out.println("Enter the class to be loaded: ");
	}
	}
}