import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= (2 * n - 1); i += 2) {
            res += i;
            System.out.print(res + " ");
        }
    }
}
/*
For14. Дано целое число N (> 0). Найти квадрат данного числа, используя для его вычисления следующую формулу:
N 2 = 1 + 3 + 5 + . . . + (2·N − 1). После добавления к сумме каждого слагаемого выводить текущее значение суммы
(в результате будут выведены квадраты всех целых чисел от 1 до N).
*/