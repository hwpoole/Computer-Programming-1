/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 2
Problem #: 6
Source File: Problem_6.java
Action: Given a series of numbers, return how many of them are even. Exit program when "0" is entered.
*/

import java.util.Scanner;

public class Problem_6 {

    public static void main(String[] args) throws Exception {

        Scanner Number_Input = new Scanner(System.in);
        System.out.print("Please provide your numbers one at a time. Enter 0 to exit: ");
        int Provided_Number = Number_Input.nextInt();

        int Even_Count = 0;

        while (Provided_Number != 0) {
            if (Provided_Number != 0 && Provided_Number % 2 == 0){
                Even_Count++;
            }
            System.out.print("Next number. Enter 0 to exit: ");
            Provided_Number = Number_Input.nextInt();
        }
        if (Provided_Number == 0){
            System.out.print("You have entered " + Even_Count + " even numbers.");
            Number_Input.close();
        }

    }
}

/*
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>  & 'C:\Program Files\Java\jdk-23\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2\bin' 'Problem_6' 

Please provide your numbers one at a time. Enter 0 to exit: 3
Next number. Enter 0 to exit: 56
Next number. Enter 0 to exit: 4
Next number. Enter 0 to exit: 13
Next number. Enter 0 to exit: 779
Next number. Enter 0 to exit: 46
Next number. Enter 0 to exit: 0
You have entered 3 even numbers.

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> ^C
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> 
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>  c:; cd 'c:\Users\hunte\Documents\GitHub\155-W2-H2\HW2'; & 'C:\Program Files\Java\jdk-23\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2\bin' 'Problem_6'

Please provide your numbers one at a time. Enter 0 to exit: 4
Next number. Enter 0 to exit: 905775
Next number. Enter 0 to exit: 13
Next number. Enter 0 to exit: 777
Next number. Enter 0 to exit: 346
Next number. Enter 0 to exit: 42
Next number. Enter 0 to exit: 12
Next number. Enter 0 to exit: 0
You have entered 4 even numbers.

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>
*/