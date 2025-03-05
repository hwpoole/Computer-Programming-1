public class Problem1
{
    public static void main(String[] args)
    {
        double Balance = 0.01;

        System.out.printf("%s %10s %n%s %13s %n%d %16.2f%n", "Day", "Amount",
                             "----", "----------", 1, Balance);

        for (int i = 2; i <= 30; i++)
        {
            Balance = Balance * 2.0;

            if (i < 10)
            {
                System.out.printf("%d %16.2f %n", i, Balance);
            }
            else
            {
                System.out.printf("%d %15.2f %n", i, Balance);
            }
            
        }
    }
}

/*
Day     Amount 
----    ---------- 
1             0.01
2             0.02 
3             0.04 
4             0.08 
5             0.16 
6             0.32 
7             0.64 
8             1.28 
9             2.56 
10            5.12 
11           10.24 
12           20.48 
13           40.96 
14           81.92 
15          163.84 
16          327.68 
17          655.36 
18         1310.72 
19         2621.44 
20         5242.88 
21        10485.76 
22        20971.52 
23        41943.04 
24        83886.08 
25       167772.16 
26       335544.32 
27       671088.64 
28      1342177.28 
29      2684354.56 
30      5368709.12 
 */
