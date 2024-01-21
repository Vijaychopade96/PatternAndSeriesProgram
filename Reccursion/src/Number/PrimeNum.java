package Number;

import java.util.Scanner;

public class PrimeNum
{
    static boolean a =true;
    static int num;
    static int i = 2;
    public static void prime()
    {
       if (i<num)
       {
           if (num%i==0)
           {
               a=false;
           }
           else
           i++;
       }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find the factors");
        num=sc.nextInt();
        prime();
        if (a==true)
        {
            System.out.println("It is a prime Num");
        }
        else
            System.out.println("It is not a prime num");
    }
}
