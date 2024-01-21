package PatternProgramming;

public class Que26
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5;
        int star = 1;
        char ch = 'A';
        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            star++;
            ch++;
        }
    }
}
