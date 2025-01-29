/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 2
Problem #: 5
Source File: Problem_5.java
Action: Given a year, determines if it is a leap year or not. Prints result.
*/

import java.util.Scanner;

public class Problem_5 {

    public static void main(String[] args) throws Exception {

        Scanner Year_Input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int Year = Year_Input.nextInt();

        while (Year <= 0){
            System.out.print("Please provide a year in A.D.: ");
            Year_Input.nextInt();
        }

        Year_Input.close();

        if (Year % 400 == 0) {
            System.out.println(Year + " is a leap year.");
        } else if (Year % 100 != 0 && Year % 4 == 0) {
            System.out.println(Year + " is a leap year.");
        } else {
            System.out.println(Year + " is not a leap year.");
        }
    }
}

/*
hunterpoole@Megs-MacBook-Pro HW2 %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetail
sInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Problem_5 

Please enter a year: 2000
2000 is a leap year.

hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_5 

Please enter a year: 2001
2001 is not a leap year.

hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_5 

Please enter a year: 1988
1988 is a leap year.

hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_5 

Please enter a year: 2031
2031 is not a leap year.

hunterpoole@Megs-MacBook-Pro HW2 % 
*/