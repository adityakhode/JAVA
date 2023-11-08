public class  bonus_calculator
	{
		private double result;
		//constructor overloading
		public bonus_calculator() 
			{
			} 
		public bonus_calculator(double performanceScore) 
			{
				result = performanceScore * 1000;
			}
		public bonus_calculator(double performanceScore, int yearsOfExperience) 
			{
				result = ((performanceScore * 1000) + (yearsOfExperience * 500));
			}
		public bonus_calculator(double performanceScore, int yearsOfExperience, String department) 
			{
				if(department.equals("Software"))
					result = ((performanceScore * 1000) + (yearsOfExperience * 500)+ 1000);
				else
					result =  ((performanceScore * 1000) + (yearsOfExperience * 500));
			}
		
		//method overloading
    	public double calculateBonus(double performanceScore) 
    		{
    			return performanceScore * 1000;
    		}
    	public double calculateBonus(double performanceScore, int yearsOfExperience) 
    		{
    			return ((performanceScore * 1000) + (yearsOfExperience * 500));
    		}
    	public double calculateBonus(double performanceScore, int yearsOfExperience, String department) 
    		{
    			if(department.equals("Software"))
    				return ((performanceScore * 1000) + (yearsOfExperience * 500)+ 1000);
    			else
    				return ((performanceScore * 1000) + (yearsOfExperience * 500));
    		}

    	//main function
    	public static void main(String[] args) 
    		{
    			//objects for method overloading
				bonus_calculator emp1 = new bonus_calculator();
				bonus_calculator emp2 = new bonus_calculator();
				bonus_calculator emp3 = new bonus_calculator();
				//objects for constructor overloading
				bonus_calculator emp4 = new bonus_calculator(0.8);
				bonus_calculator emp5 = new bonus_calculator(0.9, 5);
				bonus_calculator emp6 = new bonus_calculator(0.85, 3, "Sales");
				bonus_calculator emp7 = new bonus_calculator(0.85, 3, "Software");
				//initilising the value for method overloading
				double bonus1 = emp1.calculateBonus(0.8);
				double bonus2 = emp2.calculateBonus(0.9, 5);
				double bonus3 = emp3.calculateBonus(0.85, 3, "Sales");
				double bonus4 = emp3.calculateBonus(0.85, 3, "Software");
				//initilising the value for constructor overloading
				double bonus5 = emp4.result;
				double bonus6 = emp5.result;
				double bonus7 = emp6.result;
				double bonus8 = emp7.result;
				//displaying
				System.out.println("Bonus calculated by method overloading\n");
				System.out.println("Bonus for employee 1: $" + bonus1);
				System.out.println("Bonus for employee 2: $" + bonus2);
				System.out.println("Bonus for employee 3: $" + bonus3);
				System.out.println("Bonus for employee 3 software: $" + bonus4);
				System.out.println("\nBonus calculated by Constructor overloading\n");
				System.out.println("Bonus for employee 4: $" + bonus5);
				System.out.println("Bonus for employee 5: $" + bonus6);
				System.out.println("Bonus for employee 6: $" + bonus7); 
				System.out.println("Bonus for employee 7 software: $" + bonus8);      
    		}
	}
