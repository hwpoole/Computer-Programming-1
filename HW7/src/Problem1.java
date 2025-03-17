/*
Name: Hunter Poole
Date: 3/17/25
HW #: 7
Problem #: 1
Source Code: Problem1.java
Action: 
*/

import java.util.Scanner;

public class Problem1
{

/*
Action: Accepts one positive integer X
Parameters:
Returns: void
Precondition:
*/
    static void TimeCalculator(int X)
    {
        int Hours, Minutes, Seconds;
        
        Hours = X / 3600;
        Minutes = (X % 3600) / 60;
        Seconds = (X % 3600) % 60;

        System.out.printf("%d:%02d:%02d%n", Hours, Minutes, Seconds);
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
 * 
 */