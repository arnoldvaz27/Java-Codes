import java.util.Scanner;

class Vowels
{
	public static void main(String args[])
	{
		String letter;
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER THE Any VOWEL = ");
		letter = scr.nextLine();
		switch(letter)
		{
			case  "a": System.out.println("This is a vowel"  +letter);
			break;
			case "e" : System.out.println("This is a vowel"  +letter);
			break;	
			case "i" : System.out.println("This is a vowel"  +letter);
			break;
			case "o" : System.out.println("This is a vowel"  +letter);
			break;
			case "u" : System.out.println("This is a vowel"  +letter);
			break;	
			default : System.out.println("This is not a vowel"  +letter);
			break;
		}
	}
}	