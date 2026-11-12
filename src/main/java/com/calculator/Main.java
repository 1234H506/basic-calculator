package com.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum;

        System.out.println("Enter a number:");
        num1 = scanner.nextDouble();        
        System.out.println("Enter a number:");
        num2 = scanner.nextDouble();
        
        sum = num1 + num2;

        System.out.printf("The total was %.2f%n",sum);

        scanner.close();
    }
}