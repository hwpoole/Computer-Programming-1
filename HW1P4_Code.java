import java.util.Scanner;

public class HW1P4_Code {
    public static void main(String[] args) throws Exception {

        Scanner num1_input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = num1_input.nextInt();
        
        Scanner num2_input = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int num2 = num2_input.nextInt();

        num1_input.close();
        num2_input.close();

        if (num1 > num2) {
            System.out.println("The two numbers are: " + num1 + ", " + num2);
        } else {
            System.out.println("The two numbers are: " + num2 + ", " + num1);
        }
    }
}