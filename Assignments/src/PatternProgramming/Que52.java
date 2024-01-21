package PatternProgramming;

public class Que52
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line=9;
        int star=1;
        int space=8;
        int num=1;

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
            num++;
            star++;
            space--;

        }
    }
}
