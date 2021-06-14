class Cat
{
	boolean hasFur; //States bydefault = false
	String color,breed;  //NULL
	int legs,eyes;	//0 
	
	public void walk() //behaviour
	{
		System.out.println("Walking");
	}
	public void eat() //behaviour
	{
		System.out.println("Eating");
	}
	public void description()
	{
		System.out.println(legs+"\n"+eyes);
	}
		
}

	
public class MainCl
{
	public static void main(String[] args)
	{
		Cat cat1 = new Cat();
		cat1.legs = 3;
		cat1.eyes = 4;
		cat1.description();
	}
}