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
    public static void main(String[] args)
    {
        Scanner Input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int Num1 = Input1.nextInt();
        
        Scanner Input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int Num2 = Input2.nextInt();

        if (Num1 > Num2)
        {
            System.out.println("The two numbers are: " + Num1 + ", " + Num2);
        } else {
            System.out.println("The two numbers are: " + Num2 + ", " + Num1);
        }
    }
}

/*

Enter the first number: 15
Enter the second number: 44
The two numbers are: 44, 15

Enter the first number: 32
Enter the second number: 21
The two numbers are: 32, 21

hunterpoole@Megs-MacBook-Pro Documents % 
*/