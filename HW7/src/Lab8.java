/*
Name: Hunter Poole
Date: 3/17/25
Lab #: 8
Source Code: Lab8.java
Action: Asks for a sentence, then passes that sentence to a function.
        That function will count spaces, lower case chars, and vowel chars.
        Function will then print counts.
*/

import java.util.Scanner;

public class Lab8
{

/*
Action: Takes a string, counts spaces, lower case chars and vowel chars. Prints counts.
Parameters: String X
Returns: void
Precondition: A not-empty string needs to be provided.
*/

    static void StringPartsCalculator(String X)
    {
        int SpaceCount = 0, LowerCaseCount = 0, VowelCount = 0;
        String X_LowerCase;

        X_LowerCase = X.toLowerCase();

        for (int i = 0; i < X.length(); i++)
        {
            if (Character.isWhitespace(X.charAt(i)))
            {
                SpaceCount++;
            }

            if (Character.isLowerCase(X.charAt(i)))
            {
                LowerCaseCount++;
            }

            if (X_LowerCase.charAt(i) == 97 || X_LowerCase.charAt(i) == 101
                || X_LowerCase.charAt(i) == 105 || X_LowerCase.charAt(i) == 111
                || X_LowerCase.charAt(i) == 117)
            {
                VowelCount++;
            }
        }

        System.out.printf("%n%s %d %n%s %d %n%s %d%n","Vowels =", VowelCount,
                            "Spaces =", SpaceCount, "Lower case =", LowerCaseCount);
    }

    public static void main(String[] args)
    {
        String Sentence;

        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        Sentence = Input.nextLine();

        StringPartsCalculator(Sentence);
    }
}

/*
Please enter a sentence
This is a lovely Day.

Vowels = 6 
Spaces = 4 
Lower case = 14

Please enter a sentence
This is my TRULY unique test tExt! !! 

Vowels = 9 
Spaces = 7 
Lower case = 20
 */