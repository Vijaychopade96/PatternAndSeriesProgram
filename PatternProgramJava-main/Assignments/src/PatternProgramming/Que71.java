package PatternProgramming;

public class Que71
{
    public static void main(String[] args)
    {
        int i,j;
        int line= 5;
        int star = 1;

        for (i=0;i<line;i++)
        {
            int num=0;
            for (j=0;j<star;j++)
            {
                if (i>=j)
                    num++;
                else
                    num--;
                System.out.print(num);

            }
            System.out.println();
            star+=2;

        }
    }
}
