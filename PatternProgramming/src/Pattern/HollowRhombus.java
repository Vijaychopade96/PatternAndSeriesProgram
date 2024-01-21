package Pattern;

public class HollowRhombus
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 5 ;
        int space = 0;

        for (i=0;i<line;i++)
        {
            for (k=0;k<space;k++)
            {

                System.out.print(" ");

            }
            for (j=0;j<star;j++)
            {
                if (i==0||j==0||j==4||i==4)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space++;
        }
    }
}
