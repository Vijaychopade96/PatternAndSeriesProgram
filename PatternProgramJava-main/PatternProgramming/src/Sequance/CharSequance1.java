package Sequance;

public class CharSequance1
{
    public static void main(String[] args)
    {
         int line = 6;
         int star = 6 ;

         for (int i = 0 ; i<line ; i++)
         {
             char ch = 'A';
             for (int j = 0 ; j<star ; j++)
             {
                 if (i==0 || j==0 || i==5 || j==5)
                 {
                     System.out.print(" * ");
                 }
                 else
                 {
                     System.out.print(" "+ch+" ");
                     ch++;
                 }
             }
             System.out.println();
         }
    }
}
