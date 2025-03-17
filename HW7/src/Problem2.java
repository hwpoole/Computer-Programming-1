/*
Name: Hunter Poole
Date: 3/17/25
HW #: 7
Problem #: 2
Source Code: Problem2.java
Action: 
*/

import java.util.Scanner;

public class Problem2
{

/*
Action: Determines if a number is odd or even
Parameters: int N
Returns: String " is even" || " is odd"
Precondition: Input must be an integer
*/
 
    static String OddOrEven (int N)
    {
        if (N % 2 == 0)
        {
            return " is even";
        }
        else
        {
            return " is odd";
        }
    }

/*
Action: Computes the sum of all integers up to and including
        input integer, for starting integer 1
Parameters: int N
Returns: Sum of all integers from 1 to input integer, inclusive.
Precondition: Input must be an integer. Starting range must be 1, inclusive.
*/

    static int SumOfInts (int N)
    {
        int Sum = (N * (1 + N)) / 2;
        return Sum;
    }
//****************************************
    public static void main(String[] args)
    {
        int Number;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an integer 1 - 100 --> ");
        Number = Input.nextInt();
        
        if (Number >= 1 && Number <= 100)
        {
            while (Number >= 1 && Number <= 100)
            {
                System.out.println(Number + OddOrEven(Number));
                System.out.println("Sum of integers 1 - " + Number + " is: " + SumOfInts(Number));

                System.out.print("Enter an integer 1 - 100 --> ");
                Number = Input.nextInt();

                if (Number < 1 || Number > 100)
                {
                    System.out.println("ERROR: Must enter an integer 1 - 100");
                }
            }
        }
        else
        {
            System.out.println("ERROR: Must enter an integer 1 - 100");
        }

    }
}

/*
 * 
 */