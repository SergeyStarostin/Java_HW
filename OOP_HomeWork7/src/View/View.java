package View;

import java.util.Scanner;

import Model.ComplexNumber;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("_____________________________");
        System.out.println("Калькулятор комплексных чисел");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
    }

    public int getMenuChoice() {
        System.out.print("Выберите операцию: ");
        return scanner.nextInt();
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double realPart = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void showResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }
}