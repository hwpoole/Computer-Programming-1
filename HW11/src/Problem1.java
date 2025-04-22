/*
Name: Hunter Poole
Date: 4/21/25
HW #: 11
Problem #: 1
Source Code: Problem1.java
Action: Creates an integer array of size [5]. Calls a function to fill it
        with random numbers. Prints the array contents. Calls a function to
        determine the average value of the array. Prints the average value. 
        Then calls a function to determine the total variance of the array.
        Prints this total variance.
*/

public class Problem1
{
    public static void main(String[] args)
    {
        int Average;
        float Variance;
        int[] MainArray = new int[5];

        FillTheArray(MainArray);

        System.out.println("Array is as follows");
        for (int i = 0; i < 5; i++)
        {
        System.out.print(MainArray[i] + " ");
        }

        Average = FindAverage(MainArray);
        System.out.printf("%n%n%s %d%n","Average of all numbers is", Average);

        Variance = FindVariance(MainArray, Average);
        System.out.print("The variance is " + Variance);
        System.out.println();
    }


/*
Action: Fills an integer array up to its specified length with random numbers in [0-100]
Parameters: int Array[]
Returns: void
Precondition: Array is initialized / Array is of size > 0
*/

    static void FillTheArray (int Array[])
    {
        for (int i = 0; i < Array.length; i++)
        {
            Array[i] = (int)Math.round(Math.random() * 101);
        }
    }


/*
Action: Given an integer array, finds and returns its average value
Parameters: int Array[]
Returns: int FoundAverage
Precondition: Array is initialized / Array is of size > 0
*/

    static int FindAverage (int Array[])
    {
        int FoundAverage, ArraySum = 0;
        for (int i = 0; i < Array.length; i++)
        {
            ArraySum += Array[i];
        }

        FoundAverage = ArraySum / Array.length;
        return FoundAverage;
    }

/*
Action: Finds and returns the total variance in an integer array
Parameters: int Array[], int Average
Returns: float FoundVariance
Precondition: Array is initialized / Array is of size > 0
*/

    static float FindVariance (int Array[], int Average)
    {
        float FoundValues = 0, FoundVariance;
        for (int i = 0; i < Array.length; i++)
        {
            FoundValues += (float)Math.pow((Array[i] - Average), 2);
        }

        FoundVariance = FoundValues / Array.length;
        return FoundVariance;
    }

}

/*
Array is as follows
45 87 70 83 95 

Average of all numbers is 76
The variance is 305.6

////

Array is as follows
16 99 23 7 58 

Average of all numbers is 40
The variance is 1151.8

////

Array is as follows
44 92 5 70 27 

Average of all numbers is 47
The variance is 945.4

////

Array is as follows
19 49 28 44 87 

Average of all numbers is 45
The variance is 549.2
*/