interface A
{
	void show();
	{
		System.out.println("Arnold");
	}
}
interface B
{
	void test();
	{
		System.out.println("Vaz");
	}
}
class C implements A,B
{
	public void show()
	{
		System.out.println("SHOW METHOD OF CLASS INTERFACE A");
	}
	public void test()
	{
		System.out.println("TEST METHOD OF CLASS INTERFACE B");
	}
}
class Mulinterface
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.show();
		obj.test();
	}
}