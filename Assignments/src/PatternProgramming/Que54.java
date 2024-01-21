package PatternProgramming;

public class Que54
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line=9;
        int star=9;
        int space=8;
        int num=9;

        for (i=0;i<line;i++)
        {

            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print(num+" ");

            }
            System.out.println();

            star--;
            space++;
            num--;
        }
    }
}
