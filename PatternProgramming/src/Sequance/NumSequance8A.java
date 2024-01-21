package Sequance;

public class NumSequance8A
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5 ;
        int star = 5 ;
        int num = 1 ;
        for (i = 0 ; i<line ; i++)
        {
            num = i + 1;
            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" " +num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
