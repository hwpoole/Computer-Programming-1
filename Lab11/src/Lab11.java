/*
Name: Hunter Poole
Date: 4/16/25
Lab #: 11
Source Code: Lab11.java
Action:
*/

import java.util.Scanner;

public class Lab11
{

    public static void main(String[] args)
    {
        String UserString;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter some sentence:");
        UserString = Input.nextLine();

        System.out.printf("%n%s %d %s %n%s %d %s %n%n%s %n%s", "Your sentence has", WordCount(UserString), "words.",
                            "And your sentence has", CharacterCount(UserString), "characters.", "Your sentence backwards is as follows: ",
                            ReverseString(UserString));

    }

/*
Action: Counts whitespaces in the provided string to determine the word count.
Parameters: String Input
Returns: int (WhiteSpaces + 1)
Precondition: String starts with a word, not a whitespace. Otherwise will count incorrectly.
                Presumes that in the provided string every whitespace is used to delimit words.
*/

    static int WordCount(String Input)
    {
        int WhiteSpaces = 0;
        for (int i = 0; i < Input.length(); i++)
        {
            if (Input.charAt(i) == 32)
            {
                ++WhiteSpaces;
            }
        }

        return (WhiteSpaces + 1);
    }

/*
Action: Counts characters in the provided string.
Parameters: String Input
Returns: int Characters
Precondition: N/A
*/

    static int CharacterCount(String Input)
    {
        int Characters = 0;
        for (int i = 0; i < Input.length(); i++)
        {
            ++Characters;
        }

        return Characters;
    }

/*
Action: Reverses the provided string.
Parameters: String Input
Returns: String Reverse
Precondition: N/A
*/

    static String ReverseString(String Input)
    {
        String Reverse = "";

        for (int i = Input.length() - 1; i > -1; i--)
        {
            Reverse += Input.charAt(i);
        }
        
        return Reverse;
    }

}

/*
Enter some sentence:
This is fun!

Your sentence has 3 words. 
And your sentence has 12 characters. 

Your sentence backwards is as follows:  
!nuf si sihT

Enter some sentence:
I love soup.

Your sentence has 3 words.
And your sentence has 12 characters.

Your sentence backwards is as follows:
.puos evol I

Enter some sentence:
go hang a salami! I'm a lasagna hog!

Your sentence has 8 words.
And your sentence has 36 characters.

Your sentence backwards is as follows:
!goh angasal a m'I !imalas a gnah og
*/

// Constraints tests //

/*
Rather long test case, for the sake of providing tested-output examples at the various edge-cases for this program, as required if an edge cas
e may exist within the program.

Your sentence has 29 words.
And your sentence has 173 characters.

Your sentence backwards is as follows:
.margorp eht nihtiw tsixe yam esac egde na fi deriuqer sa ,margorp siht rof sesac-egde suoirav eht ta selpmaxe tuptuo-detset gnidivorp fo ekas eht rof ,esac tset gnol rehtaR

Enter some sentence:


Your sentence has 1 words.
And your sentence has 0 characters.

Your sentence backwards is as follows:
*/