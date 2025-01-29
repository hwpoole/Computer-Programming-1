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
        System.out.println("Enter the radius of the circle: ");
        float Radius = Radius_Input.nextFloat();

        while (Radius <=0) {
            System.out.println("Please enter a positive number: ");
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
