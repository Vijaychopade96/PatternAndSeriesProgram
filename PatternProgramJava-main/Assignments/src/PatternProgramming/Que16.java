package PatternProgramming;

public class Que16
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 9;
        int star = 9;
        int space = 0;
        for (i=0 ; i<line ; i++)
        {
            for (k=0 ; k<space ; k++)
            {
                System.out.print(" ");
            }
            for (j=0 ; j<star ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<4)
            {
                space++;
                star-=2;
            }
            else
            {
                space--;
                star+=2;
            }
        }
    }
}
