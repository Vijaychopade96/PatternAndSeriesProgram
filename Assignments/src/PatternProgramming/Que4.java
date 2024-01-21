package PatternProgramming;

public class Que4
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 9;
        int star = 1;

        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i<4)
                star++;
            else
                star--;
        }
    }
}
