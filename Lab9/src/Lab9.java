/*
Name: Hunter Poole
Date: 4/2/25
Lab #: 9
Source Code: Lab9.java
Action: 
*/

import java.util.Scanner;

public class Lab9 {

/*
Action: Finds and returns the largest of three ints.
Parameters: int X, Y, Z.
Returns: Either X Y or Z - largest of the three.
Precondition: Requires three integers of unequal size.
*/
    static int FindLargestOfThree (int X, int Y, int Z)
    {
        if (X > Y && X > Z)
        {
            return X;
        }
        else if (Y > X && Y > Z)
        {
            return Y;
        }
        else
        {
            return Z;
        }
    }
    public static void main(String[] args)
    {
        int FirstInt, SecondInt, ThirdInt, Largest;
        char Continue;

        do
        {
            Scanner Input = new Scanner(System.in);
            System.out.print("Please enter integer 1: ");
            FirstInt = Input.nextInt();
        
            System.out.print("Please enter integer 2: ");
            SecondInt= Input.nextInt();

            System.out.print("Please enter integer 3: ");
            ThirdInt = Input.nextInt();

            Largest = FindLargestOfThree(FirstInt, SecondInt, ThirdInt);

            System.out.println(Largest + " is the largest of the three");
            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);

        } while (Continue != 'N' || Continue != 'n');
    }
}

/*
 * 
 */