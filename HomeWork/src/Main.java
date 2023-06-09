/*
1) Вычислить сумма чисел от 1 до n
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        SumFromOneToN();

    }

    private static void SumFromOneToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
    }

}

