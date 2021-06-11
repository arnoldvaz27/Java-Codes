import java.util.Scanner;
import java.util.HashMap;	
import java.util.Arrays;

class Dish
{
	int r1,r2,r3,r4,total,items;
	int a,n,c,s;
	int d;
	int discount,discountprize,prize;
	String D1 = "**********Order above Rs. 2500 and get 6% discount***********";
	String D2 = "**********Order above Rs. 3500 and get 12% discount**********";
	String D3 = "**********Order above Rs. 5000 and get 18% discount**********";
	int minus;
		Scanner src = new Scanner(System.in);
		HashMap<String , Integer> obj= new HashMap<String , Integer>();

		String BURGER = new String("Burger");
		String PIZZA = new String("Pizza");
		String PANNERTIKKA = new String("Panner Tikka");
		String CHICKENTIKKA = new String("Chicken Tikka");

		Integer obj1 = new Integer(300);
		Integer obj2 = new Integer(350);
		Integer obj3 = new Integer(200);
		Integer obj4 = new Integer(250);

	public void listDishes()
	{
		obj.put(BURGER,obj1);
		obj.put(PIZZA,obj2);
		obj.put(PANNERTIKKA,obj3);
		obj.put(CHICKENTIKKA,obj4);
		System.out.println(D1);
		System.out.println(D2);
		System.out.println(D3);
		System.out.println("--------------------------------------------------------");
		System.out.println("[1. "+BURGER+"               Rs."+obj1+"]");
		System.out.println("[2. "+PIZZA+"                Rs."+obj2+"]");
		System.out.println("[3. "+PANNERTIKKA+"         Rs."+obj3+"]");
		System.out.println("[4. "+CHICKENTIKKA+"        Rs."+obj4+"]");
		System.out.println("--------------------------------------------------------");
	
		System.out.print("Enter the number of dishes you want to order : ");
		n = src.nextInt();
		items = n;
		System.out.println("--------------------------------------------------------");
		for(int i = 0;i < n;i++)	
		{order();}
		order1();
	}
	void order()	
	{
			System.out.print("Enter the dish Number: ");
			c  = src.nextInt();
			if (c==1)
			{
				System.out.println("[1. "+BURGER+"]");
				System.out.print("Enter the number of " + BURGER + " you want to order: ");
				r1 += src.nextInt();
				System.out.println("--------------------------------------------------------");								
			}
			else if (c==2)
			{
				System.out.println("[2. "+PIZZA+"]");
				System.out.print("Enter the number of " + PIZZA + " you want to order: ");
				r2 += src.nextInt();
				System.out.println("--------------------------------------------------------");
			}
			else if (c==3)
			{
				System.out.println("[3. "+PANNERTIKKA+"]");
				System.out.print("Enter the number of " + PANNERTIKKA + " you want to order: ");
				r3 += src.nextInt();
				System.out.println("--------------------------------------------------------");
			}
			else if (c==4)
	 		{
				System.out.println("[4. "+CHICKENTIKKA+"]");
				System.out.print("Enter the number of " + CHICKENTIKKA + " you want to order: ");
				r4 += src.nextInt();
				System.out.println("--------------------------------------------------------");
			}
		
	}
	void order1()
	{
		System.out.print("Press 1 to order more dish or Press 2 to cancel the order or Press 0 to exit: ");
		a = src.nextInt();
		if (a==4)
		{
			order();
			items+=items;
		}
		if(a==5)
		{
			
		}
		System.out.print("Press 1 To Generate receipts: ");
		s = src.nextInt();
		if(r1>=1 && r1<=99 || r2>=1 && r2<=99 ||r3>=1 && r3<=99 ||r4>=1 && r4<=99)
		{
			System.out.println("--------------------------------------------------------");
			System.out.println ("Dishes        Qauntity         Rate         Prize");
			System.out.println("--------------------------------------------------------");
		}
		if(s==1)
		{
			if(r1>0)
			{
				total+=obj1*r1;
				System.out.println(BURGER+ "          "+ r1+ "             "+obj1+"         Rs."+obj1*r1);
			}
			if(r2>0)
			{
				total+=obj2*r2;
				System.out.println(PIZZA+"           "+r2+"             "+obj2+"         Rs."+obj2*r2);
			}
			if(r3>0)
			{	
				total+=obj3*r3;
				System.out.println(PANNERTIKKA+"    "+r3+"             "+obj3+"         Rs."+obj3*r3);
			}
			if(r4>0)
			{
				total+=obj4*r4;
				System.out.println(CHICKENTIKKA+"   "+r4+"             "+obj4+"         Rs."+obj4*r4);
			}
			if (total>=0 && total <= 2499) 
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("ITEMS:- "+items+ "  TOTAL :                          Rs."+total+"    ");
				System.out.println("--------------------------------------------------------");				
			}
			if (total>=2500 && total <=3499)
			{
				discount = 6;
				discountprize=100-discount;
				prize=(discountprize*total)/100;
				System.out.println("--------------------------------------------------------");
				System.out.println("ITEMS:- "+items+ " TOTAL :                          Rs."+prize+"    ");
				System.out.println("--------------------------------------------------------");
				minus = total - prize;
				System.out.println("           ****You Saved "+minus+ " AFTER DISCOUNT****");
			}
			if (total>=3500 && total <=4999)
			{
				discount = 12;
				discountprize=100-discount;
				prize=(discountprize*total)/100;
				System.out.println("--------------------------------------------------------");
				System.out.println("ITEMS:- "+items+ "  TOTAL :                          Rs."+prize+"    ");
				System.out.println("--------------------------------------------------------");
				minus = total - prize;
				System.out.println("           ****You Saved "+minus+ " AFTER DISCOUNT****");
			}
			if (total>=5000)
			{
				discount = 18;
				discountprize=100-discount;
				prize=(discountprize*total)/100;
				System.out.println("--------------------------------------------------------");
				System.out.println("ITEMS:- "+items+ " TOTAL :                          Rs."+prize+"    ");
				System.out.println("--------------------------------------------------------");
				minus = total - prize;
				System.out.println("           ****You Saved "+minus+ " AFTER DISCOUNT****");
			}
		}
	}
}
class Food
{
	public static void main(String args[])
	{
		Dish d = new Dish();
		d.listDishes();
	}
}