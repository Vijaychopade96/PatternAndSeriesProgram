package Pattern;

public class TriPattern2
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
                System.out.print(" "+ch+"  ");
            }
            System.out.println();
            star++;
            space--;
            ch++;
        }
    }
}
