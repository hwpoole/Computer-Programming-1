/*
Name: Hunter Poole
Date: 2/24/25
HW #: 5
Problem #: 1
Source Code: Problem1.java
Action: Takes a single char, returns char, ASCII value,
        and next two characters. Runs in a loop.
        Counts # of uppercase, lowercase, digits, and
        other characters entered. '#' to exit.
        Displays a table for counts of char types at exit.
 */

import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        char Ch, NextCh, NextCh2;
        int Ch_Value, Uppercase = 0, Lowercase = 0, Digit = 0, Other = 0;

        Scanner Input = new Scanner(System.in);

        do
        {       
            System.out.print("Please enter your character ---> ");
            Ch = Input.next().charAt(0);
            Ch_Value = Ch;
            
            if (Ch != '#')
            {
            System.out.printf("%n%s %c %n%s %c %s %d %n","You entered", Ch, "The ASCII value of",
            Ch, "is", Ch_Value);

            NextCh = Ch;
            NextCh2 = ++NextCh;
            
            System.out.printf("%s %c %s %c %n%n", "The next two characters are:", NextCh++,
                            "and", ++NextCh2);
            }

            if (Character.isUpperCase(Ch))
            {
                Uppercase++;
            }
            else if (Character.isLowerCase(Ch))
            {
                Lowercase++;
            }
            else if (Character.isDigit(Ch))
            {
                Digit++;
            }
            else if (Ch != '#')
            {
                Other++;
            }   
            
        }while (Ch != '#');

        System.out.printf("%n%s %d %n%s %d %n%s %d %n%s %d", "Number of uppercase--------->", Uppercase,
                            "Number of lowercase--------->", Lowercase, "Number of numbers----------->", Digit,
                            "Number of other characters-->", Other);
    }
}

/*
Please enter your character ---> A

You entered A 
The ASCII value of A is 65 
The next two characters are: B and C 

Please enter your character ---> v

You entered v 
The ASCII value of v is 118 
The next two characters are: w and x 

Please enter your character ---> 5

You entered 5
The ASCII value of 5 is 53
The next two characters are: 6 and 7

Please enter your character ---> @

You entered @
The ASCII value of @ is 64
The next two characters are: A and B

Please enter your character ---> (

You entered (
The ASCII value of ( is 40
The next two characters are: ) and *

Please enter your character ---> #

Number of uppercase---------> 1
Number of lowercase---------> 1
Number of numbers-----------> 1
Number of other characters--> 2

    ////// Extremes \\\\\\

Please enter your character ---> !

You entered !
The ASCII value of ! is 33
The next two characters are: " and #

Please enter your character ---> ~

You entered ~
The ASCII value of ~ is 126
The next two characters are:  and ?

Please enter your character ---> #

Number of uppercase---------> 0
Number of lowercase---------> 0
Number of numbers-----------> 0
Number of other characters--> 2
 */