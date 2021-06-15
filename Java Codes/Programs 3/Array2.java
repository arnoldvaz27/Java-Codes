import java.util.Scanner;

class Array2
{
	public static void main(String args[])
	{
		int myarr[][][] = new int[2][2][2];
		int i,j,k;
		Scanner scr = new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			myarr[i][j] = scr.nextInt();
			k=scr.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			System.out.print(myarr[i][j] + "\t");
			System.out.println("THE SUM OF THE ARRAY IS "+ k);
			}
			System.out.println();
		}
	}
}