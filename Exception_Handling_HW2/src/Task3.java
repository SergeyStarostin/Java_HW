import java.util.Scanner;
import Exeptions.DivisionByZeroException;
import Exeptions.NumberGreaterRangeException;
import Exeptions.NumberOutOfRangeException;
import Exeptions.NumberSumException;

public class Task3 {
    public static void numberGreaterRangeException(int number1) {

        if (number1 > 100) {
            throw new NumberGreaterRangeException("Первое число вне допустимого диапазона");
        }
    }

    public static void numberOutOfRangeException(int number2) {
        if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static void divisionByZeroException(int number3) {
        if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }

    public static void numberSumException(int number1, int number2) {
        if ((number1 + number2) < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        } else {
            System.out.println("Проверка пройдена успешно");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());

        try {
            numberGreaterRangeException(number1);
        } catch (NumberGreaterRangeException e) {
            System.out.println("Первое число вне допустимого диапазона");
        }
        try {
            numberOutOfRangeException(number2);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Второе число вне допустимого диапазона");
        }
        try {
            divisionByZeroException(number3);
        } catch (DivisionByZeroException e) {
            System.out.println("Деление на ноль недопустимо");
        }
        try {
            numberSumException(number1, number2);
        } catch (NumberSumException e) {
            System.out.println("Сумма первого и второго чисел слишком мала");
        }
    }
}