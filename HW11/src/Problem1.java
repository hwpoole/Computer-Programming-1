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
        int[] MainArray = FillTheArray();

        System.out.println("Array is as follows");
        for (int i = 0; i < 5; i++)
        {
        System.out.print(MainArray[i] + " ");
        }

        Average = FindAverage(MainArray);
    }


/*
Action:
Parameters:
Returns:
Precondition:
*/

    static int[] FillTheArray ()
    {
        int[] FullArray = new int [5];
        for (int i = 0; i < 5; i++)
        {
            FullArray[i] = (int)Math.round(Math.random() * 101);
        }            
        return FullArray;
    }


/*
Action:
Parameters:
Returns:
Precondition:
*/

    static void FindAverage ()
    {

    }

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static void FindVariance (int Array[])
    {

    }

}

/*

*/