import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int n = sc.nextInt();
        float x1 = 1, n1 = 1;
        float res = 1.0f;
        for (int i = 1; i <= n; i++) {
            n1 *= (float) i;
            x1 *= x;
            res += x1 / n1;
        }
        System.out.println(res);
    }
}
/*
For22. Дано вещественное число X и целое число N (> 0).
Найти значение выражения 1 + X + X2/(2!) + . . . + X^N /(N!)(N! = 1·2·. . .·N).
Полученное число является приближенным значением функции exp в точке X.
*/