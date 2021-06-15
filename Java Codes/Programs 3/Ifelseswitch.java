import java.util.Scanner;

class Ifelseswitch
{
	public static void main(String args[])
		{
		String vowels;
		Scanner scr = new Scanner(System.in);
		Scanner scr1 = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER 1 : ");
		vowels = scr.nextLine();
		if(vowels)
		{	
 			switch(vowels)
			{
				case "a" : System.out.println("THIS IS A VOWEL");
				break;
				case "e" : System.out.println("THIS IS A VOWEL");
				break;
				case "i" : System.out.println("THIS IS A VOWEL");
				break;
				case "o" : System.out.println("THIS IS A VOWEL");
				break;
				case "u" : System.out.println("THIS IS A VOWEL");
				break;
			}
		}
		else
		{
			System.out.println("YOU CANT SEE THE SWITCH PROGRAM ");
		}
	}
}