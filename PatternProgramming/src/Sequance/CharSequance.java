package Sequance;

public class CharSequance
{
    public static void main(String[] args)
    {
        int line = 5;
        int star = 4;
        char ch = 'A';
        for(int i = 0 ; i<line ; i++)
        {
            for (int j = 0 ; j<star ; j++)
            {
                System.out.print(" "+ch+" ");
                ch++;
                if (ch>'F')
                {
                    ch = 'A';
                }
            }

            System.out.println();
        }
    }

}
