/*
Name: Hunter Poole
Date: 3/17/25
HW #: 7
Problem #: 2
Source Code: Problem2.java
Action: Given an integer 1 - 100, determines if the integer
        is odd or even via a method that returns to main.
        Determines sum of integers of 1 - [Input] in the range
        1 - 100, inclusive, via a method that returns to main.
        Outputs result. Continues in a loop. Any input outside
        of 1 - 100 will display an error and exit.
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
                System.out.printf("%s %d %s %d %n%n","Sum of integers 1 -", Number, "is:", SumOfInts(Number));

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
Enter an integer 1 - 100 --> 4
4 is even
Sum of integers 1 - 4 is: 10 

Enter an integer 1 - 100 --> 12
12 is even
Sum of integers 1 - 12 is: 78 

Enter an integer 1 - 100 --> 100
100 is even
Sum of integers 1 - 100 is: 5050 

Enter an integer 1 - 100 --> 0              //In while-loop error
ERROR: Must enter an integer 1 - 100
*/

/*
Enter an integer 1 - 100 --> 101              //Before while-loop error
ERROR: Must enter an integer 1 - 100
*/