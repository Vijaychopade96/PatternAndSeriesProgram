package Number;

import java.util.Scanner;

public class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to reverse");

        int num = sc.nextInt();

        while (num!=0)
        {
            int r = num % 10;
            System.out.print(r);
            num/=10;
        }
    }
}
