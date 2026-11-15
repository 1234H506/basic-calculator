package com.calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation, response;
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {
                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();

                System.out.println("Enter the operation you wish to perform:");
                operation = scanner.next().charAt(0);

                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();

                switch (operation) {
                    case '+':
                        System.out.printf("The total amount was %.2f%n", calculator.add(num1, num2));
                        break;
                    case '-':
                        System.out.printf("The value of the subtraction was %.2f%n", calculator.subtract(num1, num2));
                        break;
                    case '/':
                        System.out.printf("The value of the division was %.2f%n", calculator.divide(num1, num2));
                        break;
                    case '*':
                        System.out.printf("The result of the multiplication was %.2f%n", calculator.multiply(num1, num2));
                        break;
                    default:
                        System.err.println("Error: invalid operation.");
                        break;
                }

                System.out.println("Do you want to continue? (y/n)");
                response = scanner.next().charAt(0);

                if (Character.toLowerCase(response) != 'y') {
                    continueCalculating = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: invalid number.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}