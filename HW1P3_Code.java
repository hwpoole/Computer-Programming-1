import java.util.Scanner;

public class HW1P3_Code {
    public static void main(String[] args) throws Exception {

        Scanner Seconds_Input = new Scanner(System.in);
        System.out.println ("Enter the number of seconds: ");
        int Seconds = Seconds_Input.nextInt();

        while (Seconds <= 0) {
            System.out.println ("Please enter a positive number of seconds: ");
            Seconds = Seconds_Input.nextInt();
        }
        
        Seconds_Input.close();
        
        int Days_Result = Seconds / 86400;
        System.out.println ("Days: " + Days_Result);

        int Days_Remainder = Seconds % 86400;
        int Hours_Result = Days_Remainder / 3600;
        System.out.println ("Hours: " + Hours_Result);

        int Hours_Remainder = Days_Remainder % 3600;
        int Minutes_Result = Hours_Remainder / 60;
        System.out.println ("Minutes: " + Minutes_Result);

        int Minutes_Remainder = Hours_Remainder % 60;
        int Seconds_Result = Minutes_Remainder;
        System.out.println ("Seconds: " + Seconds_Result);
    }
}
