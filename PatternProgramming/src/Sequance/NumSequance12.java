package Sequance;

public class NumSequance12
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5 ;
        int star = 5 ;
        int num1 = 1;
        for (i = 0 ; i<line ; i++)
        {
            int num2 = num1;
            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" "+num2+" ");
                num2+=5;
            }
            num1++;
            System.out.println();
        }
    }
}
