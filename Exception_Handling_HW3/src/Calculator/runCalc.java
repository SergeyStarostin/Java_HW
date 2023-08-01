package Calculator;

import java.util.Scanner;

import Calculator.Exeptions.InvalidInputException;

/**
 * Класс Calculator представляет простой калькулятор, который выполняет основные
 * арифметические операции
 * (+, -, *, /, возведение в степень) над двумя введенными числами).
 */
public class Calculator {

    /**
     * Главный метод runCalc класса Calculator запрашивает у пользователя два числа
     * и
     * выполняет все операции операции(+, -, '', /, возведения первого числа в
     * степень второго числа).
     */
    private static void runCalc() {
        Scanner scanner = new Scanner(System.in);
        double operand1 = 0, operand2 = 0;

        try {
            System.out.print("Введите первый операнд: ");
            operand1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите второй операнд: ");
            operand2 = Double.parseDouble(scanner.nextLine());

            double sum = operand1 + operand2;
            System.out.println("Сумма: " + sum);

            double difference = operand1 - operand2;
            System.out.println("Разность: " + difference);

            double product = operand1 * operand2;
            System.out.println("Произведение: " + product);

            if (operand2 != 0) {
                double quotient = operand1 / operand2;
                System.out.println("Частное: " + quotient);
            } else {
                System.out.println("Ошибка: деление на 0");
            }

            try {
                double power = PowerCalculator.calculatePower(operand1, operand2);
                System.out.println("Результат возведения в степень: " + power);
            } catch (InvalidInputException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } catch (NumberFormatException h) {
            System.out.println("Ошибка: введено не число");
        }
    }

    /**
     * Метод запускает калькулятор в цикле, чтобы дать пользователю возможность
     * повторить ввод, если был введен некорректный ввод.
     */
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            runCalc();
            System.out.print("Выйти из программы? (Y/N): ");
            String choice = new Scanner(System.in).nextLine().toUpperCase();
            if (choice.equals("Y")) {
                isRunning = false;
            }
        }
    }
}