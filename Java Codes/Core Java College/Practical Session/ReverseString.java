import java.util.*;

class ReverseString {
	public static void main(String[] args) {
		String original,reverse = "";
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = src.nextLine();
		int length = original.length();
		for(int i = length-1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of entered string is: "+reverse);
	}
}