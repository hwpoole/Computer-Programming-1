/*
Name: Hunter Poole
Date: 2/24/25
HW #: 5
Problem #: 3
Source Code: Problem3.java
Action: Given a series of numbers, return how many of them are even.
        Exit program when "0" is entered.
*/

import java.util.Scanner;

public class Problem3
{

    public static void main(String[] args)
    {
        int Even_Count = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please provide your numbers one at a time. Enter 0 to exit: ");
        int Number = Input.nextInt();

        while (Number != 0)
        {
            if (Number % 2 == 0)
            {
                Even_Count++;
            }
            
            System.out.print("Next number: ");
            Number = Input.nextInt();
        }

        if (Number == 0)
        {
            System.out.print("You have entered " + Even_Count + " even numbers.");
        }

    }
}

/*
Please provide your numbers one at a time. Enter 0 to exit: 3
Next number: 56
Next number: 4
Next number: 13
Next number: 779
Next number: 46
Next number: 0
You have entered 3 even numbers.

Please provide your numbers one at a time. Enter 0 to exit: 905775
Next number: 13
Next number: 777
Next number: 346
Next number: 42
Next number: 12
Next number: 0
You have entered 3 even numbers.
*/