package Week2;

import java.util.Scanner;

public class Mathematics {
    public static double Add(double num1, double num2) {
        return num1 + num2;
    }

    public static double Subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double Multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double Divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double operand(double num1, double num2, String operand) {
        switch (operand) {
            case "+" -> {
                return Add(num1, num2);
            }
            case "-" -> {
                return Subtract(num1, num2);
            }
            case "*" -> {
                return Multiply(num1, num2);
            }
            case "/" -> {
                return Divide(num1, num2);
            }

            default -> System.out.println("Invalid operand");
        }
        return 0;
    }

    public static void CalculatorWhile (Scanner scanner) {
        System.out.println("Would you like to use the calculator (Y/N?)");
        String answer = scanner.nextLine();

        while (answer.toLowerCase().equals("y")) {
            System.out.println("Please enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number");
            double num2 = scanner.nextDouble();

            System.out.println("Please enter the operand (+, -, *, /)");
            String operand = scanner.next();

            System.out.println(num1 + " " + operand + " " + num2 + " = " + operand(num1, num2, operand));
            answer = scanner.next();
        }
        System.out.println("Thank you for using the calculator!");
    }

    public static void CalculatorDoWhile(Scanner scanner) {
        String answer;

        do {
            System.out.println("Please enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number");
            double num2 = scanner.nextDouble();

            System.out.println("Please enter the operand (+, -, *, /)");
            String operand = scanner.next();

            System.out.println(num1 + " " + operand + " " + num2 + "=" + operand(num1, num2, operand));
            answer = scanner.next();
        } while (answer.toLowerCase().equals("y"));
    }
}
