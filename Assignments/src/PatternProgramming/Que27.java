package PatternProgramming;

public class Que27
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 9;
        int star = 1;
        char ch = 'A';
        for (i=0;i<line;i++)
        {
            for (j=0;j<star;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            if (i<4)
            {
                star++;
                ch++;
            }
            else
            {
                star--;
                ch--;
            }
        }
    }
}
