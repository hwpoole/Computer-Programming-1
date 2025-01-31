/*
Name: Hunter Poole
Date: 1/29/25
Homework #: 2
Problem #: 4
Source File: Problem_4.java
Action: Given a base salary, computes and outputs the retroactive pay increase for the previous six months, the new annual salary, and the new monthly salary.
*/

import java.util.Scanner; 

public class Problem_4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter employee's salary --> ");
        float Base_Annual_Salary = Input.nextFloat();

        float Retroactive_Pay = ((Base_Annual_Salary / 2) * 1.076f) - (Base_Annual_Salary / 2);
        System.out.println("Retroactive Pay --> $" + Retroactive_Pay);

        float Adjusted_Annual_Salary = Base_Annual_Salary * 1.076f;
        System.out.println("New Annual Salary --> $" + Adjusted_Annual_Salary);

        float Adjusted_Monthly_Salary = Adjusted_Annual_Salary / 12;
        System.out.println("New Monthly Salary --> $" + Adjusted_Monthly_Salary);
    }
}

/*
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>  & 'C:\Program Files\Java\jdk-23\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2\bin' 'Problem_4' 

Please enter employee's salary --> 35000
Retroactive Pay --> $1330.0
New Annual Salary --> $37660.0
New Monthly Salary --> $3138.3333

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> ^C
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> 
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>  c:; cd 'c:\Users\hunte\Documents\GitHub\155-W2-H2\HW2'; & 'C:\Program Files\Java\jdk-23\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2\bin' 'Problem_4' 

Please enter employee's salary --> 46500
Retroactive Pay --> $1767.0
New Annual Salary --> $50034.0
New Monthly Salary --> $4169.5

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> ^C
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>
PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2>  c:; cd 'c:\Users\hunte\Documents\GitHub\155-W2-H2\HW2'; & 'C:\Program Files\Java\jdk-23\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2\bin' 'Problem_4'        

Please enter employee's salary --> 52450
Retroactive Pay --> $1993.0996
New Annual Salary --> $56436.2
New Monthly Salary --> $4703.0166

PS C:\Users\hunte\Documents\GitHub\155-W2-H2\HW2> 
*/