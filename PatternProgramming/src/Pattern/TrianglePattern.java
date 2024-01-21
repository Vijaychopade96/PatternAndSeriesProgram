package Pattern;

public class TrianglePattern
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 4;
        int star = 1;
        int space = 3;

        for (i = 0 ; i <line ; i++)
        {
            for (k = 0 ; k<space ; k++)
            {
                System.out.print("  ");
            }
            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" *  ");
            }
            System.out.println();
            star++;
            space--;
        }

    }
}
