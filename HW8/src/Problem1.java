/*
Name: Hunter Poole
Date: 4/1/25
HW #: 8
Problem #: 1
Source Code: Problem3.java
Action:
*/

import java.util.Scanner;

public class Problem1
{

    /*
    Action:
    Parameters:
    Returns: 
    Precondition: 
    */

    static float FindMonthlyPayment(Float Principal, Float Yearly_Rate, int Years, int PaymentsPerYear)
    {
        float MonthlyPayment, Monthly_Rate, Dividend, Divisor;
        int Term;

        Yearly_Rate = Yearly_Rate / 100;
        Term = Years * PaymentsPerYear;
        Monthly_Rate = Yearly_Rate / 12;

        Dividend = (Monthly_Rate * (float)Math.pow((Monthly_Rate + 1), Term));
        Divisor = (float)Math.pow((1 + Monthly_Rate), Term) - 1;

        MonthlyPayment = Principal * (Dividend / Divisor);

        return MonthlyPayment;
    }

    /*
    Action:
    Parameters:
    Returns: 
    Precondition: 
    */

    static void Show_Table (Float Principal, Float Yearly_Rate, int Years, int PaymentsPerYear, int Term, Float MonthlyPayment)
    {
        System.out.printf("%n%s %11s%.2f %n%s %11.2f%s %n%s %8d %n%s %4d %n%s %6d %n%s %5s%.2f",
                            "Principal", "$", Principal, "Interest Rate", Yearly_Rate, "%", "No. of Years",
                            Years, "Payments per year", PaymentsPerYear, "No. of Payments", Term,
                            "Monthly Payment", "$", MonthlyPayment);
    }
    public static void main(String[] args)
    {
        Float Principal, Yearly_Rate, MonthlyPayment;
        int Years, PaymentsPerYear, NumberOfPayments, Term;

        Scanner Input = new Scanner(System.in);
        System.out.print("Principal: ");
        Principal = Input.nextFloat();

        System.out.print("Annual interest rate: ");
        Yearly_Rate = Input.nextFloat();

        System.out.print("Years of repayment: ");
        Years = Input.nextInt();

        System.out.print("Payments per year: ");
        PaymentsPerYear = Input.nextInt();

        Term = Years * PaymentsPerYear;

        MonthlyPayment = FindMonthlyPayment(Principal, Yearly_Rate, Years, PaymentsPerYear);
        Show_Table(Principal, Yearly_Rate, Years, PaymentsPerYear, Term, MonthlyPayment);

    }
}

/*
 * 
 */