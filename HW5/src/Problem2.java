/*
Name: Hunter Poole
Date: 2/24/25
HW #: 5
Problem #: 2
Source Code: Problem2.java
Action: Displays the first 40 fibonacci numbers in a table.
        Table to have 6 columns.
        Numbers in table have width of 10.
 */

public class Problem2
{
    public static void main(String[] args)
    {
        int i, Num1 = 0, Num2 = 1, Num3;

        System.out.printf("%-10d%-10d", Num1, Num2);
        
        for (i = 39; i > 0; i--)
        {
            Num3 = Num1 + Num2;
            System.out.printf("%-10d",Num3);
            Num1 = Num2;
            Num2 = Num3;

            if ((i + 1) % 6 == 1)
            {
                System.out.printf("%n");
            }
        }
    }
}

/*
0         1         1         2         3         5
8         13        21        34        55        89
144       233       377       610       987       1597
2584      4181      6765      10946     17711     28657
46368     75025     121393    196418    317811    514229
832040    1346269   2178309   3524578   5702887   9227465   
14930352  24157817  39088169  63245986  102334155
 */


/*
Chose to count Fibonacci number 0 as 0, 1 as 1, 2 as 1, 3 as 2, etc 
per https://planetmath.org/listoffibonaccinumbers
So, 102334155 is the 40th Fibonacci number with 0 and 1 counting as 0 and 1.

If wrong, update i = 39 --> i = 40
Will print 165580141 (#41) as the last number, satisfying 6 num per row requirement.
*/