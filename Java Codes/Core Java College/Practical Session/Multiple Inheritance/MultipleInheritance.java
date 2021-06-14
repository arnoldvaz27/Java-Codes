class A{
	public void get(){
		System.out.println("This is set() method of class A");
	}

	public void demo(){
		System.out.println("This is demo() method of class A");
	}
}

interface B{
	public void set();
	public void check();
}

class C extends A implements B{
	public void put(){
		System.out.println("This is put() method of class C");
	}

	public void set(){
			System.out.println("This is overriden set() method of interface B");
	}

	public void check(){
			System.out.println("This is  overriden check() method of interface B");
	}
}

class MultipleInheritance{
	public static void main(String[] args) {
		System.out.println("main starts");
		C c = new C();
		c.get();
		c.demo();
		c.put();
		c.set();
		c.check();
		System.out.println("main ends");
	}
}