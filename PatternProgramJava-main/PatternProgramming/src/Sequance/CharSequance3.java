package Sequance;

public class CharSequance3
{
    public static void main(String[] args)
    {
        int i,j,k ;
        int line = 1;
        int star = 5;
        int space = 0;
        char ch = 'E';
        for (i = 0 ; i < line ; i++)
        {
            for (k = 0 ; k < space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j < star ; j++)
            {
                System.out.print(" "+ch+" ");
            }
            System.out.println();
            star--;
            space++;
            ch--;
        }
    }
}
