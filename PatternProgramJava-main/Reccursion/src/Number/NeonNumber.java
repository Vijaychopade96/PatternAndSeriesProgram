package Number;

import java.util.Scanner;

public class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sq = num*num;
        int sum=0;

        while (sq!=0)
        {
            int r = sq %10;
            sum+=r;
            sq/=10;
        }
        System.out.println(sum);
        if (num==sum)
            System.out.println("It is a Neon Number");
        else
            System.out.println("It is not a Neon Number");
    }
}
