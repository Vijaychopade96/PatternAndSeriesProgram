package PatternProgramming;

public class Que55
{
    public static void main(String[] args)
    {
        int i,j;
        int line=9;
        int star=1;

        for (i=0;i<line;i++)
        {
            int num =1;
            for (j=0;j<star;j++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println();
            if (i<4)
                star++;
            else
                star--;

        }
    }
}
