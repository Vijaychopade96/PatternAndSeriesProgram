package Number;

public class PalindromeAdv
{
    public static void main(String[] args)
    {

        for (int i = 100 ; i<10000 ; i++ )
        {
            int num = i;
            int rev = 0 ;
            int temp = num;
            while (num != 0)
            {
                int r = num % 10;
                rev = rev * 10 + r;
                num /= 10;

            }
            if (temp==rev)
            {
                System.out.println(rev);
            }
        }

    }
}
