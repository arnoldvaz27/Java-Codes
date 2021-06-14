import java.util.*;

class CountsInString {
	public static void main(String[] args) {
		String s;
		int i,alpha=0,sp=0,num=0,sym=0;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a string: ");
		s = src.nextLine();
		char arr[] = s.toCharArray();
		for (i=0;i<arr.length ;i++ ) {
			if ((arr[i]>=65 && arr[i]<=90) || (arr[i]>=97 && arr[i]<=122)) {
				alpha++;
			}
			if (arr[i] == 32) {
				sp++;
			}
			if (arr[i]>=48 && arr[i]<=57) {
				num++;
			}
			if((arr[i]>=0 && arr[i]<=47 )||(arr[i]>=58 && arr[i]<=64) ||
				(arr[i]>=91 && arr[i]<=96) || (arr[i] >=123 && arr[i]<=127)){
				sym++;
			}
		}
		System.out.println("Total count of letters: "+alpha);
		System.out.println("Total count of spaces: "+sp);
		System.out.println("Total count of numbers: "+num);
		System.out.println("Total count of special symbols: "+sym);
	}
}