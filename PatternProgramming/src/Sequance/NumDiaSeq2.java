package Sequance;

public class NumDiaSeq2
{
    public static void main(String[] args)
    {
        int i,j,k;
        int line = 5;
        int star = 1;
        int space = 2;
        int num1 = 0;
        for (i = 0 ; i < line ; i++)
        {
            int num2 = num1;
            for (k = 0 ; k < space ; k++)
            {
                System.out.print("   ");
            }
            for (j = 0 ; j <star ; j++)
            {
                System.out.print(" "+num2+" ");
                num2++;
            }
            System.out.println();
            num1++;

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
