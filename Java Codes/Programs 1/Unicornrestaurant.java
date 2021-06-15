//tu mera hum dard
import java.util.Scanner;
import java.util.Date;

class unicorn
{
	public unicorn()
	{
		System.out.println("----------ARNOLD VAZ WELCOME'S YOU TO OUR UNICORN RESTAURANT-----------");
		System.out.println(" ******ADDRESS ---- 304 STREET , WASHINGTON DC , UNITED STATES*********");
		System.out.println("PHONE NUMBER :- 8329081600/ 01/ 02 /03");
		System.out.println("***********************************************************************");
		System.out.println("-------------------------------UNICORN RESTAURANT-----------------------------------------------");
		System.out.println("***********************************************************************");
	}
	public void unicorn()
	{
		int type,type1;
		int choice;
		int z;
		Scanner ar = new Scanner(System.in);
		String choose;
		Scanner arnold=new Scanner(System.in);
		Scanner arnold1 = new Scanner(System.in);
		do
		{
		System.out.println("--------------------COUNTRY CUISINE SECTION--------------------------");
		System.out.println("VARIETIES OF CUISINE'S WE PROVIDE IN OUR UNICORN RESTAURANT ARE :-");
		System.out.println("1.ITALIAN");
		System.out.println("2.MEXICAN");
		System.out.println("3.CHINESE");
		System.out.println("4.INDIAN");
		System.out.println("5.GERMAN");
		System.out.println("6.CONTINENTAL");
		System.out.println("7.MALAYSIAN");
		System.out.println("8.AUSTRALIAN");
		System.out.println("9.AMERICAN");
			System.out.println("-----------------------------------------------");
			System.out.print("           ENTER YOUR CHOICE FOR TYPE OF DISH : ");
			choice=arnold.nextInt();
			if(choice==1)
			{	
				System.out.println("1.ITALIAN");
				System.out.println("    1. CAPRESE SALAD  - RS.100/-");
				System.out.println("    2. PANAZELLA - RS.200/-");
				System.out.println("    3. BRUSHCHETTA - RS.300/-");
				System.out.println("    4. FOCACCIA BREAD - RS.200/-");
				System.out.println("    5. PASTA   -  RS.200/-");
				System.out.println("    6. PIZZA   -  RS.200/-");
				System.out.println("    7. RISOTTO - RS.150/-");
				System.out.println("    8. LASAGNA - RS.150/-");
				System.out.println("    9. TIRAMISU - RS.200/-");
				System.out.print("ENTER YOUR CHOICE FOR DISHES : ");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("caprese salad"))
				{
					System.out.println("  CAPRESE SALAD");
						System.out.println("*************************************");
				}
				else if(choose.equals("2") || choose.equals("panazella"))
				{
					System.out.println("----PANAZELLA");
				}
				else if(choose.equals("3") || choose.equals("brushchetta"))
				{
					System.out.println("----BRUSHCHETTA");
				}
				else if(choose.equals("4") || choose.equals("focaccia bread"))
				{
					System.out.println("----FOCACCIA BREAD");
				}
				else if(choose.equals("5") || choose.equals("pasta"))
				{
					System.out.println("----PASTA");
				}
				else if(choose.equals("6") || choose.equals("pizza"))
				{
					System.out.println("----PIZZA");
				}
				else if(choose.equals("7") || choose.equals("risotto"))
				{
					System.out.println("----RISOTTO");
				}
				else if(choose.equals("8") || choose.equals("lasagna"))
				{
					System.out.println("----LASAGNA");
				}
				else if(choose.equals("9") || choose.equals("tiramisu")) 
				{
					System.out.println("----TIRAMISU");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else if(choice==2)
			{
				System.out.println("2.MEXICAN");	
				System.out.println("     1. NACHOS - RS.150/-");
				System.out.println("     2. TACOS PASTER  - RS.200/-");
				System.out.println("     3. CHILES NOGADA - RS.250/-");
				System.out.println("     4. TOSTADOS - RS.350/-");
				System.out.println("     5. ELOTE - RS.150/-");
				System.out.println("     6. MOLE - RS.210/-");
				System.out.println("     7. TAMALES - RS.240/-");
				System.out.println("     8. ENCHILADAS - RS.230/-");
				System.out.println("     9. POZOLE - RS.300/-");
				System.out.print("ENTER YOUR CHOICE FOR DISH :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("nachos"))
				{
					System.out.println("----NACHOS");
				}
				else if(choose.equals("2") || choose.equals("tacos paster"))
				{
					System.out.println("----TACOS PASTER");
				}
				else if(choose.equals("3") || choose.equals("chiles nogada"))
				{
					System.out.println("----CHILES NOGADA");
				}
				else if(choose.equals("4") || choose.equals("tostados"))
				{
					System.out.println("----TOSTADOS");
				}
				else if(choose.equals("5") || choose.equals("elote"))
				{
					System.out.println("----ELOTE");
				}
				else if(choose.equals("6") || choose.equals("mole"))
				{
					System.out.println("----MOLE");
				}
				else if(choose.equals("7") || choose.equals("tamales"))
				{
					System.out.println("----TAMALES");
				}
				else if(choose.equals("8") || choose.equals("enchiladas"))
				{
					System.out.println("----ENCHILADAS");
				}
				else if(choose.equals("9") || choose.equals("pozole"))
				{
					System.out.println("----POZOLE");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");	
				}		
			}
			else if(choice==3)
			{			
				System.out.println("3.CHINESE");	
				System.out.println("      1. CHINESE NOODLES - RS.100/-");
				System.out.println("      2. CHINESE BHEL - RS.90/-");
				System.out.println("      3. MOMOS - RS.290/-");
				System.out.println("      4. SPRING ROLLS - RS.100/-");
				System.out.println("      5. FRIED SHRIMPS - RS.240/-");
				System.out.println("      6. JELLY FISH - RS.150/-");
				System.out.println("      7. EGG FRIED RICE - RS.100/-");
				System.out.println("      8. ROASTED DUCK - RS.120/-");
				System.out.println("      9. DUMPLINGS - RS.120/-");
				System.out.print("ENTER YOUR CHOICE FOR DISH :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("chinese noodles"))
				{
					System.out.println("----CHINESE NOODLES");
				}
				else if(choose.equals("2") || choose.equals("chinese bhel"))
				{
					System.out.println("----CHINESE BHEL");
				}
				else if(choose.equals("3") || choose.equals("momos"))
				{
					System.out.println("----MOMOS");
				}
				else if(choose.equals("4") || choose.equals("spring rolls"))
				{
					System.out.println("----SPRING ROLLS");
				}
				else if(choose.equals("5") || choose.equals("fried shrimps"))
				{
					System.out.println("----FRIED SHRIMPS");
				}
				else if(choose.equals("6") || choose.equals("jelly fish"))
				{
					System.out.println("----JELLY FISH");
				}
				else if(choose.equals("7") || choose.equals("egg fried rice"))
				{
					System.out.println("----EGG FRIED RICE");
				}
				else if(choose.equals("8") || choose.equals("roasted ducks"))
				{
					System.out.println("----ROASTED DUCKS");
				}
				else if(choose.equals("9") || choose.equals("dumplings"))
				{
					System.out.println("----DUMPLINGS");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");	
				}			
			}
			else if(choice==4)	
			{
				System.out.println("4.INDIAN");	
				System.out.println("       1. PAV BAHJI - RS.130/-");
				System.out.println("       2. MISAL PAV - RS.100/-");
				System.out.println("       3. DOSA - RS.80/-");
				System.out.println("       4. DAL RICE - RS. 80/-");
				System.out.println("       5. ALOO PARATHA - RS.60/-");
				System.out.println("       6. FISH CURRY - RS.120/-");
				System.out.println("       7. PALAK PANNER - RS.110/-");
				System.out.println("       8. MASALA DOSA - RS.150/-");
				System.out.println("       9. PANNER CHILLI - RS.140/-");
				System.out.print("ENTER YOUR CHOICE FOR DISH :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("pav bhaji"))
				{
					System.out.println("----PAV BHAJI");
				}
				else if(choose.equals("2") || choose.equals("misal pav"))
				{
					System.out.println("----MISAL PAV");
				}
				else if(choose.equals("3") || choose.equals("dosa"))
				{
					System.out.println("----DOSA");
				}
				else if(choose.equals("4") || choose.equals("dal rice"))
				{
					System.out.println("----DAL RICE");
				}
				else if(choose.equals("5") || choose.equals("aloo paratha"))
				{
					System.out.println("----ALOO PARATHA");
				}
				else if(choose.equals("6") || choose.equals("fish curry"))
				{
					System.out.println("----FISH CURRY");
				}
				else if(choose.equals("7") || choose.equals("palak panner"))
				{
					System.out.println("----PALAK PANNER");
				}
				else if(choose.equals("8") || choose.equals("masala dosa"))
				{
					System.out.println("----MASALA DOSA");
				}
				else if(choose.equals("9") || choose.equals("panner chilli"))	
				{
					System.out.println("----PANNER CHILLI");	
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISH'S HERE SORRY");	
				}		
			}	
			else if(choice==5)
			{
				System.out.println("5.GERMAN");
				System.out.println("    1. ROULADEN - RS.250/-");
				System.out.println("    2. KASESPATZLE - RS.250/-");
				System.out.println("    3. ROTE GRUTZE - RS.250/-");
				System.out.println("    4. EINTOPF - RS.250/-");
				System.out.println("    5. SAUERBRATEN - RS.250/-");
				System.out.println("    6. KLOSSE - RS.250/-");
				System.out.println("    7. BREZEL - RS.250/-");
				System.out.println("    8. APPLE STRUDEL - RS.250/-");
				System.out.println("    9. WURST - RS.250/-");	
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("rouladen"))
				{
					System.out.println("----ROULADEN ");
				}
				else if(choose.equals("2") || choose.equals("kasespatzle"))
				{	
					System.out.println("----KASESPATZLE");
				else if(choose.equals("3") || choose.equals("rote grutze"))
				{
					System.out.println("----ROTE GRUTZE");
				}
				else if(choose.equals("4") || choose.equals("elintopf"))
				{
					System.out.println("----ELINTOPF");
				}
				else if(choose.equals("5") || choose.equals("sauerbraten"))
				{
					System.out.println("----SAUERBRATEN");
				}
				else if(choose.equals("6") || choose.equals("klosse"))
				{
					System.out.println("----KLOSSE");
				}
				else if(choose.equals("7") || choose.equals("brezel"))
				{
					System.out.println("----BREZEL");
				}
				else if(choose.equals("8") || choose.equals("apple strudel"))
				{
					System.out.println("----APPLE STRUDEL");
				}
				else if(choose.equals("9") || choose.equals("wurst"))
				{
					System.out.println("----WURST");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else if(choice==6)
			{
				System.out.println("6. CONTINENTAL");
				System.out.println("    1. WIENER SCHNITZEL - RS.150/-");
				System.out.println("    2. BLACK FOREST CAKE - RS.70/-");
				System.out.println("    3. CHANAKHI - RS.140/-");
				System.out.println("    4. CHICKEN KIEV - RS.120/-");
				System.out.println("    5. SUNDAY ROAST - RS.140/-");
				System.out.println("    6. OPEN SANDWICH - RS.70/-");
				System.out.println("    7. CARBONARA - RS.150/-");
				System.out.println("    8. DUCK FOOD - RS.150/-");
				System.out.println("    9. QUICHE - RS.50/-");
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("wiener schnitzel"))
				{
					System.out.println("----WIENER SCHNITZEL");		
				}
				else if(choose.equals("2") || choose.equals("black forest cake"))
				{
					System.out.println("----BLACK FOREST CAKE");
				}
				else if(choose.equals("3") || choose.equals("chanakhi"))
				{
					System.out.println("----CHANAKHI");
				}
				else if(choose.equals("4") || choose.equals("chicken kiev"))
				{
					System.out.println("----CHICKEN KIEV");
				}
				else if(choose.equals("5") || choose.equals("sunday roast"))
				{
					System.out.println("----SUNDAY ROAST");
				}
				else if(choose.equals("6") || choose.equals("open sandwich"))
				{
					System.out.println("----OPEN SANDWICH");	
				}
				else if(choose.equals("7") || choose.equals("carbonara"))
				{
					System.out.println("----CARBONARA");
				}
				else if(choose.equals("8") || choose.equals("duck food"))
				{
					System.out.println("----DUCK FOOD");
				}
				else if(choose.equals("9") || choose.equals("quiche"))
				{
					System.out.println("----QUICHE");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else if(choice==7)
			{
				System.out.println("7.MALAYSIAN");
				System.out.println("    1. BANANA LEAF - RS.50/-");
				System.out.println("    2. NASI DAGANG - RS.110/-");
				System.out.println("    3. BAKUTEH - RS.140/-");
				System.out.println("    4. HOKKIEN MEE - RS.90/-");	
				System.out.println("    5. SANG HAR NOODLES - RS.100/-");
				System.out.println("    6. SATAY - RS.130/-");	
				System.out.println("    7. NASI KANDAR - RS.140/-");
				System.out.println("    8. CHARSIEV RICE - RS.120/-");
				System.out.println("    9. NASI LEMAK - RS.130/-");
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("banana leaf"))
				{
					System.out.println("----BANANA LEAF");	
				}
				else if(choose.equals("2") || choose.equals("nasi dangang"))	
				{	
					System.out.println("----NASI DANGANG");
				}
				else if(choose.equals("3") || choose.equals("bakuteh"))
				{
					System.out.println("----BAKUTEH");
				}
				else if(choose.equals("4") || choose.equals("hokkein mee"))	
				{
					System.out.println("----HOKKIEN MEE");
				}
				else if(choose.equals("5") || choose.equals("sang har noodles"))
				{
					System.out.println("----SANG HAR NOODLES");
				}
				else if(choose.equals("6") || choose.equals("satay"))
				{
					System.out.println("----SATAY");
				}
				else if(choose.equals("7") || choose.equals("nasi kandar"))
				{
					System.out.println("----NASI KANDAR");
				}	
				else if(choose.equals("8") || choose.equals("charsiev rice"))
				{
					System.out.println("----CHARSIEV RICE");
				}
				else if(choose.equals("9") || choose.equals("nasi lemak"))
				{
					System.out.println("----NASI LEMAK");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else if(choice==8)
			{
				System.out.println("8.AUSTRALIAN");
				System.out.println("    1. CHICKEN PARMIGIANA");
				System.out.println("    2. BARBEQUED SNAGS");
				System.out.println("    3. LAMINGTONS");
				System.out.println("    4. BURGER");
				System.out.println("    5. PAVLOVA");
				System.out.println("    6. MEAT PIES");
				System.out.println("    7. BARRAMUNDI");
				System.out.println("    8. VEGEMITE ON TOAST");
				System.out.println("    9. PUMPKIN SOUP");
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("chicken parmigiana"))
				{
					System.out.println("----CHICKEN PARMIGIANA");
				}
				else if(choose.equals("2") || choose.equals("barbequed snags"))
				{
					System.out.println("----BARBEQUED SNAGS");
				}
				else if(choose.equals("3") || choose.equals("lamingtons"))
				{
					System.out.println("----LAMINGTONS");
				}
				else if(choose.equals("4") || choose.equals("burger"))
				{
					System.out.println("----BURGER");
				}	
				else if(choose.equals("5") || choose.equals("pavlova"))
				{
					System.out.println("----PAVLOVA");
				}
				else if(choose.equals("6") || choose.equals("meat pies"))
				{
					System.out.println("----MEAT PIES");
				}
				else if(choose.equals("7") || choose.equals("barramundi"))
				{
					System.out.println("----BARRAMUNDI");
				}
				else if(choose.equals("8") || choose.equals("vegemite on toast"))
				{
					System.out.println("----VEGEMITE ON TOAST");
				else if(choose.equals("9") || choose.equals("pumpkin soup"))
				{
					System.out.println("----PUMPKIN SOUP");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else if(choice==9)
			{
				System.out.println("9.AMERICAN");
				System.out.println("    1. SAUSAGS");
				System.out.println("    2. CHOCOLATE CHIP COOKIES");
				System.out.println("    3. S'MORES");
				System.out.println("    4. CRONUT");
				System.out.println("    5. CHICKEN & WAFFLES");
				System.out.println("    6. PAN CAKES");
				System.out.println("    7. MAC & CHEESE");
				System.out.println("    8. HOT DOGS ");
				System.out.println("    9. CHEESE CAKE");
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=arnold1.nextLine();
				if(choose.equals("1") || choose.equals("sausags"))
				{
					System.out.println("----SAUSAGS");
				}
				else if(choose.equals("2") || choose.equals("chocolate chip cookies"))
				{
					System.out.println("----CHOCOLATE CHIP COOKIES");
				}
				else if(choose.equals("3") || choose.equals("s'mores"))
				{
					System.out.println("----S'MORES");
				}
				else if(choose.equals("4") || choose.equals("cronut"))
				{
					System.out.println("----CRONUT");
				}
				else if(choose.equals("5") || choose.equals("chicken & waffles"))
				{
						System.out.println("----CHICKEN & WAFFLES");
				}
				else if(choose.equals("6") || choose.equals("pan cakes"))
				{
					System.out.println("----PAN CAKES");
				}
				else if(choose.equals("7") || choose.equals("mac & chesse"))
				{
					System.out.println("----MAC & CHEESE");
				}
				else if(choose.equals("8") || choose.equals("hot dogs"))
				{
					System.out.println("----HOT DOGS");
				}
				else if(choose.equals("9") || choose.equals("cheese cakes"))	
				{
					System.out.println("----CHEESE CAKE");
				}
				else
				{
					System.out.println("THERE IS NO SUCH TYPE OF DISHESH HERE SORRY");
				}
			}
			else
			{
				System.out.println("SORRY WE DON'T HAVE THIS TYPE OF DISH AVAILABLE WITH US ");
			}
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Enter 0 to Order again");
				z = ar.nextInt();
				System.out.println("Enter 1 to Procced to Checkout ");
		}while(z==0);
	}
	public void unicorn1()
	{
		System.out.println("------------------------DESERT AND COLD DRINKS SECTION----------------------------");
	}
	public void unicorn2()
	{
		System.out.println("------------------------BAR SECTION----------------------------");

	}
}
class Unicornrestaurant
{
	public static void main(String args[])
	{
		String shalini;
		Scanner arnold = new Scanner(System.in);
		unicorn ur = new unicorn();
		System.out.println("ENTER THE DESERT OR COUNTRY CUISINE =  ");
		shalini = arnold.nextLine();
		if(shalini.equals("country cuisine") || shalini.equals("COUNTRY CUISINE") || shalini.equals("1"))
		{
			ur.unicorn();
		}
		else if(shalini.equals("desert") || shalini.equals("DESERT"))
		{
			ur.unicorn1();
		}
		else
		{
			ur.unicorn2();
		}
		unicorn date = new unicorn();
		System.out.println(date);
	}
}