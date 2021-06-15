Class Operatordemo
{
   public static void main(String args[])
      {

       long salesamt;
       int comm;

       Scanner scr=newscanner(System.in)
       salesamt=scr.nextLong();

             if(salesamt>=50000 && salesamt<=100000)
                    {
                     comm=(int)salesamt*2/100;
                     System.out.println("Comm is "+amt);
                    }   

             else if(salesamt>100000 && salesamt<=150000)
                    {
                     comm=(int)salesamt*3/100;
                     System.out.println("Comm is "+amt);
                    }
             else if(salesamt>150000 && salesamt<=200000);
                    {
                    comm=(int)salesamt*4/100;
                    System.out.println("Comm is "+amt);
                    }
             else
                    {
                    System.out.println("INVALID SALESAMT");
                    }
        }
}