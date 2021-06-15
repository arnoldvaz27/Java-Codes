import java.util.Scanner;

class hotel
{
	public hotel()
	{
		System.out.println("----------ARNOLD VAZ WELCOME'S YOU TO OUR UNICORN RESTAURANT-----------");
		System.out.println(" ******ADDRESS ---- 304 STREET , WASHINGTON DC , UNITED STATES*********");
		System.out.println("PHONE NUMBER :- 8329081600/ 01/ 02 /03");
		System.out.println("***********************************************************************");
		System.out.println("-------------------------------UNICORN RESTAURANT-----------------------------------------------");
		System.out.println("***********************************************************************");
	}
	public void hotel()
	{
		int type,type1;
		int choice;
		String choose;
		Scanner scr=new Scanner(System.in);
		Scanner scr1 = new Scanner(System.in);
		System.out.println("VARIETIES OF DISHES WE PROVIDE IN OUR UNICORN RESTAURANT ARE :-");
		do
		{
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
			choice=scr.nextInt();
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("caprese salad"))
				{
					System.out.println("  CAPRESE SALAD");
						System.out.println("*************************************");
						System.out.println("1. EXTRA TOMATO");
						System.out.println("2. EXTRA MOZZARELLA CHEESE");
						System.out.println("3. PESTO SAUCE");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH:  ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA TOMATO");
						break;
						case 2: System.out.println(" EXTRA MOZZARELLA CHEESE");
						break;
						case 3: System.out.println(" PESTO SAUCE");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("panazella"))
				{
					System.out.println("----PANAZELLA");
						System.out.println("*************************************");
						System.out.println("1. EXTRA VEGGIES");
						System.out.println("2. EXTRA HERBS");
						System.out.println("3. EXTRA BREAD");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA VEGGIES");
						break;
						case 2: System.out.println(" EXTRA HERBS");
						break;
						case 3: System.out.println(" EXTRA BREAD");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("brushchetta"))
				{
					System.out.println("----BRUSHCHETTA");
						System.out.println("*************************************");
						System.out.println("1. EXTRA VEGGIES");
						System.out.println("2. EXTRA MUSHROOM GARLIC");
						System.out.println("3. EXTRA TOMATO-BASIL");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA VEGGIES");
						break;
						case 2: System.out.println(" EXTRA MUSHROOM GARLIC");
						break;
						case 3: System.out.println(" EXTRA TOMATO-BASIL");
						break;	
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("focaccia bread"))
				{
					System.out.println("----FOCACCIA BREAD");
						System.out.println("*************************************");
						System.out.println("1. EXTRA CARAMELIZED OLIVES");
						System.out.println("2. EXTRA GRATED PARMESAN CHESSE");
						System.out.println("3. EXTRA BASIL LEAVES");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA CARAMELIZED OLIVES");
						break;
						case 2: System.out.println(" EXTRA GRATED PARMESAN CHESSE");
						break;
						case 3: System.out.println(" EXTRA BASIL LEAVES");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("pasta"))
				{
					System.out.println("----PASTA");
						System.out.println("*************************************");
						System.out.println("1. EXTRA PIG'S CHEEK");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA PIG'S CHEEK");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("pizza"))
				{
					System.out.println("----PIZZA");
						System.out.println("*************************************");
						System.out.println("1. EXTRA MOZZARELLA CHESSE");
						System.out.println("2. EXTRA TOMATO AND BASIL");
						System.out.println("3. EXTRA SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA MOZZARELLA CHESSE");
						break;
						case 2: System.out.println(" EXTRA TOMATO AND BASIL");
						break;
						case 3: System.out.println(" EXTRA SPICY");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("risotto"))
				{
					System.out.println("----RISOTTO");
						System.out.println("*************************************");
						System.out.println("1. EXTRA MUSHROOM");
					System.out.println("2. EXTRA BUTTER");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA MUSHROOM");
						break;
						case 2: System.out.println(" EXTRA BUTTER");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("lasagna"))
				{
					System.out.println("----LASAGNA");
						System.out.println("*************************************");
						System.out.println("1. EXTRA LAMB");
						System.out.println("2. EXTRA VEGGIES");
						System.out.println("3. VERY CHESSE");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" EXTRA LAMB");
						break;
						case 2: System.out.println("EXTRA VEGGIES");
						break;
						case 3: System.out.println(" VERY CHESSE");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("tiramisu")) 
				{
					System.out.println("----TIRAMISU");
						System.out.println("*************************************");
						System.out.println("1. EXTRA CREAM");
						System.out.println("2. EXTRA LAYER");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
					case 1: System.out.println(" EXTRA CREAM");
					break;
					case 2: System.out.println(" EXTRA LAYER");
					break;
					default : System.out.println(" INVALID");
					break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("nachos"))
				{
					System.out.println("----NACHOS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("tacos paster"))
				{
					System.out.println("----TACOS PASTER");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");	
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("chiles nogada"))
				{
					System.out.println("----CHILES NOGADA");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("tostados"))
				{
					System.out.println("----TOSTADOS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("elote"))
				{
					System.out.println("----ELOTE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("mole"))
				{
					System.out.println("----MOLE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("tamales"))
				{
					System.out.println("----TAMALES");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("enchiladas"))
				{
					System.out.println("----ENCHILADAS");	
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("pozole"))
				{
					System.out.println("----POZOLE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("chinese noodles"))
				{
					System.out.println("----CHINESE NOODLES");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("chinese bhel"))
				{
					System.out.println("----CHINESE BHEL");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("momos"))
				{
					System.out.println("----MOMOS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("spring rolls"))
				{
					System.out.println("----SPRING ROLLS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("fried shrimps"))
				{
					System.out.println("----FRIED SHRIMPS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("jelly fish"))
				{
					System.out.println("----JELLY FISH");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)	
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("egg fried rice"))
				{
					System.out.println("----EGG FRIED RICE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("roasted ducks"))
				{
					System.out.println("----ROASTED DUCKS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("dumplings"))
				{
					System.out.println("----DUMPLINGS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("pav bhaji"))
				{
					System.out.println("----PAV BHAJI");
						System.out.println("*************************************");
						System.out.println("1. EXTRA BUTTER");
						System.out.println("2. EXTRA PAV");
						System.out.println("3. EXTRA SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();	
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("misal pav"))
				{
					System.out.println("----MISAL PAV");
						System.out.println("*************************************");
						System.out.println("1. EXTRA SPICY");
						System.out.println("2. EXTRA VEGETABLES");
						System.out.println("3. EXTRA BUTTER");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("dosa"))
				{
					System.out.println("----DOSA");
						System.out.println("*************************************");
						System.out.println("1. LARGE DOSA");
						System.out.println("2. EXTRA ONION AND TOMATOES");
						System.out.println("3. SCHZEWAN CHUTNEY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("dal rice"))
				{
					System.out.println("----DAL RICE");
						System.out.println("*************************************");
						System.out.println("1. SPICY DAL");
						System.out.println("2. BUTTER ");
						System.out.println("3. EXTRA RICE ");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("aloo paratha"))
				{
					System.out.println("----ALOO PARATHA");
						System.out.println("*************************************");
						System.out.println("1. SCHZEWAN CHUTNEY");
						System.out.println("2. BUTTER");
						System.out.println("3. EXTRA ALOO");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("fish curry"))
				{
					System.out.println("----FISH CURRY");
						System.out.println("*************************************");
						System.out.println("1. EXTRA FISH");
						System.out.println("2. EXTRA CURRY");
						System.out.println("3. EXTRA SPICY ");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("palak panner"))
				{
					System.out.println("----PALAK PANNER");
						System.out.println("*************************************");
						System.out.println("1. EXTRA PANNER");
						System.out.println("2. EXTRA PALAK");
						System.out.println("3. EXTRA SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;	
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("masala dosa"))
				{
					System.out.println("----MASALA DOSA");
						System.out.println("*************************************");
						System.out.println("1. ONION AND TOMATOES");
						System.out.println("2. BUTTER");
						System.out.println("3. VERY SPICY");
						System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("panner chilli"))	
				{
					System.out.println("----PANNER CHILLI");
						System.out.println("*************************************");
						System.out.println("1. EXTRA PANNER");
						System.out.println("2. SCHZEWAN CHUTNEY");
						System.out.println("3. EXTRA SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");	
						break;
					}	
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
				System.out.println("    5.  SAUERBRATEN - RS.250/-");
				System.out.println("    6. KLOSSE - RS.250/-");
				System.out.println("    7. BREZEL - RS.250/-");
				System.out.println("    8. APPLE STRUDEL - RS.250/-");
				System.out.println("    9. WURST - RS.250/-");	
				System.out.print("ENTER YOUR CHOICE FOR DISHES :");
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("rouladen"))
				{
					System.out.println("----ROULADEN ");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");	
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("kasespatzle"))
				{	
					System.out.println("----KASESPATZLE");
						System.out.println("*************************************");	
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("rote grutze"))
				{
					System.out.println("----ROTE GRUTZE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("elintopf"))
				{
					System.out.println("----ELINTOPF");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("sauerbraten"))
				{
					System.out.println("----SAUERBRATEN");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("klosse"))
				{
					System.out.println("----KLOSSE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("brezel"))
				{
					System.out.println("----BREZEL");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("apple strudel"))
				{
					System.out.println("----APPLE STRUDEL");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("wurst"))
				{
					System.out.println("----WURST");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("wiener schnitzel"))
				{
					System.out.println("----WIENER SCHNITZEL");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
							case 1: System.out.println(" Extra veggies");
							break;
							case 2: System.out.println(" extra salt");
							break;
							case 3: System.out.println(" extra spice");
							break;
							default : System.out.println(" INVALID");
							break;
					}		
				}
				else if(choose.equals("2") || choose.equals("black forest cake"))
				{
					System.out.println("----BLACK FOREST CAKE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("chanakhi"))
				{
					System.out.println("----CHANAKHI");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("chicken kiev"))
				{
					System.out.println("----CHICKEN KIEV");
						System.out.println("*************************************");
						System.out.println("1. SPICY");	
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("sunday roast"))
				{
					System.out.println("----SUNDAY ROAST");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;	
						case 2: System.out.println(" extra salt");	
						break;	
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("open sandwich"))
				{
					System.out.println("----OPEN SANDWICH");	
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");	
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("carbonara"))
				{
					System.out.println("----CARBONARA");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("duck food"))
				{
					System.out.println("----DUCK FOOD");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");	
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("quiche"))
				{
					System.out.println("----QUICHE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");	
						break;	
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("banana leaf"))
				{
					System.out.println("----BANANA LEAF");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED	 WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1	)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}	
				}
				else if(choose.equals("2") || choose.equals("nasi dangang"))	
				{	
					System.out.println("----NASI DANGANG");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;	
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("bakuteh"))
				{
					System.out.println("----BAKUTEH");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();	
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("hokkein mee"))	
				{
					System.out.println("----HOKKIEN MEE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("sang har noodles"))
				{
					System.out.println("----SANG HAR NOODLES");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("satay"))
				{
					System.out.println("----SATAY");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)	
					{	
						case 1: System.out.println(" Extra veggies");	
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("nasi kandar"))
				{
					System.out.println("----NASI KANDAR");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}	
				else if(choose.equals("8") || choose.equals("charsiev rice"))
				{
					System.out.println("----CHARSIEV RICE");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{	
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("nasi lemak"))
				{
					System.out.println("----NASI LEMAK");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("chicken parmigiana"))
				{
					System.out.println("----CHICKEN PARMIGIANA");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
					System.out.println("*************************************");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ")	;
					type1=scr.nextInt()	;
					switch(type1)
					{	
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;	
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("barbequed snags"))
				{
					System.out.println("----BARBEQUED SNAGS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("lamingtons"))
				{
					System.out.println("----LAMINGTONS");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("burger"))
				{
					System.out.println("----BURGER");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");	
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();	
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}	
				else if(choose.equals("5") || choose.equals("pavlova"))
				{
					System.out.println("----PAVLOVA");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");	
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("meat pies"))
				{
					System.out.println("----MEAT PIES");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("barramundi"))
				{
					System.out.println("----BARRAMUNDI");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("vegemite on toast"))
				{
					System.out.println("----VEGEMITE ON TOAST");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");	
						break;
						case 2: System.out.println(" extra salt");	
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("pumpkin soup"))
				{
					System.out.println("----PUMPKIN SOUP");
						System.out.println("*************************************");
						System.out.println("1. SPICY");
						System.out.println("2. MEDIUM");
						System.out.println("3. VERY SPICY");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr	.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
				choose=scr1.nextLine();
				if(choose.equals("1") || choose.equals("sausags"))
				{
					System.out.println("----SAUSAGS");
					System.out.println("*************************************");
					System.out.println("1. SPICY");
					System.out.println("2. FRIED");
					System.out.println("3. GRILLED");
					System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("2") || choose.equals("chocolate chip cookies"))
				{
					System.out.println("----CHOCOLATE CHIP COOKIES");
						System.out.println("*************************************");
						System.out.println("1. EXTRA SUGAR");
						System.out.println("2. EXTRA CHOCO");
						System.out.println("3. EXTRA BISCUIT");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("3") || choose.equals("s'mores"))
				{
					System.out.println("----S'MORES");
						System.out.println("*************************************");
						System.out.println("1. EXTRA CRISPY");
						System.out.println("2. CHOCOLATE");
						System.out.println("3. CREAM");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("4") || choose.equals("cronut"))
				{
					System.out.println("----CRONUT");
						System.out.println("*************************************");
						System.out.println("1. EXTRA SUGAR");
						System.out.println("2. EXTRA CREAM");
						System.out.println("3. CHOCOLATE");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("5") || choose.equals("chicken & waffles"))
				{
						System.out.println("----CHICKEN & WAFFLES");
						System.out.println("*************************************");
						System.out.println("1. SPICY WINGS");
						System.out.println("2. SCHEZWAN CHUTNEY");
						System.out.println("3. SUGAR");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("6") || choose.equals("pan cakes"))
				{
					System.out.println("----PAN CAKES");
						System.out.println("*************************************");
						System.out.println("1. EXTRA BAKED");
						System.out.println("2. BUTTER");
						System.out.println("3. CARAMEL");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("7") || choose.equals("mac & chesse"))
				{
					System.out.println("----MAC & CHEESE");
						System.out.println("*************************************");
						System.out.println("1. EXRA CHESSE");
						System.out.println("2. SAUCE'S");
						System.out.println("3. CREAM");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("8") || choose.equals("hot dogs"))
				{
					System.out.println("----HOT DOGS");
						System.out.println("*************************************");
						System.out.println("1. EXTRA SAUCE'S");
						System.out.println("2. EXTRA VEGGIES");
						System.out.println("3. EXTRA MAYO");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
				}
				else if(choose.equals("9") || choose.equals("cheese cakes"))	
				{
					System.out.println("----CHEESE CAKE");
						System.out.println("*************************************");
						System.out.println("1. EXTRA SUGAR");
						System.out.println("2. EXTRA CHOCOLATE");
						System.out.println("3. EXTRA CHEESE");
						System.out.println("*************************************");
					System.out.print("ENTER THE EXTRA ITEM YOU REQUIRED WITH THE DISH: ");
					type1=scr.nextInt();
					switch(type1)
					{
						case 1: System.out.println(" Extra veggies");
						break;
						case 2: System.out.println(" extra salt");
						break;
						case 3: System.out.println(" extra spice");
						break;
						default : System.out.println(" INVALID");
						break;
					}
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
		}while(true);
	}
	public void hotel1()
	{
		
	}
}
class Unicornhotel
{
	public static void main(String args[])
	{
		
		hotel ur = new hotel();
		ur.hotel();
		ur.hotel1();
	}
}