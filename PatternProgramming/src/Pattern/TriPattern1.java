package Pattern;

public class TriPattern1
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 4;
        int star = 1;
        int space = 3;
        char ch = 'A';
        for (i = 0 ; i <line ; i++)
        {
            for (k = 0 ; k<space ; k++)
            {
                System.out.print("  ");
            }
            for (j = 0 ; j<star ; j++)
            {
                if (i % 2 ==0)
                {
                    System.out.print(" "+ch+"  ");

                }
                else
                {
                    System.out.print(" *  ");
                }
            }
            System.out.println();
            if (i%2==0)
            ch++;
            star++;
            space--;
        }
    }
}
