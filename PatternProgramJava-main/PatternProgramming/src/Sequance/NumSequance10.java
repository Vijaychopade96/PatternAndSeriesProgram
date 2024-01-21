package Sequance;

public class NumSequance10
{
    public static void main(String[] args)
    {
        int i,j;
        int line = 5 ;
        int star = 5 ;
        int num = 2 ;
       for (i = 0 ; i<line ; i++)
       {
              for (j = 0 ; j<star ; j++)
              {
                  System.out.print(" " + num + " ");
              }


           System.out.println();

           if(i<2)
           {
               num--;
           }
           else
           {
               num++;
           }
       }
    }
}
