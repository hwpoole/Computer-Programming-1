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

    static int ReadInt (String InputString)
    {
        int ConvertedInt = 0, StartAt = 0;

        for (int i = 0; i < InputString.length(); i++)
        {
            if (InputString.charAt(i) != ' ' &&
               (InputString.charAt(i) < '0' || InputString.charAt(i) > '9'))
            {
                return -1;
            }
            else if (InputString.charAt(i) != ' ' &&
                    (InputString.charAt(i) >= '0' && InputString.charAt(i) <= '9'))
            {
                StartAt = i;
                break;
            }
        }       

        for (int i = StartAt; i < InputString.length(); i++)
        {
            if (InputString.charAt(i) >= '0' && InputString.charAt(i) <= '9')
            {
                ConvertedInt = ConvertedInt * 10 + (InputString.charAt(i) - '0');
            }
            else if ((InputString.charAt(i) < '0' || InputString.charAt(i) > '9') && 
                    ConvertedInt <= 65535)
            {
                return ConvertedInt;
            }
            else
            {
                break;
            }
        }

        if (ConvertedInt <= 65535)
        {
            return ConvertedInt;
        }
        else
        {
            return -2;
        }
    }

    public static void main(String[] args)
    {
        String UserString;
        char Continue;
        int ReturnedInt;

        Scanner Input = new Scanner(System.in);

        do 
        {
            System.out.print("Provide your string: ");
            UserString = Input.nextLine();

            ReturnedInt = ReadInt(UserString);


            if (ReturnedInt == -1)
            {
                System.out.println("ERROR illegal entry. Ensure your first entered"
                                    + " character is numeric");
            }
            else if (ReturnedInt == -2)
            {
                System.out.println("ERROR overflow. Your integer must not exceed"
                                    + " 65535");
            }
            else
            {
                System.out.println("Your integer is: " + ReturnedInt);
            }

            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);
            Input.nextLine();

        } while (Continue != 'n' && Continue != 'N');
    }
}

/*
 */