package com.calculator;
import java.util.Scanner;

public class Main {
    
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }

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
                System.out.printf("The total amount was %.2f%n", add(num1, num2));
                break;
            case '-':
                System.out.printf("The value of the subtraction was %.2f%n", subtract(num1, num2));
                break;
            case '/':
                if (num2 == 0.0) {
                    System.err.println("Error: division by zero is not allowed.");
                } else {
                    System.out.printf("The value of the division was %.2f%n", divide(num1, num2));
                }
                break;
            case '*':
                System.out.printf("The result of the multiplication was %.2f%n", multiply(num1, num2));
                break;
            default:
                System.err.println("Error: invalid operation.");
                break;
        }

        scanner.close();
    }
}