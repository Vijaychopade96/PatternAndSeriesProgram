package Number;

import java.util.Scanner;

public class PalindromeNum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to reverse");

        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        while (n!=0)
        {
            int r = n % 10;
            rev = rev*10+r;
            n/=10;
        }
        System.out.println(rev);
        if (num==rev)
        {
            System.out.println("It is a Palindrome num "+ rev);
        }
        else
        {
            System.out.println("It is not a Palindrome Num");
        }
    }
}
