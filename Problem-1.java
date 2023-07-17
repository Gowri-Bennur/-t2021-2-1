import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.next();

        double result;
        switch (operation) {
            case "+":
                result = add(a, b);
                System.out.println("Result: " + result);
                break;
            case "-":
                result = subtract(a, b);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = multiply(a, b);
                System.out.println("Result: " + result);
                break;
            case "/":
                result = divide(a, b);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}
