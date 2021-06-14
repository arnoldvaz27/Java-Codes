import java.util.*;

class ArrayOperations{
	public static void main(String[] args) {
		int a[] = new int[15];
		int largest,smallest;
		int i;

		Scanner src = new Scanner(System.in);
		System.out.println("ENter 15 elements: ");
		for(i = 0;i<=14;i++){
			a[i]=src.nextInt();
		}

		largest = a[0];
		smallest = a[0];

		for (i=0;i<=14 ;i++ ) {
			if(a[i]>largest){
				largest = a[i];
			}
			if (a[i]<smallest) {
				smallest = a[i];
			}
		}

		System.out.println("Smallest elements is: "+smallest);
		System.out.println("Largest elements is: "+largest);
	}
}