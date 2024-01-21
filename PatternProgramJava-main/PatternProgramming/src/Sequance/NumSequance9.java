package Sequance;

public class NumSequance9
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5 ;
        int star = 5 ;

        for (i = 0 ; i<line ; i++)
        {
            int num = 2 ;
            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" " + num + " ");
                if (j<2)
                {
                    num--;
                }

                else
                {
                    num++;
                }

            }
            System.out.println();
        }
    }
}
