/*
Name: Hunter Poole
Date: 4/16/25
HW #: 10
Problem #: 2
Source Code: Problem2.java
Action:
*/

import java.util.Scanner;

public class Problem2
{

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static int IntegerPower(int Base, int Exponent)
    {
        int Result = Base;

        for (int i = 2; i <= Exponent; i++)
        {
            Result *= Base;
        }

        return Result;
    }

    public static void main(String[] args)
    {
        int Base, Exponent, Answer;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please input the base --> ");
        Base = Input.nextInt();

        System.out.print("Please input the exponenet --> ");
        Exponent = Input.nextInt();

        Answer = IntegerPower(Base, Exponent);

        System.out.print("Answer is = " + Answer);
    }
}

/*

*/