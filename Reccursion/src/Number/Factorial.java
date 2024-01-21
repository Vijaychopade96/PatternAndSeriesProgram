package Number;

import java.util.Scanner;

public class Factorial
{
    static int a;
    static long fact = 1;
    public static void factorial()
    {
        if (a>0)
        {
            fact *= a;
            a--;
            factorial();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        a = sc.nextInt();
        factorial();
        System.out.println("Factorial of given number is :"+fact);
    }
}
