import java.util.*;

class MultiTable {
	public static void main(String[] args) {
		int n,i,r;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = src.nextInt();

		for(i = 1;i<=10;i++) {
			r = n * i;
			System.out.println(n+"x"+i+"="+r);
		}
	}
}