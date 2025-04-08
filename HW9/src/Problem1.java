/*
Name: Hunter Poole
Date: 4/7/25
HW #: 9
Problem #: 1
Source Code: Problem1.java
Action: Converts a string to an int using a function.
        Does not use any built in parsing or conversion routines.
        Function returns error codes to main, main tests the codes.
        Main displays errors or the converted integer.
        Loops until 'n' or 'N'.
*/

import java.util.Scanner;

public class Problem1
{

/*
Action: Skips all leading whitespaces (reads them but does nothing), 
        checks if first non-whitespace character is numeric.
        Concatenates found numbers from string into ConvertedInt.
        Checks if ConvertedInt is <= 65535.
Parameters: String InputString
Returns: -1 if first non-whitespace character is non-numeric.
         -2 if ConvertedInt >= 65535
Precondition: string contains non-negative numbers, starts non-zero.
*/

    static int ReadInt (String InputString)
    {
        int ConvertedInt = 0, StartAt = 0;

        for (int i = 0; i < InputString.length(); i++)
        {
            if (InputString.charAt(i) != ' ' &&
               (InputString.charAt(i) < '0' || InputString.charAt(i) > '9'))
            {
                if (ConvertedInt == 0)
                {
                    return -1;
                }
                else
                {
                    break;
                }
            }
            else if (InputString.charAt(i) != ' ' &&
                    (InputString.charAt(i) >= '0' && InputString.charAt(i) <= '9'))
            {
                ConvertedInt = ConvertedInt * 10 + (InputString.charAt(i) - '0');
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
            System.out.println();

        } while (Continue != 'n' && Continue != 'N');
    }
}

/*
Provide your string:           159 J 6
Your integer is: 159
Continue? Y or N: Y

Provide your string: !              8
ERROR illegal entry. Ensure your first entered character is numeric
Continue? Y or N: Y

Provide your string:  N 48
ERROR illegal entry. Ensure your first entered character is numeric
Continue? Y or N: Y

Provide your string: 99999
ERROR overflow. Your integer must not exceed 65535
Continue? Y or N: Y

Provide your string:     486      7  <> 18
Your integer is: 4867
Continue? Y or N: N
*/

/*
Provide your string:  8447JJJ99
Your integer is: 8447
Continue? Y or N: n
*/