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
        System.out.print("Enter the first number: ");
        int Num1 = Num1_Input.nextInt();
        
        Scanner Num2_Input = new Scanner(System.in);
        System.out.print("Enter the second number: ");
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

/* I am using VSCode, output below is the full terminal output */

/*
hunterpoole@Megs-MacBook-Pro Documents %  /usr/bin/env /Library/Java/JavaVirtualMachines/t
emurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hu
nterpoole/Library/Application\ Support/Code/User/workspaceStorage/aa4af2d5ea8777f0c20fee4a
a25f3c30/redhat.java/jdt_ws/Documents_5c3529dc/bin HW1P4_Code 

Enter the first number: 15
Enter the second number: 44
The two numbers are: 44, 15

hunterpoole@Megs-MacBook-Pro Documents %  cd /Users/hunterpoole/Documents ; /usr/bin/env /
Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetail
sInExceptionMessages -cp /Users/hunterpoole/Library/Application\ Support/Code/User/workspa
ceStorage/aa4af2d5ea8777f0c20fee4aa25f3c30/redhat.java/jdt_ws/Documents_5c3529dc/bin HW1P4
_Code 

Enter the first number: 32
Enter the second number: 21
The two numbers are: 32, 21

hunterpoole@Megs-MacBook-Pro Documents % 
*/