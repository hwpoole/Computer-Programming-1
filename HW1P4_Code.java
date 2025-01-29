/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 1
Problem #: 4
Source File: HW1P4_Code
Action: Given two numbers, returns them in order of the larger one first.
*/

import java.util.Scanner;

public class HW1P4_Code {
    public static void main(String[] args) throws Exception {

        Scanner Num1_Input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int Num1 = Num1_Input.nextInt();
        
        Scanner Num2_Input = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int Num2 = Num2_Input.nextInt();

        Num1_Input.close();
        Num2_Input.close();

        if (Num1 > Num2) {
            System.out.println("The two numbers are: " + Num1 + ", " + Num2);
        } else {
            System.out.println("The two numbers are: " + Num2 + ", " + Num1);
        }
    }
}