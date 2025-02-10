
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
        MaxTax5p = 749.95f;
        Tax10p = IncomeAbove30 * 0.10f;

        if (Income <= 15000)
        {
            System.out.println("Net Income = $" + Income);
            System.out.println("State Tax = $0");
        }
        
        if (Income >= 15001 && Income <= 30000)
        {
            System.out.println("Net Income = $" + Income);
            System.out.println("State Tax = $" + Tax5p);
        }

        if (Income >= 30001)
        {
            System.out.println("Net Income = $" + Income);
            System.out.println("State Tax = $" + (MaxTax5p + Tax10p));
        }
    }
}
