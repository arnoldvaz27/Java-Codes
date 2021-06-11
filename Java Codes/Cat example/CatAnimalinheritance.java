class Animal
{
	public void classMethod()
	{
		System.out.println("Parent class Method");
	}
	public static void instanceMethod()
	{
		System.out.println("Parent class instance");		
	}
}
class Cat extends Animal
{
	public void classMethod()
	{
		System.out.println("Child class Method");
	}
	public static void instanceMethod()
	{
		System.out.println("Child class instance");		
	}
}

class CatAnimalinheritance
{
	public static void main(String args[])
	{
		Cat myCat = new Cat();
		Animal myanimal = myCat;
		myanimal.classMethod();
		myanimal.instanceMethod();
	}
}