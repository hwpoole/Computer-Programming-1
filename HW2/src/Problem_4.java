/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 2
Problem #: 4
Source File: Problem_4.java
Action: Given a base salary, computes and outputs the retroactive pay increase for the previous six months,
        the new annual salary, and the new monthly salary.
*/

import java.util.Scanner; 

public class Problem_4 {
    public static void main(String[] args) throws Exception {

        Scanner Base_Annual_Salary_Input = new Scanner(System.in);
        System.out.print("Please enter employee's salary --> ");
        float Base_Annual_Salary = Base_Annual_Salary_Input.nextFloat();
        Base_Annual_Salary_Input.close();

        float Retroactive_Pay = ((Base_Annual_Salary / 2) * 1.076f) - (Base_Annual_Salary / 2);
        System.out.println("Retroactive Pay --> $" + Retroactive_Pay);

        float Adjusted_Annual_Salary = Base_Annual_Salary * 1.076f;
        System.out.println("New Annual Salary --> $" + Adjusted_Annual_Salary);

        float Adjusted_Monthly_Salary = Adjusted_Annual_Salary / 12;
        System.out.println("New Monthly Salary --> $" + Adjusted_Monthly_Salary);
    }
}

/*
hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_4 

Please enter employee's salary --> 35000
Retroactive Pay --> $1330.0
New Annual Salary --> $37660.0

New Monthly Salary --> $3138.3333
hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_4 

Please enter employee's salary --> 46500
Retroactive Pay --> $1767.0
New Annual Salary --> $50034.0
New Monthly Salary --> $4169.5

hunterpoole@Megs-MacBook-Pro HW2 %  cd /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/te
murin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/hunterpoole/Documents/GitHub/155-W2-H2/HW2/bin Proble
m_4 

Please enter employee's salary --> 52450
Retroactive Pay --> $1993.0996
New Annual Salary --> $56436.2
New Monthly Salary --> $4703.0166

hunterpoole@Megs-MacBook-Pro HW2 % 
*/