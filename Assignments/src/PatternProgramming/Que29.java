package PatternProgramming;

public class Que29
{
    public static void main(String[] args)
    {
        int i,j,k,l;
        int line = 6;
        int star = 6;
        for (i=0;i<line;i++)
        {
            char ch = 'A';
            for (j=0;j<star;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            star--;
        }
        for (k=0;k<line;i++)
        {
            star++;
            if (star>6)
            {
                return;
            }
            char ch1 = 'A';
            for (l=0;l<star;l++)
            {
                System.out.print(ch1);
                ch1++;
            }
            System.out.println();

        }
    }
}
