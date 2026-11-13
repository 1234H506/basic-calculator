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

        if (operation == '+'){
            System.out.printf("The value of your sum was %.2f%n", num1+num2);
        }else if (operation == '-'){
            System.out.printf("The value of your subtraction was %.2f%n", num1-num2);
        }else{
            System.err.println("Error: Invalid operation\n.");
        }

        scanner.close();
    }
}