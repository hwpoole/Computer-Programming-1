/*
Name: Hunter Poole
Date: 2/18/25
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
        float Grade1_Float = 0.0f, Grade2_Float = 0.0f, GPA = 0.0f;
        String Grade1_String = "F", Grade2_String = "F";
        int Credits1 = 0, Credits2 = 0;

        Scanner Input1 = new Scanner(System.in);
        System.out.print("Enter letter grade for first class --> ");
        Grade1_String = Input1.next();

        Scanner Input2 = new Scanner(System.in);
        System.out.print("Enter number of credit hours for first class --> ");
        Credits1 = Input2.nextInt();
        System.out.println();

        Scanner Input3 = new Scanner(System.in);
        System.out.print("Enter letter grade for second class --> ");
        Grade2_String = Input3.next();

        Scanner Input4 = new Scanner(System.in);
        System.out.print("Enter number of credit hours for second class --> ");
        Credits2 = Input4.nextInt();
        System.out.println();

        switch (Grade1_String)
        {
            case "A":
                Grade1_Float = A;
                break;
            case "B":
                Grade1_Float = B;
                break;
            case "C":
                Grade1_Float = C;
                break;
            case "D":
                Grade1_Float = D;
                break;
            case "F":
                Grade1_Float = F;
                break;
        }

        switch (Grade2_String)
        {
            case "A":
                Grade2_Float = A;
                break;
            case "B":
                Grade2_Float = B;
                break;
            case "C":
                Grade2_Float = C;
                break;
            case "D":
                Grade2_Float = D;
                break;
            case "F":
                Grade2_Float = F;
                break;
        }

        GPA = ((Grade1_Float * Credits1) + (Grade2_Float * Credits2)) / (Credits1 + Credits2);

        System.out.printf("%s %3d %n", Grade1_String, Credits1);
        System.out.printf("%s %3d %n", Grade2_String, Credits2);
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

Enter letter grade for first class --> A
Enter number of credit hours for first class --> 5

Enter letter grade for second class --> F
Enter number of credit hours for second class --> 3

A   5
F   3
Your GPA =  2.50000
*/