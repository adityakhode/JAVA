package matrixaddition;

import java.util.Scanner;

public class main 
	{
    	public static void main(String[] args) 
    		{
    			Scanner scanner = new Scanner(System.in);

    			System.out.print("Enter the number of rows for the first matrix: ");
    			int rows1 = scanner.nextInt();
    			System.out.print("Enter the number of columns for the first matrix: ");
    			int cols1 = scanner.nextInt();

    			System.out.print("Enter the number of rows for the second matrix: ");
    			int rows2 = scanner.nextInt();
    			System.out.print("Enter the number of columns for the second matrix: ");
    			int cols2 = scanner.nextInt();

    			if (rows1 != rows2 || cols1 != cols2) 
    				{
    					System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
    					scanner.close();
    					return;
    				}


    			int[][] matrix1 = new int[rows1][cols1];
    			int[][] matrix2 = new int[rows2][cols2];
    			int[][] resultMatrix = new int[rows1][cols1];

    			System.out.println("Enter elements for the first matrix:");
    			for (int i = 0; i < rows1; i++) 
    				{
    	            	for (int j = 0; j < cols1; j++) 
    	            		{
    	            			matrix1[i][j] = scanner.nextInt();
    	            		}
    				}

    			System.out.println("Enter elements for the second matrix:");
    			for (int i = 0; i < rows2; i++) 
    				{
    					for (int j = 0; j < cols2; j++) 
    						{
    							matrix2[i][j] = scanner.nextInt();
    						}
    				}

    			for (int i = 0; i < rows1; i++) 
    				{
    	            	for (int j = 0; j < cols1; j++) 
    	            		{
    	            			resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
    	            		}
    				}

    			System.out.println("Resultant Matrix (Sum of Matrices):");
    			for (int i = 0; i < rows1; i++) 
    				{
    	            	for (int j = 0; j < cols1; j++) 
    	            		{
    	            			System.out.print(resultMatrix[i][j] + "\t");
    	            		}
    	            	System.out.println();
    				}

    			scanner.close();
    		}


	}
