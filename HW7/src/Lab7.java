/*
Name: Hunter Poole
Date: 3/17/25
Lab #: 7
Source Code: Lab7.java
Action: Takes two integers, and subtracts the second from the first.
        Displays result and a large positive or negative sign.
        Loops until integer1 = integer2.
*/

import java.util.Scanner;

public class Lab7
{

/*
Action: Displays a big positive sign made of asterisks
Parameters: None
Returns: void
Precondition: None
*/

    static void BigPositive()
    {
        System.out.printf("%n%5c%n%5c%n%c%c%c%c%c%c%c%c%c %n%5c %n%5c %n%n", 
                        '*','*','*','*','*','*','*','*','*','*','*','*','*');
    }

/*
Action: Displays a big negative sign made of asterisks
Parameters: None
Returns: void
Precondition: None
*/

    static void BigNegative()
    {
        System.out.printf("%n%c%c%c%c%c%c%c%c%c%c%c%n%n",
                    '*','*','*','*','*','*','*','*','*','*','*','*');
    }

    public static void main (String[] args)
    {
        int Num1, Num2, Difference;

        Scanner Input = new  Scanner(System.in);

        do
        {
            System.out.print("Please enter two integers to subtract" +
                                 " , same two to quit --> ");
            Num1 = Input.nextInt();
            Num2 = Input.nextInt();

            Difference = Num1 - Num2;

            if (Difference != 0)
            {
            System.out.printf("%n%s %d %n%s%n","The answer is:", Difference,
                                "And expression is: ");
            }

            if (Difference > 0)
            {
                BigPositive();
            }
            else if (Difference < 0)
            {
                BigNegative();
            }

        } while (Num1 != Num2);
    }
}

/*
Please enter two integers to subtract , same two to quit --> 5 3

The answer is: 2 
And expression is: 

    *
    *
********* 
    * 
    * 

Please enter two integers to subtract , same two to quit --> 3 5

The answer is: -2 
And expression is: 

***********

Please enter two integers to subtract , same two to quit --> 17 4

The answer is: 13 
And expression is: 

    *
    *
********* 
    * 
    * 

Please enter two integers to subtract , same two to quit -->  28 28
 */