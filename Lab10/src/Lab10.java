/*
Name: Hunter Poole
Date: 4/8/25
Lab #: 10
Source Code: Lab10.java
Action: Plays a guessing game between user and computer.
        Both parties will pick a number 1, 2, or 3.
        Calls a function to check if the numbers are equal and display result.
*/

import java.util.Scanner;

public class Lab10
{

/*
Action: Determines if user guess matches the computers choice of number.
Parameters: int X, int Y
Returns: Prints if user guess was the same or NOT the same as computer's number.
Precondition: none
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
/*
Start the game? Y/N --> Y

Pick a number, 1, 2, or 3 --> 1
Your number is NOT the same as the computer

Play again? Y/N --> Y

Pick a number, 1, 2, or 3 --> 1
Your number is NOT the same as the computer

Play again? Y/N --> Y

Pick a number, 1, 2, or 3 --> 1
Your number is NOT the same as the computer

Play again? Y/N --> Y

Pick a number, 1, 2, or 3 --> 1
Your number is NOT the same as the computer

Play again? Y/N --> Y

Pick a number, 1, 2, or 3 --> 1
You picked the same number as the computer

Play again? Y/N --> N
 */

//Limitation tests:

/*
Start the game? Y/N --> z

Pick a number, 1, 2, or 3 --> 48
Your number is NOT the same as the computer

Play again? Y/N --> J

Pick a number, 1, 2, or 3 --> 17
Your number is NOT the same as the computer

Play again? Y/N --> n
 */