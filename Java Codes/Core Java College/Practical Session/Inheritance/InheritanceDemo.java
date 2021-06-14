class Base{
	public void set(){
		System.out.println("This set() method of base class");
	}

	public void get(){
		System.out.println("This get() method of base class");
	}
}

class Derived extends Base{
	public void check(){
		System.out.println("This check() method of derived class");
	}

	public void demo(){
		System.out.println("This demo() method of derived class");
	}
}

class InheritanceDemo{
	public static void main(String[] args) {
		System.out.println("main start");
		Derived d  =new Derived();
		d.set();
		d.get();
		d.check();
		d.demo();
		System.out.println("main ends");			
	}
}