import java.util.Scanner;

public class HW1P1_Code {
    public static void main(String[] args) throws Exception {

        Scanner A1_input = new Scanner(System.in);
        System.out.println("Please provide your first angle: ");
        double A1 = A1_input.nextDouble();

        while (A1 <= 0 || A1 >= 180) {
            System.out.println("ERROR: PLease ensure your first angle is a positive number, and is less than 180 degrees.");
            System.out.println("Please provide your first angle: ");
            A1 = A1_input.nextDouble();
        }

        Scanner A2_input = new Scanner(System.in);
        System.out.println("Please provide your second angle: ");
        double A2 = A2_input.nextDouble();

        while (A2 <= 0 || A2 >= 180) {
            System.out.println("ERROR: Please ensure your second angle is a positive number, and is less than 180 degrees.");
            System.out.println("Please provide your second angle: ");
            A2 = A2_input.nextDouble();
        }

        while (A1 + A2 >= 180) {
            System.out.println("ERROR: Please ensure your first two angles do not add up to 180 degrees or more.");
            System.out.println("Please provide your second angle: ");
            A2 = A2_input.nextDouble();
        }

        A1_input.close();
        A2_input.close();

        double A3 = 180 - (A1 + A2);
        System.out.println("The third angle is " + A3 + " degrees.");

    }
}