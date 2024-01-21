package Sequance;

public class NumSequance1
{
    public static void main(String[] args)
    {
        int line = 4 ;
        int star = 4 ;

        for (int i = 0 ; i<line ; i++)
        {
            int num = 1 ;
            for (int j = 0 ; j<star ; j++)
            {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
