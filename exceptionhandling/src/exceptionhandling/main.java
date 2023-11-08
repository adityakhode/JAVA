package exceptionhandling;

public class main {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Attempt to divide by zero
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.err.println("Caught an ArithmeticException: Cannot divide by zero.");
        }
        catch (IllegalArgumentException e) {
            System.err.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}


