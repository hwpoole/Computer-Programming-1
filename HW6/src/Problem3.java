/*
Name: Hunter Poole
Date: 3/5/25
HW #: 6
Problem #: 3
Source Code: Problem3.java
Action: Takes two strings, outputs them in double quotes with their length.
        Combines strings, outputs combo and combo length.
        Outputs combo string in all caps.
        Finds # of capital letters in combo string and returns that number.
*/

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        String FirstString, SecondString, ComboString;
        int UppercaseCount = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter first string --> ");
        FirstString = Input.nextLine();

        System.out.print("Enter second string --> ");
        SecondString = Input.nextLine();

        ComboString = FirstString + " " + SecondString;

        System.out.printf("%n%s %8s \"%s\" %s %d %n", "String one", "-->", FirstString, "Length, ", FirstString.length());
        System.out.printf("%s %8s \"%s\" %s %d %n", "String two", "-->", SecondString, "Length, ", SecondString.length());
        System.out.printf("%s \"%s\" %s %d %n%n", "Strings combined-->", ComboString,"Length, ", ComboString.length());

        System.out.printf("%s \"%s\" %n", "String Upper Case --> ", ComboString.toUpperCase());

        for (int i = 0; i < ComboString.length(); i++)
        {
            if (Character.isUpperCase(ComboString.charAt(i)))
            {
                UppercaseCount++;
            }
        }

        System.out.printf("%s %d %s%n", "The final string has", UppercaseCount, "upper case letters");
    }
}

/*
Enter first string --> This
Enter second string --> is Fun!

String one      --> "This" Length,  4 
String two      --> "is Fun!" Length,  7 
Strings combined--> "This is Fun!" Length,  12 

String Upper Case -->  "THIS IS FUN!" 
The final string has 2 upper case letters

Enter first string --> Perfect
Enter second string --> teST C453_*

String one      --> "Perfect" Length,  7 
String two      --> "teST C453_*" Length,  11 
Strings combined--> "Perfect teST C453_*" Length,  19 

String Upper Case -->  "PERFECT TEST C453_*" 
The final string has 4 upper case letters

Enter first string --> STILL fun
Enter second string --> but not as much FUN

String one      --> "STILL fun" Length,  9 
String two      --> "but not as much FUN" Length,  19 
Strings combined--> "STILL fun but not as much FUN" Length,  29 

String Upper Case -->  "STILL FUN BUT NOT AS MUCH FUN" 
The final string has 8 upper case letters
 */