class Finalizer{
	public Finalizer(){
		System.out.println("Constructor executes");
	}
	public void finalize() throws Throwable{
		System.out.println("Finalizer executes");
	}

	public void set(){
		System.out.println("This is set method");
	}
}

class C{
	public static void main(String[] args) throws Throwable{
		System.out.println("Main starts");
		Finalizer f  = new Finalizer();
		f.set();
		f.finalize();
		System.out.println("Main ends");
	}
}