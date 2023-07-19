import java.util.Scanner;
import Controller.Calculator;
import Model.ComplexNumber;
import Model.Decorator;
import Model.OperationFactory;
import View.View;

/**
 * Основной класс приложения, реализующий взаимодействие с пользователем и вызов
 * операций калькулятора.
 */
public class Main {
    /**
     * Объект класса Scanner для ввода данных с консоли.
     */
    public Scanner scanner = new Scanner(System.in);

    /**
     * Метод main, точка входа в приложение.
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Создание объектов View и Calculator
        View view = new View();
        Calculator calculator = new Calculator();

        int choice = 0;
        while (choice != 4) {
            // Вывод меню на экран и получение выбора пользователя
            view.showMenu();
            choice = view.getMenuChoice();

            // Выбор операции в зависимости от выбора пользователя
            switch (choice) {
                case 1:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // сложения
                    ComplexNumber num1 = view.getComplexNumber();
                    ComplexNumber num2 = view.getComplexNumber();
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("сложение")));
                    ComplexNumber sum = calculator.execute(num1, num2);
                    break;
                case 2:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // вычитания
                    ComplexNumber num3 = view.getComplexNumber();
                    ComplexNumber num4 = view.getComplexNumber();
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("вычитание")));
                    ComplexNumber dif = calculator.execute(num3, num4);
                    break;
                case 3:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // произведения
                    ComplexNumber num5 = view.getComplexNumber();
                    ComplexNumber num6 = view.getComplexNumber();
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("умножение")));
                    ComplexNumber prod = calculator.execute(num5, num6);
                    break;
                case 4:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // деления
                    ComplexNumber num7 = view.getComplexNumber();
                    ComplexNumber num8 = view.getComplexNumber();
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("деление")));
                    ComplexNumber div = calculator.execute(num7, num8);
                    break;
                case 5:
                    // Вывод сообщения о выходе из программы
                    System.out.println("Выход");
                    break;
                default:
                    // Вывод сообщения об ошибке при некорректном выборе пользователя
                    System.out.println("Некорректный выбор");
            }
        }
    }
}