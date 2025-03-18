/*
Name: Hunter Poole
Date: 3/17/25
Lab #: 7
Source Code: Lab7.java
Action: 
*/

import java.util.Scanner;

public class Lab7
{

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static void BigPositive()
    {
        System.out.printf("%n%n%5c%n%5c%n%c%c%c%c%c%c%c%c%c %n%5c %n%5c %n%n", '*','*','*','*','*','*','*','*','*','*','*','*','*');
    }

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static void BigNegative()
    {
        System.out.printf("%n%n%c%c%c%c%c%c%c%c%c%c%c%n%n",'*','*','*','*','*','*','*','*','*','*','*','*');
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

            System.out.printf("%n%s %d %n%s","The answer is:", Difference,
                                "And expression is: ");

            if (Difference > 0)
            {
                BigPositive();
            }
            else
            {
                BigNegative();
            }

        } while (Num1 != Num2);
    }
}

/*
 * 
 */