import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1;
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a = a * (1 + 0.1 * i);
        }
        System.out.println("Your result = " + a);
    }
}
/*
For12. Дано целое число N (> 0). Найти произведение
1.1 · 1.2 · 1.3 · . . . (N сомножителей).
 */



