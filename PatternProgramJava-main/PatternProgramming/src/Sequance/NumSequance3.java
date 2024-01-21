package Sequance;

public class NumSequance3
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
                System.out.print(num*2 + "  ");
                num++;
            }

            System.out.println();
        }
    }
}
