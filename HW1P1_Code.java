/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 1
Problem #: 1
Source File: HW1P1_Code
Action: Takes user input for two angles of a triangle, and provides the third.
*/

import java.util.Scanner;

public class HW1P1_Code {
    public static void main(String[] args) throws Exception {

        Scanner A1_input = new Scanner(System.in);
        System.out.print("Please provide your first angle: ");
        float A1 = A1_input.nextFloat();

        while (A1 <= 0 || A1 >= 180) {
            System.out.println("ERROR: PLease ensure your first angle is a positive number, and is less than 180 degrees.");
            System.out.print("Please provide your first angle: ");
            A1 = A1_input.nextFloat();
        }

        Scanner A2_input = new Scanner(System.in);
        System.out.print("Please provide your second angle: ");
        float A2 = A2_input.nextFloat();

        while (A2 <= 0 || A2 >= 180) {
            System.out.println("ERROR: Please ensure your second angle is a positive number, and is less than 180 degrees.");
            System.out.print("Please provide your second angle: ");
            A2 = A2_input.nextFloat();
        }

        while (A1 + A2 >= 180) {
            System.out.println("ERROR: Please ensure your first two angles do not add up to 180 degrees or more.");
            System.out.print("Please provide your second angle: ");
            A2 = A2_input.nextFloat();
        }

        A1_input.close();
        A2_input.close();

        double A3 = 180 - (A1 + A2);
        System.out.println("The third angle is " + A3 + " degrees.");

    }
}

/* I am using VSCode, output below is the full terminal output */

/*
hunterpoole@Megs-MacBook-Pro Documents %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptio
nMessages -cp /Users/hunterpoole/Library/Application\ Support/Code/User/workspaceStorage/aa4af2d5ea8777f0c20fee4aa25f3c30/redhat.java/jdt_ws/Documents_5c3529
dc/bin HW1P1_Code 

Please provide your first angle: 50
Please provide your second angle: 70
The third angle is 60.0 degrees.

hunterpoole@Megs-MacBook-Pro Documents %
*/