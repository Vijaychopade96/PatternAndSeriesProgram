package Number;

public class AddNum1
{
    static int a = 0;
    static int sum = 0;
    public static void main(String[] args)
    {
        addNum();
        System.out.println(sum);
    }
    public static void addNum()
    {
        if (a<=20)
        {
           sum+=a;
           a++;
           addNum();
        }
    }
}
