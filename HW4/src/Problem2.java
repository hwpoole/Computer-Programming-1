/*
Name: Hunter Poole
Date: 2/20/25
HW #: 4
Problem #: 2
Source Code: Problem2.java
Action: Given Gender, body weight in pounds, # of drinks consumed,
        and # of hours drinking, returns BAC and status message.
 */

 import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        final float MALE = 0.68f, FEMALE = 0.55f;
        float NumDrinks, HoursDrinking, WeightPounds, WeightGrams, GramsAlcohol, MetabolicRate, BAC = 0;
        String Gender = "";

        Scanner Input = new Scanner(System.in);
        System.out.print("Male or Female? ");
        Gender = Input.next();

        System.out.print("What is your body weight in pounds? ");
        WeightPounds = Input.nextFloat();

        System.out.print("How many drinks have you had? ");
        NumDrinks = Input.nextFloat();

        System.out.print("How many hours have you been drinking? ");
        HoursDrinking = Input.nextFloat();

        MetabolicRate = HoursDrinking * 0.015f;
        GramsAlcohol = NumDrinks * 14f;
        WeightGrams = WeightPounds * 454f;

        if (Gender.equals("Male") || Gender.equals("M"))
        {
            BAC = ((GramsAlcohol) / (WeightGrams * MALE) * 100) - (MetabolicRate);
        }
        if (Gender.equals("Female") || Gender.equals("F"))
        {
            BAC = ((GramsAlcohol) / (WeightGrams * FEMALE) * 100) - (MetabolicRate);
        }

        if (BAC == 0)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "You are just fine");
        }

        if (BAC > 0 && BAC <= 0.05)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "Feeling good");
        }

        if (BAC > 0.05 && BAC <= 0.2)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "Slurring speech, loss of balance");
        }

        if (BAC > 0.2 && BAC <= 0.249)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "Needs assistance in walking; total mental confusion");
        }

        if (BAC > 0.249 && BAC <= 0.399)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "Alcohol poisoning. Loss of consciousness");
        }

        if (BAC > 0.399)
        {
            System.out.printf("%s %.3f, %s", "BAC =", BAC, "Onset of coma, possible death due to respiratory arrest.");
        }        
    }
}

/* P.S., I'm not a big fan of these stacked if statements for each BAC bucket.
   Is there a better (simpler) way to do this? Didn't work w/switch statement when I tried it.
*/

/*
Male or Female? M
What is your body weight in pounds? 180
How many drinks have you had? 4
How many hours have you been drinking? 2
BAC = 0.071, Slurring speech, loss of balance

Male or Female? M
What is your body weight in pounds? 165
How many drinks have you had? 2
How many hours have you been drinking? 3
BAC = 0.010, Feeling good

Male or Female? F
What is your body weight in pounds? 120
How many drinks have you had? 8
How many hours have you been drinking? 2
BAC = 0.344, Alcohol poisoning. Loss of consciousness

Male or Female? M
What is your body weight in pounds? 210
How many drinks have you had? 6
How many hours have you been drinking? 3
BAC = 0.085, Slurring speech, loss of balance

    // Additional cases //
    // To cover all status messages //

Male or Female? M
What is your body weight in pounds? 172
How many drinks have you had? 10
How many hours have you been drinking? 2
BAC = 0.234, Needs assistance in walking; total mental confusion

Male or Female? F
What is your body weight in pounds? 135
How many drinks have you had? 15
How many hours have you been drinking? 1
BAC = 0.608, Onset of coma, possible death due to respiratory arrest.

Male or Female? F
What is your body weight in pounds? 94
How many drinks have you had? 0
How many hours have you been drinking? 0
BAC = 0.000, You are just fine
 */