import java.util.Scanner;

public class NumberSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a' (or 'x' for infinite series): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("x")) {
            generateSeries(Integer.MAX_VALUE);
        } else {
            try {
                int a = Integer.parseInt(input);
                if (a >= 1) {
                    generateSeries(a);
                } else {
                    System.out.println("Invalid input. 'a' should be a positive integer or 'x'.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. 'a' should be a positive integer or 'x'.");
            }
        }
    }

    public static void generateSeries(int a) {
        for (int i = 1; i <= Math.min(a, 10); i++) {
            System.out.print((2 * i - 1) + ", ");
        }

        if (a > 10) {
            System.out.print("...");
        }

        System.out.println();
    }
}

