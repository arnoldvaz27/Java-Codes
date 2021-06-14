import java.io.*;
import java.util.*;

public class CreateFile {
	public static void main(String[] args) throws IOException
	{
	    String name; String id;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter id:");
	    id=sc.nextLine();
	    System.out.print("Enter name:");
	    name=sc.nextLine();
	    FileWriter fwrite=new FileWriter("readfile1.txt");
	    fwrite.write("Id:"+id+"\t\tName:"+name);
	    fwrite.close();
	}
}
