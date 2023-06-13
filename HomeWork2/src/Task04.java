/*
 4) К калькулятору из предыдущего ДЗ добавить логирование.
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.Scanner;

public class Task04 
{
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("СalcLog.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Работа калькулятора");
        Calculator();
    }

    private static void Calculator() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            char action = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = 0;
            switch (action) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    return;
            }
            System.out.println(num1 + " " + action + " " + num2 + " = " + result);
        }
    }
}