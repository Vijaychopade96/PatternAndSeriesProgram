package PatternProgramming;

public class Que57
{
    public static void main(String[] args)
    {
        int i,j;
        int line=5;
        int star=1;
        int num=1;

        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
            star++;
        }
    }
}
