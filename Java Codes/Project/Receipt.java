import java.util.Scanner;

public class Receipt
{
public static void main(String[]args)
 {
    String r,w,s,d,m;
    r="Rice";
    w="Wheat";
    s="Sugar";
    d="Dal";
    m="Milk";
    int rc,wc,sc,dc,mc;
    rc=45;
    wc=40;
    sc=38;
    dc=75;
    mc=58;
    int isrc = 0;
    int iswc = 0;
    int issc = 0;
    int isdc = 0;
    int ismc = 0;
    System.out.println("1. "+r+" \t=\t"+rc);
    System.out.println("2. "+w+" \t=\t"+wc);
    System.out.println("3. "+s+" \t=\t"+sc);
    System.out.println("4. "+d+" \t\t=\t"+dc);
    System.out.println("5. "+m+" \t=\t"+mc);

    Scanner scr=new Scanner(System.in);
    int nr=0,nw=0,ns=0,nd=0,nm=0; //quantity
	int rt1=0,wt1=0,st1=0,dt1=0,mt1=0;
    int rt=0,wt=0,st=0,dt=0,mt=0; // repeat cost
    int no=0;
	int nr1=0,nw1=0,ns1=0,nd1=0,nm1=0; // repeat quantity
	int k = 0;
    System.out.print("Enter the no of products needed: ");
    no=scr.nextInt();
    int i=1;
    int totalcost=0;
    while(i<=no)
     {
        System.out.print(i+". Select a product no: ");
        int select=scr.nextInt();
        if(select==1)   
          {
             isrc = 1;
            System.out.print("Enter quantity for Rice: ");
            nr=scr.nextInt();
            nr1+=nr;
            rt=nr1*rc;
	rt1+=rt;
            totalcost+=rt;
          }
        else if(select==2)
          {
	iswc = 1;
             System.out.print("Enter quantity for Wheat: ");
             nw=scr.nextInt();
             nw1+=nw;
             wt=nw1*wc;
	wt1+=wt;
             totalcost+=wt1;
          }
       else if(select==3)
          {
	issc = 1;
             System.out.print("Enter quantity for Sugar: ");
             ns=scr.nextInt();
             ns1+=ns;
             st=ns1*sc;
	st1+=st;
             totalcost+=st1;
          }
       else if(select==4)
          { 
	isdc = 1;
             System.out.print("Enter quantity for Dal: ");
             nd=scr.nextInt();
             nd1+=nd;
             dt=nd1*dc;
	dt1+=dt;
             totalcost+=dt1;
          }
       else if(select==5)
          {
	ismc = 1;
             System.out.print("Enter quantity for Milk: ");
             nm=scr.nextInt();
             nm1+=nm;
             mt=nm1*mc;
	mt1+=mt;
             totalcost+=mt1;
          }
       else
          {
             System.out.print("Invalid input");
          }
	System.out.println("-----------------------------------------");
       i++;
   } // end of while
   //   System.out.println("Total cost of products: "+totalcost);
	System.out.println("Sr.No.\tProduct\t  Rate\tQuantity\tCost");
	System.out.println("````````````````````````````````````````````````````````````");
	k = no;
	i = 1;
	while(i<=k)
		{
			if(isrc == 1)
			{
				isrc = 0;	
				System.out.println(i+"\t  Rice\t  "+rc+"\t   "+nr1+"\t\t"+rt1);
			}
			else if(iswc ==1)
			{
				iswc = 0;
				System.out.println(i+"\t  Wheat\t  "+wc+"\t   "+nw1+"\t\t"+wt1);
			}
			else if(issc ==1)
			{
				issc = 0;
				System.out.println(i+"\t  Sugar\t  "+sc+"\t   "+ns1+"\t\t"+st1);
			}
			else if(isdc ==1)
			{
				isdc = 0;
				System.out.println(i+"\t  Dal\t  "+dc+"\t   "+nd1+"\t\t"+dt1);
			}
			else if(ismc ==1)
			{
				ismc = 0;
				System.out.println(i+"\t  Milk\t  "+mc+"\t   "+nm1+"\t\t"+mt1);
			}
			else 
			{ }
			i++;
		}
 }
}

