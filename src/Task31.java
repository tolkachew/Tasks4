import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        double a = 2;
        for (int i = 1; i <= n; i++) {
            a = 2 + 1 / a;
            System.out.print(a + " ");
        }
    }
}
/*
For31. Дано целое число N (> 0). Последовательность вещественных чисел AK
определяется следующим образом: A0 = 2, AK = 2 + 1/AK−1, K = 1, 2, . . . .
Вывести элементы A1, A2, . . . , AN .
 */