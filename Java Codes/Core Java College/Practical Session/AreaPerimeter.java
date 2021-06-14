import java.util.*;

class AreaPerimeter {
	public static void main(String[] args) {
	double radius,area,perimeter;

	Scanner src = new Scanner(System.in);
	System.out.println("Enter radius of circle: ");
	radius = src.nextDouble();
	area = Math.PI * radius * radius;
	perimeter = 2 * Math.PI * radius;

	System.out.println("Area of circle is: "+area);
	System.out.println("Perimeter of circle is: "+perimeter);
	}
}