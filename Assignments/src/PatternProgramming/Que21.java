package PatternProgramming;

public class Que21
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 5;
        int space = 4;

        for (i=0;i<line;i++)
        {
            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}
