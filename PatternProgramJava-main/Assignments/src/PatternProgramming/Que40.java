package PatternProgramming;

public class Que40
{
    public static void main(String[] args) {
        int i, j;
        int line = 5;
        int star = 5;
        int num = 1;
        for (i = 0; i < line; i++) {
            int num1 = num++;
            for (j = 0; j < star; j++) {
                System.out.print(num1);
                num1++;
            }
            System.out.println();
            star--;
        }
    }
}
