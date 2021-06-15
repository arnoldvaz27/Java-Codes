import java.util.Scanner;

public class LogicalOperator
{
   public static void main(String args[])
      {

       long salesamt;
       int comm;

       Scanner scr = new Scanner(System.in);
       salesamt = scr.nextLong();

             if(salesamt>=50000 && salesamt<=100000)
                    {
                     comm=(int)salesamt*2/100;
                     System.out.println("Comm is "+comm);
                    }   


             else
                    {
                    System.out.println("INVALID SALESAMT");
                    }
        }
}