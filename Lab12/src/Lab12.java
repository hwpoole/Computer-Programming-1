/*
Name: Hunter Poole
Date: 4/22/25
Lab #: 12
Source Code: Lab12.java
Action: Takes an int (as string) from the user and turns it into
        a 20-digit number (as an int array) with leading zeros.
        Prints the result ("Large 20 digit Number is ").
        Calls a function to fill the integer array with the user's string.
        Loops until user chooses to stop ('n' or 'N').
*/

import java.util.Scanner;

public class Lab12
{
    public static void main(String[] args)
    {
        char Choice = 'n';
        String UserString;
        int[] LargeInt = new int[20];

        do
        {
            ClearArray(LargeInt);

            Scanner Input = new Scanner(System.in);
            System.out.print("Please enter large number --> ");
            UserString = Input.nextLine();

            StringToIntArray(LargeInt, UserString);

            System.out.println("Large 20 digit Number is");
            for (int i = 0; i < LargeInt.length; i++)
            {
                System.out.print(LargeInt[i]);
            }

            System.out.printf("%n%n%s","Continue 'Y' or 'N', response --> ");
            Choice = Character.toLowerCase(Input.next().charAt(0));

        } while (Choice != 'n');
    }

/*
Action: Fills an integer array using a provided string of integers.
        Puts the string at the back of the array. Keeps leading 0s.
        Non-numeric characters are treated as 0s.
Parameters: int Array[], String GivenString
Returns: void
Precondition: Array is initialized / Array is of size > 0.
              Same conditions for String.
*/

    static void StringToIntArray (int Array[], String GivenString)
    {
        for (int i = 0; i < GivenString.length(); i++)
        {
            if (GivenString.charAt(i) >= 48 && GivenString.charAt(i) <= 57)
            {
                Array[Array.length - GivenString.length() + i] = GivenString.charAt(i) - 48;
            }
            else
            {
                Array[Array.length - GivenString.length() + i] = 0;
            }
        }
    }

/*
Action: Clears an array (Sets all values to 0)
Parameters: int Array[]
Returns: void
Precondition: Array is of size > 0.
*/

    static void ClearArray (int Array[])
    {
        for (int i = 0; i < Array.length; i++)
        {
            Array[i] = 0;
        }
    }

}

/*
Please enter large number --> 984567
Large 20 digit Number is
00000000000000984567

Continue 'Y' or 'N', response --> j
Please enter large number --> ABCD
Large 20 digit Number is
00000000000000000000

Continue 'Y' or 'N', response --> MAYBE????
Please enter large number --> 12345678909876543210
Large 20 digit Number is
12345678909876543210

Continue 'Y' or 'N', response --> <804>  
Please enter large number --> AB<3264>     L17
Large 20 digit Number is
00000003264000000017

Continue 'Y' or 'N', response --> NO!
*/
