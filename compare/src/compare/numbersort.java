package compare;

import java.util.Scanner;

public class numbersort 
	{
		public static void main(String []args)
		{	
			Scanner sc = new Scanner(System.in);	
			int i,j;
			int quantity;
			float temp;
			float arr[];
			System.out.print("Enter how many numbers you are going to insert ");
			quantity = sc.nextInt();
			arr = new float[quantity];
			System.out.print("Enter values for sorting : ");
			for ( i = 0; i<quantity; i++)
				{
					arr[i] = sc.nextFloat();
				}
			System.out.print("Sorted array is : ");
			
			for ( i = 0; i<quantity-1; i++)
				{
					for ( j = i+1; j<quantity; j++)
						{
							if(arr[i]<arr[j])
								{
									//do nothing
								}
							else
								{
									temp = arr[i];
									arr[i] = arr[j];
									arr[j] = temp;
								}
						}
				}
			for ( i = 0; i<quantity; i++)
			{
				System.out.print(arr[i]);
				System.out.print(" , ");
			}
			
			
			
		}
		

	}
