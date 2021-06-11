import java.util.Scanner;

class EnterNumberIsPrimeOrNot
{
	public static void main(String arg[])
	{
		int n ;
		boolean Isprime = true;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = src.nextInt();
		if( n == 1) 
			Isprime = false;	
		for (int i = 2;i*i<n;i++)
		{
			if (n % i == 0){
				Isprime = false;
				break;
			}
		}
		System.out.println(Isprime);
	}
}
