/*
Name: Hunter Poole
Date: 4/29/25
HW #: 12
Source Code: HW12.java
Action: Takes two ints from the user as strings. Calls a function
        to turn those strings into integer arrays. Then, calls
        a function to display those two arrays. Another function 
        will add the arrays together. Then displays the sum.
        Loops until user quits via 'n' or 'N'
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
            ClearArray(SumOfLargeInts);

            Scanner Input = new Scanner(System.in);
            System.out.print("Please enter first number --> ");
            UserString = Input.nextLine().trim();

            StringToIntArray(LargeIntOne, UserString);

            System.out.print("Please enter second number --> ");
            UserString = Input.nextLine().trim();

            StringToIntArray(LargeIntTwo, UserString);

            DisplayAnArray(LargeIntOne);
            DisplayAnArray(LargeIntTwo);

            AddTwoArrays(LargeIntOne, LargeIntTwo, SumOfLargeInts);

            System.out.println("------------------------------");
            DisplayAnArray(SumOfLargeInts);

            System.out.printf("%n%s","Continue 'Y' or 'N', response --> ");
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
Action: Fills an integer array using a provided string of integers, taking only
        the integers from the string that will fit in the array. Puts the string
        at the back of the array. Keeps leading 0s. Non-numeric characters are
        treated as 0s.
Parameters: int Array[], String GivenString
Returns: void
Precondition: Array is initialized / Array is of size > 0.
              Same conditions for String.
*/

    static void StringToIntArray (int Array[], String GivenString)
    {
        int LengthOfString = GivenString.length();
        int LengthOfArray = Array.length;
        int Start = Math.max(0, LengthOfArray - LengthOfString);

        for (int i = 0; i < Math.min(LengthOfArray, LengthOfString); i++)
        {
            int Index = Start + i;
            
            if (Index >= 0 && Index < LengthOfArray)
            {
                if (GivenString.charAt(i) >= '0' && GivenString.charAt(i) <= '9')
                {
                    Array[Index] = GivenString.charAt(i) - '0';
                }
                else
                {
                    Array[Index] = 0;
                }
            }
        }
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

/*
Action: For two integer arrays: Adds the value of each index of the second
        array to the value of each index of the first array.
Parameters: int ArrayOne[], int ArrayTwo[]
Returns: void
Precondition: Both arrays are initialized / Arrays are of size > 0.
*/

    static void AddTwoArrays (int ArrayOne[], int ArrayTwo[], int SumArray[])
    {

        for (int i = 0; i < ArrayOne.length; i ++)
        {
            SumArray[i] = ArrayOne[i];
        }

        for (int i = SumArray.length - 1; i >= 0; i--)
        {
            if (SumArray[i] + ArrayTwo[i] >= 10 && i > 0)
            {
                SumArray[i - 1] += 1;
                SumArray[i] = (SumArray[i] + ArrayTwo[i]) % 10;
            }
            else
            {
                SumArray[i] += ArrayTwo[i];
            }
        }
    }
}
/*
Please enter first number --> 8764
Please enter second number --> 98
00000000000000008764
00000000000000000098
------------------------------
00000000000000008862

Continue 'Y' or 'N', response --> Sure
Please enter first number --> 1500
Please enter second number --> 559
00000000000000001500
00000000000000000559
------------------------------
00000000000000002059

Continue 'Y' or 'N', response --> 12
Please enter first number --> SOUP! 12345
Please enter second number --> 12345 SOUP!
00000000000000012345
00000000012345000000
------------------------------
00000000012345012345

Continue 'Y' or 'N', response -->                                              no
*/

/*
Please enter first number -->          33333333332222222222                      
Please enter second number --> 6666666666333333333377777777778888888888 <- 10x of
                                 each. 7s and everything beyond will be cut off.
33333333332222222222
66666666663333333333
------------------------------
99999999995555555555

Continue 'Y' or 'N', response --> No I'm okay, but thank you
*/

/*
Please enter first number --> 99999999999999999999
Please enter second number --> 99999999999999999999
99999999999999999999
99999999999999999999
------------------------------
199999999999999999998

Continue 'Y' or 'N', response --> Go fish!
Please enter first number --> 
Please enter second number --> 
00000000000000000000
00000000000000000000
------------------------------
00000000000000000000

Continue 'Y' or 'N', response --> 

f
Please enter first number --> 
*/