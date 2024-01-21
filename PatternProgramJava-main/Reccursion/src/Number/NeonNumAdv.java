package Number;

public class NeonNumAdv
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 5; i < 100; i++)
        {
            int num = i;
            int sq = num * num;
            int sum = 0;

            while (sq != 0)
            {
                int r = sq % 10;
                sum += r;
                sq /= 10;
            }
            if (num == sum)
            {
                System.out.println(num);
                count++;
            }
        }
        System.out.println(count);
    }
}
