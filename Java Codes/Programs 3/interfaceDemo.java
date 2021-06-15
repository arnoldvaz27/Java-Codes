/*
1) interface contains method in defination   mode only
2) interface cannot be instantiated
3) by deafault interface methods are public 
4) class implements interface methods
5) with interface we can achieve runtime polymorphism
6) interface can be implemented by any class
*/
interface shape
{
	void area();// area is abstract method by default public access specifier 
}
class rectangle implements shape 
{
	public void area()
	{
		int len,breadth;
		len=6;
		breadth=10;
		System.out.println("AREA OF RECTANGLE IS " +(len*breadth));
	}
}
class triangle implements shape 
{
	public void area()
	{
		float base= 5.1f , height=7.1f;
		System.out.println("AREA OF TRIANGLE IS " +(0.5f*base*height));
	}
}
class interfaceDemo
{
	public static void main(String args[])
	{
		rectangle obj = new rectangle();
		triangle obj1 = new triangle();
		obj.area();
		obj1.area();
	}
}