/*
Name: Hunter Poole
Date: 3/26/25
HW #: 7
Problem #: 1
Source Code: Problem1.java
Action: Takes the total number of seconds from the user.
        Calls a method to calculate and display HH:MM:SS
        for all input > 0. Quits on input == 0.
*/

import java.util.Scanner;

public class Problem1
{

/*
Action: Given # of seconds, calculates and prints HH:MM:SS
Parameters: int X
Returns: void
Precondition: Input must be > 0.
*/

    static void TimeCalculator(int X)
    {
        int Hours, Minutes, Seconds;
        
        if (X > 0)
        {
            Hours = X / 3600;
            Minutes = (X % 3600) / 60;
            Seconds = (X % 3600) % 60;
        
        System.out.printf("%d:%02d:%02d%n%n", Hours, Minutes, Seconds);
        }
    }

    public static void main(String[] args)
    {
        int TotalSeconds;

        Scanner Input = new Scanner(System.in);

        do
        {
        System.out.print("Enter Total Seconds --> ");
        TotalSeconds = Input.nextInt();

        TimeCalculator(TotalSeconds);
        } while (TotalSeconds != 0);
    }
}

/*
Enter Total Seconds --> 3605
1:00:05

Enter Total Seconds --> 7458
2:04:18

Enter Total Seconds --> 350
0:05:50

Enter Total Seconds --> -40
Enter Total Seconds --> 0
 */