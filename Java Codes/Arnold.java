class Arnold extends Thread
{
	public void run()
	{
	int i;
		for (i=0;i<=10;i++){
			System.out.println(i);
		try{
		Thread.sleep(50);
		}
		catch(Exception r){}
		}
	}			
	public static void main(String args[])
	{
		Arnold a  = new Arnold();
		a.start();
		Arnold a1 = new Arnold();
		a1.run();

	}

}

//Static thread
/*
	static 
	{
		Thread t = Thread.currentThread();
		System.out.println("Name of thread in static block= "+t.getName());
	}
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println("Name of thread"+t.getName());
		System.out.println("Priority of thread "+t.getPriority());		
		t.setName("Arnold");
		t.setPriority(7);
		try{
		t.sleep(2000);
		}
		catch(Exception r){}
		System.out.println("Name of thread"+t.getName());
		System.out.println("Priority of thread "+t.getPriority());	
	}
*/

	