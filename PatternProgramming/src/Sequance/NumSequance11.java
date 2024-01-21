package Sequance;

public class NumSequance11
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5 ;
        int star = 5 ;
        int num1 = 5;
        for (i = 0 ; i<line ; i++)
        {
            int num2 = num1 ;
            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" " + num2 + " ");
                if(num2<1)
                {
                    num2=0;
                }
                else
                {
                    num2--;
                }

            }
            System.out.println();
            num1--;
        }
    }
}
