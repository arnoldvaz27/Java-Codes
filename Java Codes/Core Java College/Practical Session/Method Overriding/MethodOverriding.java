class Base{
	public void demoMethod(){
		System.out.println("This is method of base class");
	}
}

class Derived extends Base{
	public void demoMethod(){
		System.out.println("This is overriden method of derived class");
	}
}

class MethodOverriding{
	public static void main(String[] args) {
		System.out.println("main start");
		Derived d  = new Derived();
		d.demoMethod();
		System.out.println("main ends");
	}
}