package PatternProgramming;

public class Que60
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 9;
        int star=5;
        int space=0;
        int num1=1;
        int num2;
        for (i=0;i<line;i++)
        {
            if (i<4)
                num2=num1++;
            else
                num2=num1--;
            for (k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (j=0;j<star;j++)
            {
                System.out.print(num2+" ");
                num2++;
            }
            System.out.println();
            if (i<4)
            {
                space++;
                star--;
            }
            else
            {
                space--;
                star++;
            }
        }
    }
}
