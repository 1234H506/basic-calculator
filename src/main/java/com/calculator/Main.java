package com.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;

        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operation you wish to perform:");
        operation = scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                System.out.printf("The total amount was %.2f%n", num1 + num2);
                break;
            case '-':
                System.out.printf("The value of the subtraction was %.2f%n", num1 - num2);
                break;
            case '/':
                System.out.printf("The value of the division was %.2f%n", num1 / num2);
                break;
            case '*':
                System.out.printf("The result of the multiplication was %.2f%n", num1 * num2);
                break;
            default:
                System.err.println("Error: invalid operation.");
                break;
        }

        scanner.close();
    }
}