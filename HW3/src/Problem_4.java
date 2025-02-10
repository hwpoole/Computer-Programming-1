
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args)
    {
        float Income, IncomeAbove30, Tax5p, MaxTax5p, Tax10p;

        Income = 0;
        IncomeAbove30 = Income - 30000f;
        Tax5p = Income * 0.05f;
        MaxTax5p = 749.95f;
        Tax10p = IncomeAbove30 * 0.10f;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the person's net income --> ");
        Income = Input.nextFloat();

        if (Income <= 15000)
        {
            System.out.print("Net Income = $" + Income);
            System.out.println("State Tax = $0");
        }
        
        if (Income >= 15001 && Income <= 30000)
        {
            System.out.print("Net Income = $" + Income);
            System.out.println("State Tax = $" + Tax5p);
        }

        if (Income > 30000)
        {
            System.out.print("Net Income = $" + Income);
            System.out.println("State Tax = $" + (MaxTax5p + Tax10p));
        }
    }
}
