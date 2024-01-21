package PatternProgramming;

public class Que104
{
    public static void main(String[] args)
    {
        int i,j;
        int line=5;
        int star=5;

        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                if (j%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
