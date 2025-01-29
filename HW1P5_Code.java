/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 1
Problem #: 5
Source File: HW1P5_Code
Action: Given a number, determines if it is greater than or less than 100. Program stays active until user enters 0 to exit.
*/

import java.util.Scanner;

public class HW1P5_Code {
    public static void main(String[] args) throws Exception {

        Scanner Number_Input = new Scanner(System.in);
        System.out.println("Enter a number below. Enter 0 to exit.");
        int Number = Number_Input.nextInt();

        while (Number != 0) {
            if (Number > 100) {
                System.out.println("The number is greater than 100.");
                System.out.println("Enter a number: ");
                Number = Number_Input.nextInt();
            } else if (Number < 100) {
                System.out.println("The number is less than 100.");
                System.out.println("Enter a number: ");
                Number = Number_Input.nextInt();
            }
        }
        if (Number == 0) {
            Number_Input.close();
            System.out.println("Exit successful.");
        }
    }
}
