package calculator;
import simple.SimpleCalculator;
import scientific.ScientificCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator basic = new SimpleCalculator();
        ScientificCalculator sci = new ScientificCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Multi-Package Super Calculator!");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println(" +  -  *  /  %  sqrt  ^  sin  cos  tan  log  ln ");
            System.out.println("Or type 'exit' to quit.");
            String op = sc.next();

            if (op.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                double num1, num2, result = 0;
                boolean valid = true;

                if (op.equals("sqrt") || op.equals("sin") || op.equals("cos") || op.equals("tan") || op.equals("log") || op.equals("ln")) {
                    System.out.println("Enter number:");
                    num1 = getValidDouble(sc);

                    switch (op) {
                        case "sqrt":
                            result = sci.sqrt(num1);
                            break;
                        case "sin":
                            result = sci.sin(num1);
                            break;
                        case "cos":
                            result = sci.cos(num1);
                            break;
                        case "tan":
                            result = sci.tan(num1);
                            break;
                        case "log":
                            result = sci.log(num1);
                            break;
                        case "ln":
                            result = sci.ln(num1);
                            break;
                        default:
                            valid = false;
                    }
                } else {
                    System.out.println("Enter first number:");
                    num1 = getValidDouble(sc);
                    System.out.println("Enter second number:");
                    num2 = getValidDouble(sc);

                    switch (op) {
                        case "+":
                            result = basic.add(num1, num2);
                            break;
                        case "-":
                            result = basic.subtract(num1, num2);
                            break;
                        case "*":
                            result = basic.multiply(num1, num2);
                            break;
                        case "/":
                            result = basic.divide(num1, num2);
                            break;
                        case "%":
                            result = basic.modulus(num1, num2);
                            break;
                        case "^":
                            result = sci.power(num1, num2);
                            break;
                        default:
                            valid = false;
                    }
                }

                if (valid) {
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Invalid operation.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }

    private static double getValidDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Enter a number:");
            sc.next();
        }
        return sc.nextDouble();
    }
}
