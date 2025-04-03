/*
Name: Hunter Poole
Date: 4/2/25
HW #: 8
Problem #: 1
Source Code: Problem3.java
Action: Finds and displays the monthly payment and loan term in months
        in a table. Needs the principal, yearly interest rate, years of
        repayment, and payments per year from user. Calls two functions
        to outsource math and display of table.
*/

import java.util.Scanner;

public class Problem1
{

    /*
    Action: Finds the monthly payment given a principal, yearly interest rate,
            years of repayment, and expected payments per year
    Parameters: float Principal, float AnnualInterestRate, int Years, int PaymentsPerYear
    Returns: float MonthlyPayment - the monthly payment amount
    Precondition: Requires a > 0 quantity for each input
    */

    static float FindMonthlyPayment(float Principal, float AnnualInterestRate, int Years,
                                    int PaymentsPerYear, int Term)
    {
        float MonthlyPayment, MonthlyInterestRate, Dividend, Divisor;

        AnnualInterestRate = AnnualInterestRate / 100;
        MonthlyInterestRate = AnnualInterestRate / 12;

        Dividend = (MonthlyInterestRate * (float)Math.pow((MonthlyInterestRate + 1), Term));
        Divisor = (float)Math.pow((1 + MonthlyInterestRate), Term) - 1;

        MonthlyPayment = Principal * (Dividend / Divisor);

        return MonthlyPayment;
    }

    /*
    Action: Shows a table of values for Principal, Interest Rate, No. of Years,
            Payments per year, No. of Payments, and Monthly Payment
    Parameters: float Principal, float AnnualInterestRate, int Years, int PaymentsPerYear, int Term,
                float MonthlyPayment
    Returns: None
    Precondition: Needs float, float, int, int, int, float
    */

    static void Show_Table (float Principal, float AnnualInterestRate, int Years,
                            int PaymentsPerYear, int Term, float MonthlyPayment)
    {
        System.out.printf("%n%-19s %s%.2f %n%-19s %.2f%s %n%-19s %d %n%-19s %d %n%-19s %d %n%-19s %s%.2f %n%n",
                        "Principal", "$", Principal, "Interest Rate", AnnualInterestRate, "%",
                        "No. of Years", Years, "Payments per year", PaymentsPerYear,
                        "No. of Payments", Term, "Monthly Payment", "$", MonthlyPayment);
    }

    public static void main(String[] args)
    {
        float Principal, AnnualInterestRate, MonthlyPayment;
        int Years, PaymentsPerYear, Term;
        char Continue;

        do
        {

        Scanner Input = new Scanner(System.in);
        System.out.print("Principal: ");
        Principal = Input.nextFloat();

        System.out.print("Annual interest rate: ");
        AnnualInterestRate = Input.nextFloat();

        System.out.print("Years of repayment: ");
        Years = Input.nextInt();

        System.out.print("Payments per year: ");
        PaymentsPerYear = Input.nextInt();

        Term = Years * PaymentsPerYear;

        MonthlyPayment = FindMonthlyPayment(Principal, AnnualInterestRate, Years,
                                            PaymentsPerYear, Term);
        Show_Table(Principal, AnnualInterestRate, Years, PaymentsPerYear, Term, MonthlyPayment);

        System.out.print("Continue? Y or N: ");
        Continue = Input.next().charAt(0);

        } while (Continue == 'Y');

    }
}

/*
Principal: 11000
Annual interest rate: 10
Years of repayment: 4
Payments per year: 12

Principal           $11000.00 
Interest Rate       10.00% 
No. of Years        4 
Payments per year   12 
No. of Payments     48 
Monthly Payment     $278.99

Continue? Y or N: Y
Principal: 15500
Annual interest rate: 5.70
Years of repayment: 5
Payments per year: 12

Principal           $15500.00
Interest Rate       5.70%
No. of Years        5
Payments per year   12
No. of Payments     60
Monthly Payment     $297.50

Continue? Y or N: Y
Principal: 115000
Annual interest rate: 7.75
Years of repayment: 30
Payments per year: 12

Principal           $115000.00
Interest Rate       7.75%
No. of Years        30
Payments per year   12
No. of Payments     360
Monthly Payment     $823.88

Continue? Y or N: Y
Principal: 36418
Annual interest rate: 3.68
Years of repayment: 15
Payments per year: 12

Principal           $36418.00
Interest Rate       3.68%
No. of Years        15
Payments per year   12
No. of Payments     180
Monthly Payment     $263.58

Continue? Y or N: N
 */