import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		String a;
		String b="";
		Scanner src = new Scanner(System.in);
		a = src.nextLine();
		for (int i = a.length() - 1;i >=0;i--)
		{
			b = b+a.charAt(i);	
		}
		if (b.equals(a))
		{
			System.out.println("This is a palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
		
	}

}