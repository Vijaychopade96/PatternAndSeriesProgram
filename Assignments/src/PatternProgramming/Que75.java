package PatternProgramming;

public class Que75
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5;
        int star = 1;

        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            for (j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            star++;
        }
    }
}
