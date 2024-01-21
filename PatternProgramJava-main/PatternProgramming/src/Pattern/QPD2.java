package Pattern;

public class QPD2
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 9;
        int star = 5 ;
        int space = 0;

        for (i = 0 ; i < line ; i++)
        {
            for (k=0 ; k<space; k++)
            {
                System.out.print(" ");
            }

            for (j = 0 ; j < star ; j++)
            {
               if ( i == 0 || j == 0 || j== star-1 || i == line-1)
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }

            }
            System.out.println();
            if (i < 4)
            {
                star--;
                space++;
            }
            else
            {
                star++;
                space--;
            }
        }
    }
}
