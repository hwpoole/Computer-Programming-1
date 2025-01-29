import java.util.Scanner;

public class Problem_5 {

    public static void main(String[] args) throws Exception {

        Scanner Year_Input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int Year = Year_Input.nextInt();

        while (Year <= 0){
            System.out.print("Please provide a year in A.D.: ");
            Year_Input.nextInt();
        }

        Year_Input.close();

        if (Year % 400 == 0) {
            System.out.println(Year + " is a leap year.");
        } else if (Year % 100 != 0 && Year % 4 == 0) {
            System.out.println(Year + " is a leap year.");
        } else {
            System.out.println(Year + " is not a leap year.");
        }
    }
}
