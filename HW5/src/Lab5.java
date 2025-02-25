/*
Name: Hunter Poole
Date: 2/24/25
Lab #: 5
Source Code: Lab5.java
Action: Determines if a number is positive, negative or zero.
        Stores # of positives, negatives, and zeros. Displays
        count on exit.
        Only takes Y || y for start/continue. N || n for quit.
*/

import java.util.Scanner;

public class Lab5
{

    public static void main(String[] args)
    {
        int Num, Positive = 0, Negative = 0, Zero = 0;
        char Ch;

        Scanner Input = new Scanner(System.in);
        System.out.print("Do you want to start Y/N ");
        Ch = Input.next().charAt(0);

        while ((Ch != 'N' || Ch != 'n') && (Ch == 'Y' || Ch == 'y'))
        {
            System.out.print("Enter integer ");
            Num = Input.nextInt();

            if (Num > 0)
            {
                Positive++;
                System.out.println("Positive");
            }
            else if (Num == 0)
            {
                Zero++;
                System.out.println("Zero");
            }
            else
            {
                Negative++;
                System.out.println("Negative");
            }

            System.out.printf("%n%s","Do you want to continue Y/N ");
            Ch = Input.next().charAt(0);

        }

        if (Ch == 'N' || Ch == 'n')
        {
        System.out.printf("%s %d %n%s %d %n%s %d","Positive =", Positive,
                            "Negative =", Negative, "Zero     =", Zero);
        }
    }
}

/*
Do you want to start Y/N y
Enter integer 6
Positive

Do you want to continue Y/N Y
Enter integer 7
Positive

Do you want to continue Y/N y
Enter integer -5
Negative

Do you want to continue Y/N Y
Enter integer 0
Zero

Do you want to continue Y/N n
Positive = 2 
Negative = 1
Zero     = 1
 */

// Additional test

/*
Do you want to start Y/N Y
Enter integer 400
Positive

Do you want to continue Y/N y
Enter integer -612
Negative

Do you want to continue Y/N Y
Enter integer 0
Zero

Do you want to continue Y/N n
Positive = 1 
Negative = 1
Zero     = 1
 */

// Bad input test

/*
Do you want to start Y/N H
 */