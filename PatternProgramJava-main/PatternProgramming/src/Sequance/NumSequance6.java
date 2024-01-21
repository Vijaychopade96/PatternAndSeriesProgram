package Sequance;

public class NumSequance6
{
    public static void main(String[] args)
    {
        int line = 5 ;
        int star = 3 ;
        int num = 1 ;
        for (int i = 0 ; i<line ; i++)
        {
            for (int j = 0 ; j<star ; j++)
            {
                if(i%2==0)
                {
                    System.out.print(" "+num+" ");
                }
                else
                {

                    System.out.print(" * ");
                }

            }
            if (i%2==0)
            {
                num++;
            }
            System.out.println();

        }
    }
}
