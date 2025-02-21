/*
Name: Hunter Poole
Date: 2/20/25
HW #: 4
Problem #: 3
Source Code: Problem3.java
Action: Given a number 1 - 7, returns the current day for that number.
        Sunday is 1.
        Display error message and exit if number is not in range (1, 7)
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args)
    {
        int Day = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number ");
        Day = Input.nextInt();

        if (Day < 1 || Day > 7)
        {
            System.out.println("Error: Please enter a number 1 - 7");
            System.exit(0);
        }

        switch (Day)
        {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
        }
    }
}

/*
Enter a number 1
Today is Sunday

Enter a number 2
Today is Monday

Enter a number 3
Today is Tuesday

Enter a number 4
Today is Wednesday

Enter a number 5
Today is Thursday

Enter a number 6
Today is Friday

Enter a number 7
Today is Saturday

    // Additional cases //

Enter a number 0
Error: Please enter a number 1 - 7

Enter a number 8
Error: Please enter a number 1 - 7
*/