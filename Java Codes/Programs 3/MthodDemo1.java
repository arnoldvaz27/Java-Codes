// Constructor is default method of class
// Name of class and constructor name should match with each other // It is used to pre intialize the class members
// It is excuted automatically once the object of class is created
// it lacks return type
class MthodDemo1
{
	public MthodDemo1()// constructor without parameter
 	{
		System.out.println("default method is executed");
	}
	public MthodDemo1(int a)// constructor with parameter
 	{
		System.out.println("default method is executed"+a);
	}
	public void display()//display without parameters
	{
		System.out.println("display method is executed");
	}
	public void display(int b)//display with parameters
	{
		System.out.println("display method is executed" +b);
	}
	public static void main(String args[])
	{
		MthodDemo1 obj = new MthodDemo1();
		MthodDemo1 obj1 = new MthodDemo1(100);
		obj.display();
		obj.display(100);
	}
} 
// OVERLOADING - It means more than one method with same name but different signature is know as overloading .
//OVERIDDING - It means to overwrite the old sentence by the new sentence.