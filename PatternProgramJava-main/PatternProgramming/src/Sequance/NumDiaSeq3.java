package Sequance;

public class NumDiaSeq3
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space = 2;
        int num = 1;
        for (i = 0 ; i < line ; i++)
        {
            for (k = 0 ; k < space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j <star ; j++)
            {
                if (i % 2 ==0)
                {
                    System.out.print(" "+num+" ");
                }
                else
                System.out.print(" * ");
            }
            System.out.println();
            num++;
            if (i < 2)
            {
                star+=2;
                space--;
            }
            else
            {
                star-=2;
                space++;
            }
        }
    }
}
