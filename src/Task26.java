import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int n = sc.nextInt();
        float x1 = x, res = x;
        int k = 1;
        for (int i = 2; i <= n; i++) {
            k += 2;
            x1 *= -1 * x * x;
            res += x1 / k;
        }
        System.out.println(res);
    }
}
/*
For26. Дано вещественное число X (|X| < 1) и целое число N (> 0). Найти
значение выражения X − X3/3 + X5/5 − . . . + (−1)N ·X2·N+1/(2·N+1).
Полученное число является приближенным значением функции arctg вточке X.
*/

