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
            if (X.charAt(i) != ' ' && (X.charAt(i) < '0' || X.charAt(i) > '9'))
            {
                return -1;
            }
            else if (X.charAt(i) != ' ' && (X.charAt(i) >= '0' && X.charAt(i) <= '9'))
            {
                BeginAt = i;
                break;
            }
        }       

        for (int i = BeginAt; i < X.length(); i++)
        {
            if (X.charAt(i) >= '0' && X.charAt(i) <= '9')
            {
                STUFF = STUFF * 10 + (X.charAt(i) - '0');
            }
            else if ((X.charAt(i) < '0' || X.charAt(i) > '9') && STUFF <= 65535)
            {
                return STUFF;
            }
            else
            {
                break;
            }
        }

        if (STUFF <= 65535)
        {
            return STUFF;
        }
        else
        {
            return -2;
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
            ProvidedString = Input.nextLine();

            ReturnedInt = ReadInt(ProvidedString);


            if (ReturnedInt == -1)
            {
                System.out.println("ERROR illegal entry. Ensure your first entered"
                                    + " character is numeric");
            }
            if (ReturnedInt == -2)
            {
                System.out.println("ERROR overflow. Your integer must not exceed"
                                    + " 65535");
            }

            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);

        } while (Continue != 'n' && Continue != 'N');
    }
}

/*
 * 
 */