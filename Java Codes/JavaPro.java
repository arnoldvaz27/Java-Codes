import java.util.Scanner;
class JavaPro
{
	public static void main(String args[])
	{
		int c,d;
		int a = 0,b=1;
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the number: ");
		d = src.nextInt();
		System.out.print(a+" "+b);
		for( int i = 2;i<=d;i++)
		{
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b=c;
			;
		}
	}
}