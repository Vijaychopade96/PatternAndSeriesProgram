package PatternProgramming;

public class Que30
{
    public static void main(String[] args)
    {
        int i,j,k,l;
        int line = 6;
        int star = 6;
        char ch = 'F';
        for (i=0;i<line;i++)
        {
            char ch1 = ch--;
            for (j=0;j<star;j++)
            {
                System.out.print(ch1);
                ch1--;
            }
            System.out.println();
            star--;
        }
        char ch1 = 'A';
        for (k=0;k<line;k++)
        {
            star++;
            char ch2 = ch1++;
            for (l=0;l<star;l++)
            {
                System.out.print(ch2);
                ch2--;
            }
            System.out.println();
        }
    }
}
