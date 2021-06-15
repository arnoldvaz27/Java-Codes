import java.util.Scanner;

public  class NumberGreaterEqualTest
{

	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				if (a[i]<b[j])
				{
								System.out.println(a[i]+" is less and "+ b[j] +" is greater");
				}
				else if(a[i]==b[j])
				{
					System.out.println(a[i]+" is equal to "+ b[j]);
				}
				else
				{
								System.out.println(b[j] +" is less and "+a[i]+" is greater");
				}
			}
		}
	}	
}