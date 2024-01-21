package PatternProgramming;

public class Que111
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line=5;
        int star=5;
        int num1=0;
        for (i=0;i<line;i++)
        {
            int num=5;
            for (j=0;j<star;j++)
            {
                System.out.print(num);
                for (k=0;k<num1;k++)
                {
                    num--;
                }
            }
            System.out.println();
            num1++;
        }
    }


}
