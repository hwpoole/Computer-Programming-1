/*
Name: Hunter Poole
Date: 4/2/25
Lab #: 9
Source Code: Lab9.java
Action: Collects 3 numbers. Passes those three to a function
        that determines which one is the largest. Prints which
        one is the largest.
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

            System.out.printf("%d %s%n%n", Largest, "is the largest of the three");
            System.out.print("Continue? Y or N: ");
            Continue = Input.next().charAt(0);

        } while (Continue != 'N' && Continue != 'n');
    }
}

/*
Please enter integer 1: 5
Please enter integer 2: 4
Please enter integer 3: 1
5 is the largest of the three

Continue? Y or N: Y
Please enter integer 1: 18
Please enter integer 2: 44
Please enter integer 3: 27
44 is the largest of the three

Continue? Y or N: Y
Please enter integer 1: 101
Please enter integer 2: 100
Please enter integer 3: 102 
102 is the largest of the three

Continue? Y or N: Y
Please enter integer 1: 100
Please enter integer 2: 100
Please enter integer 3: 100
100 is the largest of the three

Continue? Y or N: N
 */