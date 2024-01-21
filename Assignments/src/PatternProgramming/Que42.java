package PatternProgramming;

public class Que42
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 5;
        int space = 0;
        int num1 = 1;
        for (i=0;i<line;i++)
        {
           int num2=num1++;
            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print(num2 +" ");
                num2++;
            }
            System.out.println();
            space++;
            star--;
        }
        for (i=0;i<line;i++)
        {

            space--;
            star++;
            int num2=num1--;
            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print(num2 +" ");
                num2++;
            }
            System.out.println();

        }

    }
}
