/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 1
Problem #: 2
Source File: HW1P2_Code
Action: Given the radius of a circle, calculates and then prints the volume and surface area of the sphere for that circle.
*/

import java.util.Scanner;

public class HW1P2_Code {
    public static void main(String[] args) throws Exception {

        Scanner Radius_Input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float Radius = Radius_Input.nextFloat();

        while (Radius <=0) {
            System.out.print("Please enter a positive number: ");
            Radius = Radius_Input.nextFloat();
        }

        Radius_Input.close();

        // Volume = 4/3pir^3
        // Surface Area = 4pir^2
        double Volume = Radius * Radius * Radius * 3.1415926 * 4 / 3;
        double Surface_Area = Radius * Radius * 3.1415926 * 4;

        System.out.println("The volume of the sphere is: " + Volume + "^3");
        System.out.println("The surface area of the sphere is: " + Surface_Area + "^2");

    }
}

/* I am using VSCode, output below is the full terminal output */

/*
hunterpoole@Megs-MacBook-Pro Documents %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptio
nMessages -cp /Users/hunterpoole/Library/Application\ Support/Code/User/workspaceStorage/aa4af2d5ea8777f0c20fee4aa25f3c30/redhat.java/jdt_ws/Documents_5c3529
dc/bin HW1P2_Code 

Enter the radius of the circle: 6
The volume of the sphere is: 904.7786688^3
The surface area of the sphere is: 452.3893344^2

hunterpoole@Megs-MacBook-Pro Documents % 
*/