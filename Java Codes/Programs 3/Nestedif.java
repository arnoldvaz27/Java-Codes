import java.util.Scanner;

class Nestedif
{
	public static void main (String args[])
	{
		String country,state,district,city,suburb;
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER country=");
		country=scr.nextLine();
			if(country.equals("INDIA") || country.equals("india"))
			{
				System.out.println("Enter state=");
				state=scr.nextLine();
				if(state.equals("MAHARASHTRA") || state.equals("maharashtra"))
				{
					System.out.println("Enter district=");
					district=scr.nextLine();
					if(city.equals("PALGHAR") || city.equals("palghar"))
						{
							System.out.println("Enter city=");
							city=scr.nextLine();
							if(suburb.equals("MUMBAI") || suburb.equals("mumbai"))
								{
									System.out.println("Enter suburb=");
									suburb=scr.nextLine();
									if(suburb.equals("VASAI") || suburb.equals("vasai"))
										{
											System.out.println("WELCOME TO NIIT");
										}
									else
										{
											System.out.println("YOU AR NOT IN VASAI");
										}
								}
							else
								{
									System.out.println("YOU ARE NOT IN MUMBAI");		
						}
					else
						{
							System.out.println("YOU ARE NOT IN PALGHAR");
						}
				}
				else
				{
					System.out.println("YOU ARE NOT IN MAHARAHSTRA");
				}
			}
			else
			{
				System.out.println("YOU ARE NOT IN INDIA");
			}
	}
}
