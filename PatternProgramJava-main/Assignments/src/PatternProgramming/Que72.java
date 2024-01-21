package PatternProgramming;

public class Que72
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space=4;

        for (i=0;i<line;i++)
        {
            int num=0;
            for (k=0;k<space;k++)
            {
                System.out.print("  ");
            }
            for (j=0;j<star;j++)
            {
                if (i>=j)
                    num++;
                else
                    num--;
                System.out.print(num+" ");
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
}
