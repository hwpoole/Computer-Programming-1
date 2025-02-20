/*
Name: Hunter Poole
Date: 2/19/25
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
        float NumDrinks = 0, HoursDrinking = 0, WeightPounds = 0, BAC = 0, WeightGrams = 0, GramsAlcohol = 0, MetabolicRate = 0;
        String Gender = "";

        Scanner Input1 = new Scanner(System.in);
        System.out.print("Male or Female? ");
        Gender = Input1.next();

        Scanner Input2 = new Scanner(System.in);
        System.out.print("What is your body weight in pounds? ");
        WeightPounds = Input2.nextFloat();

        Scanner Input3 = new Scanner(System.in);
        System.out.print("How many drinks have you had? ");
        NumDrinks = Input3.nextFloat();

        Scanner Input4 = new Scanner(System.in);
        System.out.print("How many hours have you been drinking? ");
        HoursDrinking = Input4.nextFloat();

        
        GramsAlcohol = (NumDrinks * 14f);
        System.out.println("Grams " + GramsAlcohol);

        WeightGrams = (WeightPounds * 454f);
        System.out.println("Weight " + WeightGrams);

        float FirstDivision = GramsAlcohol / WeightGrams;
        System.out.println("Division " + FirstDivision);

        float MaleMultiply = FirstDivision * MALE;
        System.out.println("Male " + MaleMultiply);

        float X100 = MaleMultiply * 100;
        System.out.println("x100 " + X100);

        float Minus = MetabolicRate * HoursDrinking;
        System.out.println("Minus " + Minus);

        float Result = MaleMultiply - Minus;
        System.out.println("Result " + Result);

        BAC = ((GramsAlcohol) / (WeightGrams * MALE) * 100) - (MetabolicRate * HoursDrinking);
        System.out.println(BAC);

        /*if (Gender == "Male" || Gender == "M")
        {
            BAC = (((NumDrinks * 14) / ((Weight * 454) * MALE)) * 100) - (HoursDrinking * MetabolicRate);
        }
        else
        {
            BAC = (((NumDrinks * 14) / ((Weight * 454) * FEMALE)) * 100) - (HoursDrinking * MetabolicRate);
        }

        if (BAC == 0)
        {
            System.out.printf("%s %.3f, %s", "BAC =", 0.000, "You are just fine");
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
            */
    }
}

/*
 * 
 */