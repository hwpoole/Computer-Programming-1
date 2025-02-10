
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
