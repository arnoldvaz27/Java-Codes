import java.util.Arrays;
import java.util.Scanner;

class ArraystringExample
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the length of string of array");
		int length = sc.nextInt();

		String[] input = new String[length];
		
		for(int i= 0; i< length ; i++)
		{
			String userInput = sc.next();
			input [i] = userInput;
		}
		System.out.println("The String array input from user is: ");	
		System.out.println(Arrays.toString(input));
				
	}
}


	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number of dishes you want to order: ");
		int length = sc.nextInt();
		System.out.println("Enter The Dish Name:  ");
		Integer[] input = new Integer[length];
		
		for(int i= 0; i< length ; i++)
		{
			Integer userInput = sc.nextInt();+
			input [i] = userInput;
		}
		System.out.println("The String array input from user is: ");	
		System.out.println(Arrays.toString(input));*/