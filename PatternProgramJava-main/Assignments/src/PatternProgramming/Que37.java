package PatternProgramming;

public class Que37
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 6;
        int star = 1;
        char ch = 'A';

        for (i=0;i<line;i++)
        {
            char ch1 = ch++;
            for (j=0;j<star;j++)
            {
                System.out.print(ch1);
                ch1+=5;
            }
            System.out.println();
            star++;
        }
    }
}
