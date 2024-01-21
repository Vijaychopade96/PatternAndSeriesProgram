package PatternProgramming;

public class Que47
{
    public static void main(String[] args) {
        int i, j;
        int line = 9;
        int star = 1;

        for (i = 0; i < line; i++) {
            int num1 = 9;
            for (j = 0; j < star; j++) {
                System.out.print(num1);
                num1--;
            }
            System.out.println();
            star++;

        }
    }
}
