package PatternProgramming;

public class Que43
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line= 5;
        int star = 1;
        int space = 4;
        int num1=5;

        for (i=0;i<line;i++)
        {
            int num2=num1--;
            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print(" "+num2);
                num2++;
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
