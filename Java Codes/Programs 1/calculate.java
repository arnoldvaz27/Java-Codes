import java.util.Scanner;

class calculate
{
	public static void main(String args[])
	{
		int i , n;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the number to find the factor: ");
		n = src.nextInt();
		int factorial = 1;
		for (i = n;i>=1;i--)
		{
			factorial = factorial * i;
		}
		
			System.out.print(" "+factorial);
	}
}

/*
1d 
2a
2c
2d
2e
2f
------
long a,b,c;
		Scanner scr= new Scanner(System.in);
		System.out.println("ENTER THE STARTING NUMBER :   ");
		a=scr.nextLong();
		System.out.println("ENTER THE LAST NUMBER:  ");
		b=scr.nextLong();
		while(a<=b)
		{
			System.out.println("-"+a);
			a++;
		}

--------------------------------------------------------------------------------------------------------
		int n ;
		float result = 0;
		Scanner scr= new Scanner(System.in);
		System.out.println("ENTER THE STARTING NUMBER :   ");
		n=scr.nextInt();
		for(float i=1;i<=n;i++)
		{
			if(i % 2 == 0)
				result -= 1/i;
			else
				result += 1/i;
		}
		System.out.println("Result: "+result);
	

*/