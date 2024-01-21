package PatternProgramming;

public class Que20
{
    public static void main(String[] args)
    {
        int i,j,k,l,m;
        int line = 9;
        int star = 5;
        int space = 0;
        for (i = 0 ; i <line ; i++)
        {
            for (j = 0 ; j<star ; j++)
            {
                System.out.print("*");
            }
            for (k = 0 ; k<space ; k++)
            {
                System.out.print(" ");
            }
            for (l = 0 ; l<space ; l++)
            {
                System.out.print(" ");
            }
            for (m = 0 ; m<star ; m++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<4)
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
