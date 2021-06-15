import java.util.Scanner;
import java.util.HashMap;	
import java.util.Arrays;

class Restaurantmenu1
{	
	public static void main(String args[])
	{
		int a;
		Scanner src = new Scanner(System.in);
		HashMap<String , Integer> obj= new HashMap<String , Integer>();

		String obj1 = new String("DAL RICE");
		String obj2 = new String("PANNER TIKKA");
		String obj3 = new String("PANNER MASALA");
		String obj4 = new String("CHICKEN TIKKA");


		
		Integer obj7 = new Integer(300);
		Integer obj8 = new Integer(350);
		Integer obj9 = new Integer(200);
		Integer obj10 = new Integer(250);
		
		obj.put(obj1,obj7);
		obj.put(obj2,obj8);
		obj.put(obj3,obj9);
		obj.put(obj4,obj10);
		
		System.out.println("1 "+obj1+"             Rs."+obj7);
		System.out.println("2 "+obj2+"       Rs."+obj8);
		System.out.println("3 "+obj3+"         Rs."+obj9);
		System.out.println("4 "+obj4+"        Rs."+obj10);

		String[] [] myarr = new String[3][2];

		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the name:  ");
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				 myarr[i][j] = scr.nextLine();	
			}
			System.out.println();
		}

		System.out.println("The Entere values are: ");

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print( myarr[i][j] + "        ");	
			}
			System.out.println();
		}				
	}
}