// method inheritance and sngle level inheritance 
// while joining child and parent class we have to use the word                         :-       [ EXTEND ]
class parent 
{
	public parent()
	{
		System.out.println("Default constructor of parent class");
	}
	public void test()//method inheritance
	{
		System.out.println("test method of parent class");
	}
}
class child extends parent // single level inheritance 
{
	public child()
	{
		System.out.println("Default constructor of child class");
	}
	public void show()
	{
		System.out.println("show method of child  class");
	}
	public void test()//method inheritance
	{
		super.test();
		System.out.println("test method of parent class is overridden ");
	}	
}
class inheritDemo
{
	public static void main(String args[])
	{
		child obj = new child();
		obj.test();
		obj.show();
	}
}