import java.lang.Thread;

class Thread1 extends Thread
{
	public void run()
	{
		for (int i = 1; i<=10;i++)
		{
			System.out.println("Thread1");
			try { Thread.sleep(1000);	} catch(Exception e){}
		}
	}
	
}

class Thread2 extends Thread
{
	public void run()
	{
		for (int i = 1; i<=10;i++)
		{
			System.out.println("Thread2");
			try { Thread.sleep(1000);	} catch(Exception e){}	
		}
	}
	
}

class ThreadTest
{
	public static void main(String args[])
	{
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		obj1.start();
		try { Thread.sleep(10);	} catch(Exception e){}
		obj2.start();
	
		System.out.println("Bye");
	}
}