import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the arithmetic expression: ");
        String expression = scanner.nextLine();
        scanner.close();

        try {
            int result = evaluateArithmeticExpression(expression);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid expression or calculation error.");
        }

        scanner.close();
    }

    private static int evaluateArithmeticExpression(String expression) {
        char[] chars = expression.toCharArray();
        System.out.println(chars);
        int len = chars.length;

        int num = 0;
        int result = 0;
        char operator = '+';
       // boolean isFirstNumber = true;

        for (int i = 0; i < len; i++) {
            char ch = chars[i];

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == len - 1) {
                switch (operator) {
                    case '+':
                        result += num;
                        break;
                    case '-':
                        result -= num;
                        break;
                    case '*':
                        result *= num;
                        break;
                    case '/':
                        if (num == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        result /= num;
                        break;
                    case '!':
                    	System.out.println("helo");
                    	if(num>0) {
                    		int y = 1;
                			while(num!= 1) {
                				y = y*num;
                				num--;
                				
                			}
                			result = y;
                			break;
                    	}
                }

                num = 0;
                operator = ch;
            }
        }

        return result;
    }
    
}
