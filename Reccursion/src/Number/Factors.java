package Number;

import java.util.Scanner;

public class Factors
{
    static int num;
    static int i = 1;
    public static void factors()
    {
        if (i<=num)
        {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
            factors();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find the factors");
        num=sc.nextInt();
       factors();
    }
}
