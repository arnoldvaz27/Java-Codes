class TopLeftNumberFormatPattern
{
	public static void main(String args[])
	{
		int n = 10;
		for (int i = n; i>=1;i--)
		{
			for (int j=i;j>=1;j--)//
			{
			if(n==5)
				System.out.print(" "+i);
			else
				System.out.print(" "+j);
			}
		System.out.println(" ");
		}
	
	}
}