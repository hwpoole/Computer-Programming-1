/*
Name: Hunter Poole
Date: 3/5/25
HW #: 6
Problem #: 2
Source Code: Problem2.java
Action: Takes two user integers and a user math operand.
        Performs the specified operation between the two
        numbers. Provides the formula used. Loops until
        N is entered.
*/

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        char Operand;
        int X, Y;

        do
        {
            Scanner Input = new Scanner(System.in);

            System.out.print("Enter your first number: ");
            X = Input.nextInt();

            System.out.print("Enter your second number: ");
            Y = Input.nextInt();

            System.out.print("Enter your math operand. N to quit: ");
            Operand = Input.next().charAt(0);


                switch (Operand)
                {
                    case '+':
                        System.out.printf("%d %s %d %s %d %n%n", X, "+", Y, "=", (X + Y));
                        break;
                    case '-':
                        System.out.printf("%d %s %d %s %d %n%n", X, "-", Y, "=", (X - Y));
                        break;
                    case '*':
                        System.out.printf("%d %s %d %s %d %n%n", X, "*", Y, "=", (X * Y));
                        break;
                    case '/':
                        System.out.printf("%d %s %d %s %d %n%n", X, "/", Y, "=", (X / Y));
                        break;
                    case '%':
                        System.out.printf("%d %s %d %s %d %n%n", X, "%", Y, "=", (X % Y));
                        break;
                    default:
                        if (Operand != 'N')
                        {
                            System.out.printf("%s %n%n","Error! Please enter a valid math operand (+ - * / %)");
                        }
                        break;
                }
        } while (Operand != 'N');
    }
}

/*
Enter your first number: 4
Enter your second number: 6
Enter your math operand. N to quit: +
4 + 6 = 10 

Enter your first number: 18
Enter your second number: 6
Enter your math operand. N to quit: %
18 % 6 = 0 

Enter your first number: 8   
Enter your second number: 32
Enter your math operand. N to quit: *
8 * 32 = 256 

Enter your first number: 512
Enter your second number: 300
Enter your math operand. N to quit: -
512 - 300 = 212 

Enter your first number: 44
Enter your second number: 11
Enter your math operand. N to quit: /
44 / 11 = 4 

Enter your first number: 1
Enter your second number: 1
Enter your math operand. N to quit: D
Error! Please enter a valid math operand (+ - * / %) 

Enter your first number: 1
Enter your second number: 1
Enter your math operand. N to quit: .
Error! Please enter a valid math operand (+ - * / %) 

Enter your first number: 1
Enter your second number: 1
Enter your math operand. N to quit: +
1 + 1 = 2 

Enter your first number: 1
Enter your second number: 1
Enter your math operand. N to quit: N
 */