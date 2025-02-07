
import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);
        System.out.print("Provide your number: ");
        int Num = Input.nextInt();

        for (int MultiplesOfThree = Num; MultiplesOfThree >= 3; MultiplesOfThree--)
        {
            if ((MultiplesOfThree % 3) == 0)
            {
                System.out.print(MultiplesOfThree + " ");
            }
        }
        System.out.println();
    }
}
