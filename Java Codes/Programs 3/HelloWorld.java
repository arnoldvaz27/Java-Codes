import java.util.Scanner;


class HelloWorld
 {
	  public static void main(String[] args)
	 {
		int a=300;
		int b,c;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number you want to multiply:  ");
		b = src.nextInt();
		c = 300 * b;
		System.out.println("The product is: "+c);
		
   	} 
}








/*int[]a = {1,2,3,4};
      		int[]b = {4,16,1,2,3,22};
     	 	int[]c = new int[a.length+b.length];
     		 int count = 0;
      
      		for(int i = 0; i < a.length; i++) 
		{ 
	         		c[i] = a[i];
         			count++;
		} 
      			for(int j = 0; j < b.length;j++) 
			{ 
         				c[count++] = b[j];
      			} 
	      		for(int i = 0;i < c.length;i++) 
			System.out.print(c[i]+" ");*/
