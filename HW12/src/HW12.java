/*
Name: Hunter Poole
Date: 4/22/25
Lab #: 12
Source Code: HW12.java
Action: Takes an int (as string) from the user and turns it into
        a 20-digit number (as an int array) with leading zeros.
        Prints the result ("Large 20 digit Number is ").
        Calls a function to fill the integer array with the user's string.
        Loops until user chooses to stop ('n' or 'N').
*/

import java.util.Scanner;

public class HW12
{
    public static void main(String[] args)
    {
        char Choice = 'n';
        String UserString;
        int[] LargeIntOne = new int[20];
        int[] LargeIntTwo = new int[20];
        int[] SumOfLargeInts = new int[20];

        do
        {
            ClearArray(LargeIntOne);
            ClearArray(LargeIntTwo);

            Scanner Input = new Scanner(System.in);
            System.out.print("Please enter first number --> ");
            UserString = Input.nextLine();

            StringToIntArray(LargeIntOne, UserString);

            System.out.print("Please enter second number --> ");
            UserString = Input.nextLine();

            StringToIntArray(LargeIntTwo, UserString);

            DisplayAnArray(LargeIntOne);
            DisplayAnArray(LargeIntTwo);

            AddTwoArrays(LargeIntOne, LargeIntTwo, SumOfLargeInts);

            System.out.println("------------------------------");
            DisplayAnArray(LargeIntOne);

            System.out.printf("%n%n%s","Continue 'Y' or 'N', response --> ");
            Choice = Character.toLowerCase(Input.next().charAt(0));

        } while (Choice != 'n');
    }


/*
Action: Clears an integer array (Sets all values to 0)
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
Action: For two integer arrays: Adds the value of each index of the second
        array to the value of each index of the first array.
Parameters: int ArrayOne[], int ArrayTwo[]
Returns: void
Precondition: Both arrays are initialized / Arrays are of size > 0.
*/

    static void AddTwoArrays (int ArrayOne[], int ArrayTwo[], int SumArray[])
    {
       // int OneAsInt = 0, TwoAsInt = 0;

        for (int i = 0; i < ArrayOne.length; i++)
        {
            ArrayOne[i] += ArrayTwo[i];
            if (ArrayOne[i] + ArrayTwo[i] > 10)
            {
                ArrayOne[i - 1] += 1;
                ArrayOne[i] = (ArrayOne[i] + ArrayTwo[i]) % 10;
            }
        }

    /*    for (int i = 0; i < ArrayTwo.length; i++)
        {
            TwoAsInt += ArrayTwo[i];
        }

        OneAsInt += TwoAsInt;

        for (int i = 0; i < SumArray.length; i++)
        {
            SumArray[SumArray.length -
        } */
    }

/*
Action: Displays an integer array all on one line, no spaces or other formatting.
Parameters: int Array[]
Returns: void
Precondition: Array is initialized / Array is of size > 0.
*/

    static void DisplayAnArray (int Array[])
    {
        for (int i = 0; i < Array.length; i++)
        {
            System.out.print(Array[i]);
        }

        System.out.println();
    }
}
/*

*/
