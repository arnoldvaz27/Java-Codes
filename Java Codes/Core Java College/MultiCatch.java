public class MultiCatch 
{
   public static void main(String args[])
   {
       int a[]={10,20,30,40,50,60,70};
       int b[]={2,0,5,4,0};
       for(int i=0;i<a.length; i++)
       {
           try
           {
               System.out.println(a[i]+ "/"+b[i]+"="+(a[i]/b[i]));
           }
           catch(ArithmeticException e)
           {
               System.out.println(a[i]+"/"+b[i]+" = Divison by zero, not possible");
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println(a[i]+"/"+" =Division element not found");
           }
       }
   }
}
