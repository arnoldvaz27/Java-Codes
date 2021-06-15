// hierach 
// 1 parent and many classes

class parent
{
	public parent()
	{
		System.out.println("Default constuctor in parent ");
	}
}
class child extends parent
{
	public child()
	{
		System.out.println("Default constructor in child"); 
	}
}
class child1 extends parent
{
	public child1()
	{
		System.out.println("Default constructor in child 1");
	}
}

class hierardemo
{
	public static void main(String args[])
	{
		child obj =new child();
		child1 obj1 =new child1();
	}
}