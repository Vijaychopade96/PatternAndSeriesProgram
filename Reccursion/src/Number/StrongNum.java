package Number;

import java.util.Scanner;

public class StrongNum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp=num;
        int sum = 0;

        while (num!=0)
        {
            int r = num%10;
            int fact = 1;
            for (int i = 1 ; i<=r ; i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        System.out.println(sum);
        if (temp==sum)
        {
            System.out.println("It is a Strong Number");
        }
        else
        {
            System.out.println("It is not a Strong Number");
        }
    }
}
