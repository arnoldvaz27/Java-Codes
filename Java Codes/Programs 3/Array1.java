import java.util.Scanner;

class Array1
{
	public static void main(String args[])
	{
		int myarr[][] = new int[2][2];
		int i,j;
		Scanner scr = new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			myarr[i][j] = scr.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			System.out.print(myarr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}