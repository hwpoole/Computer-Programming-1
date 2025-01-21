import java.util.Scanner;

public class HW1P5_Code {
    public static void main(String[] args) throws Exception {

    Scanner number_input = new Scanner(System.in);
    System.out.println("Enter a number below. Enter 0 to exit.");
    int number = number_input.nextInt();

    while (number != 0) {
        if (number > 100) {
            System.out.println("The number is greater than 100.");
            System.out.println("Enter a number: ");
            number = number_input.nextInt();
        } else if (number < 100) {
            System.out.println("The number is less than 100.");
            System.out.println("Enter a number: ");
            number = number_input.nextInt();
        }
        }
    if (number == 0) {
        System.out.println("Exit successful.");
        number_input.close();
    }
    }
}
