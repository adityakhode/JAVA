/**
 * 
 */
package rectangle;
import java.util.Scanner;

/**
 * @author Aditya
 *
 */
public class rect
{
	// The data field required for rectangle
	double len ;
	double width;
	double area;
	String colour;
	
	// Creating an instance for input
	Scanner sc = new Scanner(System.in);
	
	// constructor
	rect()
	{
		System.out.println("New rectangle created assign it paramaters");
	}
	
	// Method to get length
	void get_length()
	{
		System.out.print("Enter length : ");
		len = sc.nextDouble();
		System.out.println();
	}
	
	// Method to get Width
	void get_width()
	{
		System.out.print("Enter width : ");
		width = sc.nextDouble();
		System.out.println();
	}
	
	// Method to initilise color
	void get_color()
	{
		sc.nextLine();
		System.out.print("Enter Colour : ");
		colour = sc.nextLine();
		System.out.println();
	}
	
	// Find area
	void find_area()
	{
		area = len*width;
	}
}
