import java.util.Scanner;

import Exeptions.InvalidNumberException;

public class Task1 {
    public static void negativeNumber(int number) {
        if (number < 0 || number == 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        try {
            negativeNumber(number);
            System.out.println("Число " + number + " корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Некорректное число");
        }
    }
}