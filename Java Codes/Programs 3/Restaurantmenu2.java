// used method and constructor in restaurant menu

import java.util.Scanner;

class menu
{	
	public menu()//constructor
	{
		System.out.println("1.MEXICAN");
		System.out.println("2.CHINESE");
		System.out.println("3.ITALIAN");
		System.out.println("4.INDIAN");	
	}
	public void menu()//method
	{	
		int choose;
		Scanner scr=new Scanner(System.in);
		System.out.print("           ENTER YOUR CHOICE : ");
		choose=scr.nextInt();
		if(choose==1)
		{	
			System.out.println("1.MEXICAN");	
			System.out.println("----- NACHOS");
			System.out.println("-----ELOTE");
			System.out.println("-----MOLE");
		}
		else
		{
			System.out.println("Sorry we don't this dish");
		}
	}
}

class Restaurantmenu2
{
	public static void main(String args[])
	{
		menu hm = new menu();//calling constructor
		hm.menu();//calling method
	}
}

		