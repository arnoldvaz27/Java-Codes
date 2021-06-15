import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.*;
import java.text.DateFormat;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		String a,b,c,d,e;
		Scanner src = new Scanner(System.in);
		String n;
		Scanner src1 = new Scanner(System.in);
		CopyOnWriteArraySet<String> obj = new CopyOnWriteArraySet<String>(); //CopyOnWriteArrayList
		System.out.println("Enter the 4 numbers:  ");
		a = src.nextLine();
		b = src.nextLine();		
		c = src.nextLine();
		d = src.nextLine();
		String obj1 = new String ( ""+a);
		String obj2 = new String ( ""+b);
		String obj3 = new String ( ""+c);
		String obj4 = new String ( ""+d);
		String obj5 = new String ( "10");
		
		System.out.println("Size of TreeSet is:  "+ obj.size());

		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);

		System.out.println("\n TreeSet after adding the objects:  "+ obj);
		System.out.println("Size of TreeSet after adding objects:  "+ obj.size());
		
		System.out.println("Enter the obj you want to remove:  ");
		n = src1.nextLine();
		if (n.equals(a))
		{
			obj.remove(obj1);
		}
		if (n.equals(b))
		{
			obj.remove(obj2);
		}
		if (n.equals(c))
		{
			obj.remove(obj3);
		}
		if(n.equals(d))
		{
			obj.remove(obj4);
		}
		if(n.equals(a) || n.equals(b) || n.equals(c) || n.equals(d))
		{
			System.out.println("Entered object doesn't exist");
		}
		
		System.out.println("\nTree set After removing The object: "+ obj);
		System.out.println("\nSize of Tree set After removing The object: "+ obj.size());
		
		System.out.println("\nThe Final Treeset:  ");
		
		obj.add(obj5);
		Iterator i = obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			//obj.add(obj5);
		}
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de","DE"));
		String date = df.format(new Date());
		System.out.println("Today date: "+date+".");
	}
}