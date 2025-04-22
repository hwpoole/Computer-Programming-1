/*
Name: Hunter Poole
Date: 4/22/25
Lab #: 12
Source Code: Lab12.java
Action:
*/

import java.util.Scanner;

public class Lab12
{
    public static void main(String[] args)
    {
        String UserString;
        int[] LargeInt = new int[20];

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter large number --> ");
        UserString = Input.nextLine();

        StringToIntArray(LargeInt, UserString);
        
        for (int i = 0; i < LargeInt.length; i++)
        {
            System.out.print(LargeInt[i] + " ");
        }
    }

/*
Action: Fills an integer array using a provided string of integers.
        Puts the string at the back of the array. Keeps leading 0s.
        Ignores any non-numeric characters.
Parameters: int Array[], String GivenString
Returns: void
Precondition: Array is initialized / Array is of size > 0
*/

    static void StringToIntArray (int Array[], String GivenString)
    {
        for (int i = 0; i < GivenString.length(); i++)
        {
            if (GivenString.charAt(i) >= 48 && GivenString.charAt(i) <= 57)
            {
                Array[Array.length - GivenString.length() + i] = GivenString.charAt(i) - 48;
            }
        }
    }
}

