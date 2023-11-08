import java.util.Scanner;
public class main {
	
	int factorial(int x) {
		int y = 1;
		while(x!= 1) {
			y = y*x;
			x--;
		}
		return y;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to get its factorial: ");
		int fact = sc.nextInt();
		main obj = new main();
		System.out.println("Factorial is :"+obj.factorial(fact));
		
	}

}
