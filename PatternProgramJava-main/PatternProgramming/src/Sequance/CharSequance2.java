package Sequance;

public class CharSequance2
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 4 ;
        int star = 4 ;
        char ch1='A' ;
        for (i = 0 ; i<line ; i++)
        {

            for (j = 0 ; j<star ; j++)
            {
                System.out.print(" "+ch1+" ");
                ch1++;
                if (ch1>'D')
                {
                    ch1='A';
                }
            }
            System.out.println();
            ch1++;
        }
    }
}
