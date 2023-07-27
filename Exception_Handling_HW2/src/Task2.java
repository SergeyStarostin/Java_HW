import java.util.Scanner;

import Exeptions.DivisionByZeroException;

public class Task2 {
    public static void negativeNumber(int number1, int number2) {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        double res = number1 / number2;

        try {
            negativeNumber(number1, number2);
            System.out.println(number1 + " / " + number2 + " = " + res);
        } catch (DivisionByZeroException e) {
            System.out.println("Деление на ноль недопустимо");
        }
    }
}