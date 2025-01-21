import java.util.Scanner;

public class HW1P3_Code {
    public static void main(String[] args) throws Exception {
        Scanner seconds_input = new Scanner(System.in);
        System.out.println ("Enter the number of seconds: ");
        int seconds = seconds_input.nextInt();

        while (seconds <= 0) {
            System.out.println ("Please enter a positive number of seconds: ");
            seconds = seconds_input.nextInt();
        }
        seconds_input.close();
        
        int days = seconds / 86400;
        System.out.println ("Days: " + days);

        int days_remainder = seconds % 86400;
        int hours = days_remainder / 3600;
        System.out.println ("Hours: " + hours);

        int hours_remainder = days_remainder % 3600;
        int minutes = hours_remainder / 60;
        System.out.println ("Minutes: " + minutes);

        int minutes_remainder = hours_remainder % 60;
        int seconds_result = minutes_remainder;
        System.out.println ("Seconds: " + seconds_result);
    }
}
