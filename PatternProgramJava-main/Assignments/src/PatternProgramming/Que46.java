package PatternProgramming;

public class Que46
{
    public static void main(String[] args)
    {
        int i,j;
        int line= 9;
        int star = 1;
        int num1=1;
        for (i=0;i<line;i++)
        {

            for (j=0;j<star;j++)
            {
                System.out.print(num1);

            }
            System.out.println();
            star++;
            num1++;
        }
    }
}
