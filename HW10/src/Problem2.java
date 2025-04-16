/*
Name: Hunter Poole
Date: 4/16/25
HW #: 10
Problem #: 2
Source Code: Problem2.java
Action: Asks for a base and an Exponent from the user. Then, calls IntegerPower function
        to calculate the result without using any of the math methods.
*/

import java.util.Scanner;

public class Problem2
{

/*
Action: Given two integers, a base and an exponent, finds the result of the exponential math.
Parameters: int Base, int Exponent
Returns: int Result
Precondition: int Exponent is non-zero and non-negative.
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
Please input the base --> 2
Please input the exponenet --> 5
Answer is = 32

Please input the base --> 2
Please input the exponenet --> 10
Answer is = 1024

Please input the base --> 3
Please input the exponenet --> 3
Answer is = 27

Please input the base --> 8
Please input the exponenet --> 2
Answer is = 64
*/

// Constraints tests //

/*
Please input the base --> 2
Please input the exponenet --> 0
Answer is = 2

Please input the base --> 2
Please input the exponenet --> -1
Answer is = 2

Please input the base --> 2
Please input the exponenet --> 999999999
Answer is = 0
*/