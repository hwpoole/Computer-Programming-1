/*
Name: Hunter Poole
Date: 3/5/25
Lab #: 6
Source Code: Lab6.java
Action: Given two integers, adds inclusively between them
        EX: 3, 7 = 3+4+5+6+7 = 25
*/

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args)
    {
        int Int1, Int2, Int1While, Int1Do, Int1For, WhileSum = 0, DoSum = 0, ForSum = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter first number ");
        Int1 = Input.nextInt();

        System.out.print("Enter second number ");
        Int2 = Input.nextInt();

        Int1While = Int1;
        Int1Do = Int1;
        Int1For = Int1;

        while (Int1While <= Int2)
        {
            WhileSum = WhileSum + Int1While++;
        }

        System.out.printf("%n%s %d %n","Sum while loop is", WhileSum);

        do
        {
            DoSum = DoSum + Int1Do++;
        } while (Int1Do <= Int2);

        System.out.println("Sum do loop is    " + DoSum);

        for (int i = Int1For; i <= Int2; i++)
        {
            ForSum = ForSum + Int1For++;
        }

        System.out.println("Sum for loop is   " + ForSum);
    }
}

/*
Enter first number 3
Enter second number 7

Sum while loop is 25
Sum do loop is    25
Sum for loop is   25

Enter first number 7
Enter second number 3

Sum while loop is 0
Sum do loop is    7
Sum for loop is   0
 */