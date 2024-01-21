package PatternProgramming;

public class Que28
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 9;
        int star = 1;

        for (i=0;i<line;i++)
        {
            char ch = 'A';
            for (j=0;j<star;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            if (i<4)
                star++;
            else
                star--;

        }
    }
}
