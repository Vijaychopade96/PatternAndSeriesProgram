package Number;

public class Program1
{
    static int a = 0 ;
    public static void main(String[] args)
    {
        disply();
    }
    public static void disply()
    {
        if (a<10)
        {
            System.out.println(a);
            a++;
            disply();
        }
    }
}
