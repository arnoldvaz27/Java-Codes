import java.util.Scanner;

class VarDemo1
{
	public static void main(String args[])
	{
	String country,state,district,suburb,taluka,city,place;
	Scanner scr = new Scanner(System.in);
	System.out.println("ENTER THE NAME OF THE COUNTRY : ");
	country = scr.nextLine();
		if (country.equals("INDIA") || country.equals("india"))
		{
			System.out.println("ENTER THE NAME OF THE STATE : ");
			state = scr.nextLine();
			if(state.equals("MAHARASHTRA") || state.equals("maharashtra"))
				{
					System.out.println("ENTER THE NAME OF THE DISTRICT : ");
					district = scr.nextLine();
					if(district.equals("PALGHAR") || district.equals("palghar"))	
						{
							System.out.println("ENTER THE NAME OF THE SUBURB : ");
							suburb = scr.nextLine();
							if(suburb.equals("MUMBAI") || suburb.equals("mumbai"))
								{
									System.out.println("ENTER THE NAME OF THE TALUKA : ");
									taluka = scr.nextLine();
									if(taluka.equals("VASAI") || taluka.equals("vasai") || taluka.equals("arnold"))
										{
											System.out.println("ENTER THE NAME OF THE CITY : ");
											city = scr.nextLine();
											if(city.equals("VASAI") || city.equals("vasai"))
												{
													System.out.println("ENTER THE NAME OF THE PLACE : ");
													place = scr.nextLine();
													if(place.equals("vasai east") || place.equals("vasai east"))
														{
															System.out.println("YOU ARE AT ARNOLD'S RESIDENCE");
														}
													else
														{
															System.out.println("YOU ARE IN VASAI WEST");
														}
												}
											else
												{
													System.out.println("YOU ARE NOT IN VASAI CITY");
												}
										}
									else
										{
											System.out.println("YOU ARE NOT IN VASAI TALUKA ");
										}
								}
							else
								{
									System.out.println("YOU ARE NOT IN MUMBAI SUBURB ");
								}
						}
					else
						{
							System.out.println("YOU ARE NOT IN PALGHAR DISTRICT ");
						}
				}
			else
				{
					System.out.println("YOU ARE NOT IN MAHARASHTRA STATE ");
				}
		}
	else
		{
			System.out.println("YOU ARE NOT IN INDIAN CONTINENT ");
		}
	}
}

	