/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 2
Problem #: 5
Source File: Problem_5
Action: Given a year, determines if it is a leap year or not. Prints result.
*/

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int Year = Input.nextInt();

        if (Year % 400 == 0)
        {
            System.out.println(Year + " is a leap year.");
        } else if (Year % 100 != 0 && Year % 4 == 0) {
            System.out.println(Year + " is a leap year.");
        } else {
            System.out.println(Year + " is not a leap year.");
        }
    }
}

/*
Please enter a year: 2000
2000 is a leap year.

Please enter a year: 2001
2001 is not a leap year.

Please enter a year: 1988
1988 is a leap year.

Please enter a year: 2031
2031 is not a leap year.

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> 
*/