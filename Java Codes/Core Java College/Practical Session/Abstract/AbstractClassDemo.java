abstract class A{
	abstract void set(int x);

	void get(){
		System.out.println("This is a normal method of abstractclass A");
	}
}

class B extends A{
	void set(int x){
		System.out.println("Abstract method is overridden in derived class");
	}

void check(){
		System.out.println("This is normal method of derived class B");
	}
}

class AbstractClassDemo{
	public static void main(String[] args) {
		B b1 = new B();
		b1.get();
		b1.set(4);
		b1.check();
	}
}
