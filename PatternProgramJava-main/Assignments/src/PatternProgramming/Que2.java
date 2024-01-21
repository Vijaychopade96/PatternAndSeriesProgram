package PatternProgramming;

public class Que2
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5;
        int star = 5;


        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print("*");

            }
            star--;
            System.out.println();

        }
    }
}
