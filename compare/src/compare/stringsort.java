package compare;
import java.util.Scanner;

public class stringsort 
	{
    	public static void main(String[] args) 
    		{
    			Scanner sc = new Scanner(System.in);
    			int quantity;
    			String arr[];

    			System.out.print("Enter how many strings you are going to insert: ");
    			quantity = sc.nextInt();
    			arr = new String[quantity];
    			sc.nextLine(); // Consume the newline character after reading the integer

    			System.out.println("Enter values for sorting:");
    			for (int i = 0; i < quantity; i++)
    				{
    					arr[i] = sc.nextLine();
    				}

        // Bubble sort for sorting the array of strings
    			for (int i = 0; i < quantity - 1; i++) 
    				{
    					for (int j = 0; j < quantity - i - 1; j++) 
    						{
    							if (arr[j].compareTo(arr[j + 1]) > 0) 
    								{
    									String temp = arr[j];
    									arr[j] = arr[j + 1];
    									arr[j + 1] = temp;
    								}
    						}
    				}

    			System.out.print("Sorted strings are: ");
    			for (int i = 0; i < quantity; i++) 
    				{
    					System.out.print(arr[i]);
    					if (i < quantity - 1) 
    						{
    							System.out.print(" , ");
    						}
    				}

    			sc.close(); // Close the scanner
    		}
	}
