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
        int STUFF = 0, BeginAt = 0;

        for (int i = 0; i < X.length(); i++)
        {
            if (X.charAt(i) != 32 && (X.charAt(i) < 48 || X.charAt(i) > 57))
            {
                return -1;
            }
            else if (X.charAt(i) != 32 && (X.charAt(i) >= 48 && X.charAt(i) <= 57))
            {
                BeginAt = i;
                break;
            }
        }       

        for (int i = BeginAt; i < X.length(); i++)
        {
            if (X.charAt(i) >= 48 && X.charAt(i) <= 57)
            {
                STUFF = STUFF * 10 + (X.charAt(i) - 48);
            }

            if (X.charAt(i) < 48 || X.charAt(i) > 57)
            {
                return STUFF;
            }
        }

        return STUFF;
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
            ProvidedString = Input.nextLine();

            ReturnedInt = ReadInt(ProvidedString);


            if (ReturnedInt == -1)
            {
                System.out.println("ERROR -1");
            }
            if (ReturnedInt == -2)
            {
                System.out.println("ERROR -2");
            }

            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);

        } while (Continue != 'n' && Continue != 'N');
    }
}

/*
 * 
 */