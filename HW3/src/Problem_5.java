/*
Name: Hunter Poole
Date: 02/10/2025
Homework # : 3
Source File: Problem_5
Action: Given a whole number, displays multiples of 3 down to 3.
*/

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);
        System.out.print("Provide your number: ");
        int Num = Input.nextInt();

        for (int Multiples = Num; Multiples >= 3; Multiples--)
        {
            if ((Multiples % 3) == 0)
            {
                System.out.print(Multiples + " ");
            }
        }
        System.out.println();
    }
}

/*
Provide your number: 16
15 12 9 6 3 

Provide your number: 25
24 21 18 15 12 9 6 3 

Provide your number: 70
69 66 63 60 57 54 51 48 45 42 39 36 33 30 27 24 21 18 15 12 9 6 3 

PS C:\Users\hunte\Documents\GitHub\155-W3-H3> 
 */