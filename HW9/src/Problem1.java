/*
Name: Hunter Poole
Date:
HW #:
Problem #:
Source Code:
Action:
*/

import java.util.Scanner;

public class Problem1
{

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static int ReadInt (String X)
    {
        String Stack;

        for (int i = 0; i <= X.length(); i++)
        {
            while (X.charAt(i) >= 48 || X.charAt(i) <= 57)
            {
                Stack = (X.charAt(i));
            }
        }
    }

    public static void main(String[] args)
    {
        String ProvidedString;
        char Continue;
        int ReturnedInt;

        Scanner Input = new Scanner(System.in);

        do 
        {
            System.out.print("Provide your string: ");
            ProvidedString = Input.next();


            if (ReturnedInt == -1)
            {
                System.out.print("ERROR -1");
            }
            if (ReturnedInt == -2)
            {
                System.out.print("ERROR -2");
            }

            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);

        } while (Continue != 'n' && Continue != 'N');
    }
}

/*
 * 
 */