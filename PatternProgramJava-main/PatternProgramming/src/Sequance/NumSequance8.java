package Sequance;

public class NumSequance8
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 4 ;
        int star = 4 ;
        int num1 = 1 ;
        for (i=0 ; i<line ; i++)
        {
            int num2 = num1 ;
            for (j=0 ; j<star ; j++)
            {
                System.out.print(" "+num2+" ");
                num2++;
            }
            System.out.println();
            num1++;
        }
    }
}
