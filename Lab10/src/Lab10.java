/*
Name: Hunter Poole
Date: 4/8/25
Lab #: 10
Source Code: Lab10.java
Action: 
*/

import java.util.Scanner;

public class Lab10
{

/*
Action:
Parameters: int X, int Y
Returns: void (though it does print)
Precondition:
*/
    static void CompareNumbers (int X, int Y)
    {
        if (X == Y)
        {
            System.out.println("You picked the same number as the computer");
        }
        else
        {
            System.out.println("Your number is NOT the same as the computer");
        }
    }

    public static void main(String[] args)
    {
        int UserGuess, ComputerChoice;
        char Choice;

        Scanner Input = new Scanner(System.in);
        System.out.print("Start the game? Y/N --> ");
        Choice = Input.next().charAt(0);

        while (Choice != 'n' && Choice != 'N')
        {
            System.out.println();
            System.out.print("Pick a number, 1, 2, or 3 --> ");
            UserGuess = Input.nextInt();

            ComputerChoice = (int)(Math.random() * 3) + 1;
            CompareNumbers(UserGuess, ComputerChoice);

            System.out.println();
            System.out.print("Play again? Y/N --> ");
            Choice = Input.next().charAt(0);
        }
    }
}
