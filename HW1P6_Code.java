/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 1
Problem #: 6
Source File: HW1P6_Code
Action: Squares all numbers in range [2,10] and prints output.
*/

public class HW1P6_Code {
    public static void main(String[] args) throws Exception {

        for (Integer i = 2; i <= 10; i++ ) {
            int I_Squared = i * i;
            System.out.println(i + " <---> " + I_Squared);
        }
    }
}

/* I am using VSCode, output below is the full terminal output */

/*
hunterpoole@Megs-MacBook-Pro Documents %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptio
nMessages -cp /Users/hunterpoole/Library/Application\ Support/Code/User/workspaceStorage/aa4af2d5ea8777f0c20fee4aa25f3c30/redhat.java/jdt_ws/Documents_5c3529
dc/bin HW1P6_Code

2 <---> 4
3 <---> 9
4 <---> 16
5 <---> 25
6 <---> 36
7 <---> 49
8 <---> 64
9 <---> 81
10 <---> 100

hunterpoole@Megs-MacBook-Pro Documents %
*/