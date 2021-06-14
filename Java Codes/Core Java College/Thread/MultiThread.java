class thread1 extends Thread
{
	public void run()
	{
		int i;
		for(i = 1;i<=10;i+=2)
		{
			System.out.println("Thread 1 prints: "+i);
		}
	}
}

class thread2 extends Thread
{
	public void run()
	{
		int i;
		for(i = 1;i<=10;i+=2)
		{
			System.out.println("Thread 2 prints: "+i);
		}
	}
}

class MultiThread
{
	public static void main(String args[])
	{
			thread1 t1 = new thread1();
			thread2 t2 = new thread2();
			t1.start();
			t2.start();
	}
}