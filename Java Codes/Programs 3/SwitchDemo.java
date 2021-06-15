import java.util.Scanner;

class SwitchDemo
{
	public static void main(String args[])
	{
		int a,b,choose;
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER a : ");
		a = scr.nextInt();
		System.out.println("ENTER b : ");
		b = scr.nextInt();
		System.out.println("ENTER Your Choice : ");
		choose= scr.nextInt();
		switch(choose)
		{
		case 1 : System.out.println("ADD = "+(a+b));
		break;
		case 2 : System.out.println("Quotient = "+(a/b));
		break;
		case 3 : System.out.println("prod = "+(a*b));
		break;
		case 4 : System.out.println("Diff = "+(a-b));
		break;
		case 5 : System.out.println("remain = "+(a%b));
		break;
		}
	}
}