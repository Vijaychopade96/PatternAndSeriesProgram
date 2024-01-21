package PatternProgramming;

public class Que34
{
    public static void main(String[] args)
    {
        int i,j;
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
    }
}
