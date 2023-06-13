/*
1) Вычислить сумма чисел от 1 до n
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("1) Вычислить сумма чисел от 1 до n");
            System.out.println("2) Вывести все простые числа от 1 до 1000");
            System.out.println("3) Реализовать простой калькулятор");
            System.out.println("4) Восстановить выражение до верного равенства");
            System.out.println("Ввыедите номер задачи: ");
            int tasks = in.nextInt();
            
            switch(tasks){
                case 1:
                    SumFromOneToN();
                    break;
                case 2:
                    PrimeNumbers();
                    break;
                case 3:
                    Calculator();
                    break;
                case 4:
                    SolutionExample("2? + ?5 = 69");
                    break;
            }
        }
    }

    private static void SumFromOneToN() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        }
    }

    private static void PrimeNumbers() {
        System.out.println("Простые числа от 1 до 1000: ");
        for (int i = 1; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
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

    public static boolean Validate(int first, int second , int result){
        return first + second == result;
    }

    public static void SolutionExample(String expression){
        String[] numbers = expression.split("=");
        int resultExpression = Integer.parseInt(numbers[1].trim());
        String[] leftExpression = numbers[0].trim().replaceFirst(" ","").replace("+","").split(" ");
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            int first = Integer.parseInt(leftExpression[0].replace("?", String.valueOf(i)));
            for (int j = 0; j < 10; j++) {
                int second = Integer.parseInt(leftExpression[1].replace("?", String.valueOf(j)));
                if(Validate(first,second,resultExpression)){
                    System.out.println(first + " + " + second + " = " + resultExpression);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) System.out.println("Решения нет");
    }
}