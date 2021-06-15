class ThisDemo
{
	int a;
	public ThisDemo();
	{
		System.out.println("Default Constructor of class");
	}
	public ThisDemo(int a)
	{
		this.a=a;
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		ThisDemo obj = new ThisDemo();
		ThisDemo obj1 = new ThisDemo(100);
	}
}
