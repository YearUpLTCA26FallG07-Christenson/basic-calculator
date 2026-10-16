package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //get values from user:

        //number 1
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        //number 2
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        //operation?  A S M D
        System.out.println("Possible calculations");
        System.out.println("   (A)dd");
        System.out.println("   (S)ubtract");
        System.out.println("   (M)ultiply");
        System.out.println("   (D)ivide");
        System.out.println("Please select an option: ");

        //calculate the results
        int result = num1 * num2;

        //display output
        System.out.println(num1 + " * " + num2 + " = " + result);


    }
}
