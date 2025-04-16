/*
Name: Hunter Poole
Date: 4/16/25
HW #: 10
Problem #: 1
Source Code: Problem1.java
Action: Determines the count and percentage of heads or tails given 1000 coin flips.
        Takes no input. Calls a function "Flip" to flip each coin.
*/

public class Problem1
{

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

        HeadsPercentage = (HeadsCount / 1000f) * 100f;
        TailsPercentage = (TailsCount / 1000f) * 100f;

        System.out.printf("%s %d %.1f%s %n%s %d %.1f%s", "Heads =", HeadsCount, HeadsPercentage, "%",
                            "Tails =", TailsCount, TailsPercentage, "%");
    }

/*
Action: Flips a coin! Uses Math.random() and rounds to 0 or 1 using Math.round().
Parameters: N/A
Returns: int 0 for tails or 1 for heads.
Precondition: N/A
*/

    static int Flip()
    {
        int IsHeads;

        IsHeads = (int)Math.round(Math.random());

        return IsHeads;
    }

}

/*
Heads = 526 52.6% 
Tails = 474 47.4%

Heads = 497 49.7% 
Tails = 503 50.3%

Heads = 499 49.9% 
Tails = 501 50.1%

Heads = 497 49.7% 
Tails = 503 50.3%
 */