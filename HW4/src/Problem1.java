/*
Name: Hunter Poole
Date: 2/20/25
HW #: 4
Problem #: 1
Source Code: Problem1.java
Action: For the grade and credit hours of two classes, provides a GPA and a status message.
 */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args)
    {
        final float A = 4.0f, B = 3.0f, C = 2.0f, D = 1.0f, F = 0.0f;
        float Grade1_Float = F, Grade2_Float = F, GPA;
        char Grade1_Ch, Grade2_Ch;
        int Credits1, Credits2;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter letter grade for first class --> ");
        Grade1_Ch = Input.next().charAt(0);

        System.out.print("Enter number of credit hours for first class --> ");
        Credits1 = Input.nextInt();

        System.out.println();

        System.out.print("Enter letter grade for second class --> ");
        Grade2_Ch = Input.next().charAt(0);

        System.out.print("Enter number of credit hours for second class --> ");
        Credits2 = Input.nextInt();

        System.out.println();

        switch (Grade1_Ch)
        {
            case 'A':
                Grade1_Float = A;
                break;
            case 'B':
                Grade1_Float = B;
                break;
            case 'C':
                Grade1_Float = C;
                break;
            case 'D':
                Grade1_Float = D;
                break;
            case 'F':
                Grade1_Float = F;
                break;
        }

        switch (Grade2_Ch)
        {
            case 'A':
                Grade2_Float = A;
                break;
            case 'B':
                Grade2_Float = B;
                break;
            case 'C':
                Grade2_Float = C;
                break;
            case 'D':
                Grade2_Float = D;
                break;
            case 'F':
                Grade2_Float = F;
                break;
        }

        GPA = ((Grade1_Float * Credits1) + (Grade2_Float * Credits2)) / (Credits1 + Credits2);

        System.out.printf("%s %3d %n", Grade1_Ch, Credits1);
        System.out.printf("%s %3d %n", Grade2_Ch, Credits2);
        System.out.printf("%s %.5f %n", "Your GPA = ", GPA);

        if (GPA >= 3.5)
        {
            System.out.print("Congratulations, doing good");
        }

        if (GPA < 2.0)
        {
            System.out.print("You are doing poorly");
        }
    }
}

/*
Enter letter grade for first class --> B
Enter number of credit hours for first class --> 3

Enter letter grade for second class --> C
Enter number of credit hours for second class --> 4

B   3 
C   4 
Your GPA =  2.42857 

Enter letter grade for first class --> B
Enter number of credit hours for first class --> 3

Enter letter grade for second class --> A
Enter number of credit hours for second class --> 4

B   3
A   4
Your GPA =  3.57143
Congratulations, doing good

Enter letter grade for first class --> D
Enter number of credit hours for first class --> 3

Enter letter grade for second class --> C
Enter number of credit hours for second class --> 3

D   3
C   3
Your GPA =  1.50000
You are doing poorly

    // Additional cases //
    // Test for F, not included above //

Enter letter grade for first class --> A
Enter number of credit hours for first class --> 5

Enter letter grade for second class --> F
Enter number of credit hours for second class --> 3

A   5
F   3
Your GPA =  2.50000
*/