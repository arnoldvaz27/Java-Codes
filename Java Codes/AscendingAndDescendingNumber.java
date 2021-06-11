import java.util.Scanner;
class AscendingAndDescendingNumber
{
	public static void main(String args[])
	{
		int a[] = new int[100];
		int b,c,d,e,f,g,temp;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the number: ");
		b = src.nextInt();
		for(c = 0;c < b;c++)
		{
			System.out.print(c+" Enter the number: ");
			a[c] = src.nextInt();
		}
		System.out.print("The ascending number are: ");
		for(d = 0;d<c;d++)
			System.out.print(a[d]+",");
		System.out.println(" ");
		System.out.print("The descending number are: ");
		for(d = c-1; d>= 0;d--)
			System.out.print(a[d]);
	}
}