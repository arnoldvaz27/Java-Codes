import java.util.Scanner;

class Addarray
{
	public static void main(String args[])
	{
	int  k,w,x,z;
	Scanner scr= new Scanner(System.in);
	System.out.println("ENTER THE NUMBER OF ROWS AND COLUMN : ");
	k=scr.nextInt();
	w=scr.nexInt();
	int first[] []= new int[k][w];
	int second[] []= new int[k][w];
	int sum[] []= new int[k][w];
	System.out.println("ENTER THE ELEMENT FOR FIRST ARR :");
		for(x=0;x<k;x++)
		{
			for(z=0;z<w;z++)
			{
				first[x][z]=scr.nextInt();
			}
		}
		System.out.println("ENTER THE ELEMENT FOR SECOND ARR :");
		for(x=0;x<k;x++)
		{
			for(z=0;z<w;z++)
			{
				second[x][z]=scr.nextInt();
			}
		}
		for(x=0;x<k;x++)
		{
			for(z=0;z<w;z++)
			{
				sum[x][z]=first[x][z]+second[x][z];
			}
		}
		System.out.println("SUM OF TWO ARRAY :");
		for(x=0;x<k;x++)
		{
			for(z=0;z<w;z++)
			{
				System.out.print(sum[x][z]+"\t");
			}
		System.out.println();
		}
	}
}