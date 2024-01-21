package Sequance;

public class NumSequance2
{
    public static void main(String[] args)
    {
        int line = 3 ;
        int star = 3 ;
        int num = 1 ;
        for (int i = 0 ; i<line ; i++)
        {
            for (int j = 0 ; j<star ; j++)
            {
                System.out.print(" "+num);
                num++;
            }

            System.out.println();
        }
    }
}
