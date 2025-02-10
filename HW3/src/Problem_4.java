/*
Name: Hunter Poole
Date: 02/10/2025
Homework # : 3
Source File: Problem_4
Action: Given an income, assess state taxes on the following brackets:
            0% for $0 - 15000
            5% for $15001 - 30000
            10% for $30000 +
        Return the following:
        Net Income = [Income]
        State Tax = [Taxes]
 */


import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args)
    {
        float Income, IncomeAbove15, IncomeAbove30, Tax5p, MaxTax5p, Tax10p;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the person's net income --> ");
        Income = Input.nextFloat();

        IncomeAbove15 = Income - 15000f;
        IncomeAbove30 = Income - 30000f;
        Tax5p = IncomeAbove15 * 0.05f;
        MaxTax5p = 750f;
        Tax10p = IncomeAbove30 * 0.10f;

        if (Income <= 15000)
        {
            System.out.printf("%s%.2f %n%s%.2f %n", "Net Income = $",
                                Income, "State Tax = $", 0f);
        }
        
        if (Income >= 15001 && Income <= 30000)
        {
            System.out.printf("%s%.2f %n%s%.2f %n", "Net Income = $",
                                Income, "State Tax = $", Tax5p);
        }

        if (Income >= 30001)
        {
            System.out.printf("%s%.2f %n%s%.2f %n", "Net Income = $",
                                Income, "State Tax = $", (MaxTax5p + Tax10p));
        }
    }
}

/*
Please enter the person's net income --> 24500
Net Income = $24500.00 
State Tax = $475.00 

Please enter the person's net income --> 40000
Net Income = $40000.00 
State Tax = $1750.00 

Please enter the person's net income --> 28275
Net Income = $28275.00 
State Tax = $663.75 

Please enter the person's net income --> 12500
Net Income = $12500.00 
State Tax = $0.00 

hunterpoole@megs-mbp Documents % 
 */
