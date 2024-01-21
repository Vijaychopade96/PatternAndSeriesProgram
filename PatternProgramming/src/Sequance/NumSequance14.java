package Sequance;

public class NumSequance14
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space = 4;
        for (i = 0 ; i<line ; i++)
        {
            for (k = 0 ; k<space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j<star ; j++)
            {
                if (i % 2 == 0)
                {
                    System.out.print(" 0 ");
                }
                else
                {
                    System.out.print(" 1 ");
                }

            }
            System.out.println();
            space--;
            star++;
        }
    }
}
