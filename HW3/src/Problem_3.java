/*
Name: Hunter Poole
Date: 2/10/25
Homework #: 3
Problem #: 3
Source File: Problem_3
Action: For two numbers -180 to 180, display product and division of two numbers.
        Division will show quotient and remainder.
*/

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter two integers between -180 and 180 --> ");
        int Num1 = Input.nextInt();
        int Num2 = Input.nextInt();

        int Product = (Num1 * Num2);
        int Quotient = (Num1 / Num2);
        int Remainder = (Num1 % Num2);

        System.out.printf("%4d %6d %s %d %n%s %d %13s %n%s %3d|%d %n%4d",
                            Num1, Quotient, "R", Remainder,
                            "x", Num2, "________", "-----",
                            Num2, Num1, Product);
    }
}

/*  Decided not to validate input between -180 and 180.
    
    Instructions at top of HW #3 specify to assume
    user enters legal data for all programs.

    Instructions in problem #3 specify to test for input
    in range -180 to 180.

    Assuming assignment-wide (global?) instructions take
    precedence over problem-wide instructions.

    Otherwise, would use if statement:
        if ((Num1 >= -180 && Num1 <= 180) && (Num2 >= -180 && Num2 <= 180))
        {
            printf, so on and so forth.
        }
*/

/*
Enter two integers between -180 and 180 --> 125 34
 125      3 R 23 
x 34      ________ 
-----  34|125 
4250

Enter two integers between -180 and 180 --> 157 16
 157      9 R 13 
x 16      ________
-----  16|157
2512
PS C:\Users\hunte\Documents\GitHub\155-W3-H3>
 */