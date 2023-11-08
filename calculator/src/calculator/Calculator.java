package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);

        // Calculate factorial of num1
        long factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num1 + " is: " + factorial);

        // Check if num2 is prime
        boolean isPrime = true;
        if (num2 <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num2); i++) {
                if (num2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num2 + (isPrime ? " is a prime number." : " is not a prime number."));

        scanner.close();
    }
}

