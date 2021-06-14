import java.util.*;

class MatrixAddition
{
	public static void main(String ars[])
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i,j;	
		
		Scanner src =new Scanner(System.in);
		System.out.println("Enter elements for first 3x3 matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j] = src.nextInt();
			}
		}

		System.out.println("Enter elements for second 3x3 matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				b[i][j] = src.nextInt();
			}
		}
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}	
	
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}