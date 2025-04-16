/*
Name: Hunter Poole
Date: 4/16/25
HW #: 10
Problem #: 1
Source Code: Problem1.java
Action:
*/

public class Problem1
{

/*
Action:
Parameters:
Returns:
Precondition:
*/

    static int Flip()
    {
        int IsHeads = -1;

       IsHeads = (int)Math.round(Math.random());

        return IsHeads;
    }

    public static void main(String[] args)
    {
        int FlipResult = -1, HeadsCount = 0, TailsCount = 0;
        float HeadsPercentage, TailsPercentage;

        for (int i = 0; i < 1000; i++)
        {
            FlipResult = Flip();

            if (FlipResult == 1)
            {
                ++HeadsCount;
            }
            else
            {
                ++TailsCount;
            }
        }

        HeadsPercentage = 1000 / HeadsCount;
        TailsPercentage = 1000 / TailsCount;

        System.out.printf("%s %d %f %n%s %d %f", "Heads =", HeadsCount, HeadsPercentage,
                            "Tails =", TailsCount, TailsPercentage);
    }
}

/*
 * 
 */