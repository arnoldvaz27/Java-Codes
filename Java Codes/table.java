import java.util.Scanner;

class table
{
	public static void main(String args[])
{
	int i,j,r,k,p;
	Scanner src = new Scanner(System.in);
	System.out.print("Enter the table number:  ");
	r = src.nextInt();
	for (i = r;i<=r;i++)
	{	
		System.out.print("Enter the last number till you want to multiply: ");
		p = src.nextInt();
		for (j = 1;j<=p;j++)
		{
			k = i * j;	
			System.out.println(i+"*"+j+"="+k);
		}
	}
}
}