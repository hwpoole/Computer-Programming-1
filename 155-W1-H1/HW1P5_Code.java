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
        System.out.print("Enter a number. Enter 0 to exit: ");
        int Number = Number_Input.nextInt();

        while (Number != 0) {
            if (Number > 100) {
                System.out.println("The number is greater than 100.");
                System.out.print("Enter a number: ");
                Number = Number_Input.nextInt();
            } else if (Number < 100) {
                System.out.println("The number is less than 100.");
                System.out.print("Enter a number: ");
                Number = Number_Input.nextInt();
            }
        }
        if (Number == 0) {
            Number_Input.close();
            System.out.println("Exit successful.");
        }
    }
}

/* I am using VSCode, output below is the full terminal output */

/*
hunterpoole@Megs-MacBook-Pro Documents %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptio
nMessages -cp /Users/hunterpoole/Library/Application\ Support/Code/User/workspaceStorage/aa4af2d5ea8777f0c20fee4aa25f3c30/redhat.java/jdt_ws/Documents_5c3529
dc/bin HW1P5_Code 

Enter a number. Enter 0 to exit: 400
The number is greater than 100.
Enter a number: 12
The number is less than 100.
Enter a number: 1
The number is less than 100.
Enter a number: 101
The number is greater than 100.
Enter a number: 0
Exit successful.

hunterpoole@Megs-MacBook-Pro Documents %
*/