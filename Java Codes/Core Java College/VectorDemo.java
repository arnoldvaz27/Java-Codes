import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector v1 = new Vector(3);
		int i;
		System.out.println("\nInitial Size of vector is: "+v1.size());
		System.out.println("Initial Capacity of vector is: "+v1.capacity());
		System.out.println("Initial, is vector empty? : "+v1.isEmpty());
		Integer i1 = new Integer(55);		
		v1.addElement(new Integer(15));
		v1.addElement(new Float(23.55f));
		v1.addElement(new Long(1234567));
		v1.addElement("Ravi");
		v1.addElement(i1);
		System.out.println("\nAfter adding elements Size of vector is: "+v1.size());
		System.out.println("After adding elements Capacity of vector is: "+v1.capacity());
		System.out.println("After adding elements is vector empty?: "+v1.size());
		System.out.println("Is vector contains i1?:  "+v1.contains(i1));
		System.out.println("\nVector Elements are\n");
		for(i = 0; i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}
		v1.removeElement(i1);
		System.out.println("\nAfter removing one elements Size of vector is: "+v1.size());
		System.out.println("After removing one elements Capacity of vector is: "+v1.capacity());
		System.out.println("After removing one elements ,is vector empty?: "+v1.isEmpty());
		System.out.println("Is vector contains i1?: "+v1.size());
		v1.removeElementAt(2);
		System.out.println("\nAfter removing one elements Size of vector is: "+v1.size());
		System.out.println("After removing one elements Capacity of vector is: "+v1.capacity());
		System.out.println("After removing one elements ,is vector empty?: "+v1.isEmpty());
		v1.removeAllElements();
		System.out.println("\nAfter removing all elements Size of vector is: "+v1.size());
		System.out.println("After removing all elements Capacity of vector is: "+v1.capacity());
		System.out.println("After removing all elements ,is vector empty?: "+v1.isEmpty());		

	}
}