package Pattern;

public class PlusPattern
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5;
        int star = 5 ;

        for (i=0 ; i<line ; i++)
        {
            for (j=0 ; j <star ; j++)
            {
                if (i==2 ||j==2)
                System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            System.out.println();

        }
    }
}
