import java.util.Scanner;
class Voting
{
	public static void main(String args[])
	{
		int a ;
		Scanner src  = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		a  = src.nextInt();	
		if(a<=18)
		try{
			throw new ArithmeticException();
		}
		catch(ArithmeticException h)
		{
			System.out.println(h);
		}
		else
			System.out.println("Eligible for voting");
	}
}