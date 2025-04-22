/*
Name: Hunter Poole
Date: 4/21/25
HW #: 11
Problem #: 1
Source Code: Problem1.java
Action:
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
Action:
Parameters:
Returns:
Precondition:
*/

    static void FillTheArray (int Array[])
    {
        for (int i = 0; i < Array.length; i++)
        {
            Array[i] = (int)Math.round(Math.random() * 101);
        }
    }


/*
Action:
Parameters:
Returns:
Precondition:
*/

    static int FindAverage (int Array[])
    {
        int FoundAverage, ArraySum = 0;
        for (int i = 0; i < 5; i++)
        {
            ArraySum += Array[i];
        }

        FoundAverage = ArraySum / Array.length;
        return FoundAverage;
    }

/*
Action:
Parameters:
Returns:
Precondition:
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



Array is as follows
16 99 23 7 58 

Average of all numbers is 40
The variance is 1151.8



Array is as follows
44 92 5 70 27 

Average of all numbers is 47
The variance is 945.4



Array is as follows
19 49 28 44 87 

Average of all numbers is 45
The variance is 549.2
*/