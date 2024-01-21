package Series;

public class FebbonachiSeriesReccursion
{
    static int n1= 0;
    static int n2 = 1;
    static int i = 0 ;
    public static void febo()
    {
        if (i<10)
        {
            System.out.println(n1);
            int a = n1 + n2;
            n1 = n2;
            n2 = a;
            i++;
            febo();
        }
    }
    public static void main(String[] args)
    {
        febo();
    }
}
