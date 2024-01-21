package PatternProgramming;

public class Que50
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line=7;
        int star=10;

        for (i=0;i<line;i++)
        {
            int num=0;
            for (j=0;j<star;j++)
            {
                for (k=0;k<3;k++)
                {
                    System.out.print(num);
                }
                num++;
            }
            System.out.println();
        }
    }
}
