import java.util.Scanner;

class IncreaseBoxStarPattern
{
	public static void main(String args[])
	{
		for(int i = 1;i<7;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*"+"   ");
				System.out.println("*");
			}
				for(int k = 6;k>1;k--)
				{
					System.out.print("*");
				}
			System.out.println(" ");
		}				
	}
}