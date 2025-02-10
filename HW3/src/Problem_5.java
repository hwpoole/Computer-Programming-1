
import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);
        System.out.print("Provide your number: ");
        int Num = Input.nextInt();

        for (int Multiples = Num; Multiples >= 3; Multiples--)
        {
            if ((Multiples % 3) == 0)
            {
                System.out.print(Multiples + " ");
            }
        }
        System.out.println();
    }
}
