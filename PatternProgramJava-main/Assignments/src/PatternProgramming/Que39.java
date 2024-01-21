package PatternProgramming;

public class Que39
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5;
        int star = 1;

        for (i=0;i<line;i++)
        {
            int num = 5;
            for (j=0;j<star;j++)
            {
                System.out.print(num);
                num--;
            }
            System.out.println();
            star++;
        }
    }


}
