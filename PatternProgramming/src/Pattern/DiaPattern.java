package Pattern;

public class DiaPattern
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 10;
        int star = 5 ;

        for (i = 0 ; i < line ; i++)
        {

            for (j = 0 ; j < star ; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            if (i < 4)
            {
                star--;
            }
            else
            {
                star++;
            }
        }
    }
}
