class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        int element = arr[10]; // выход за пределы массива
    }

    public static void divisionByZero() {
        int result = 10 / 0; // деление на 0
    }

    public static void numberFormatException() {
        String str = "qwerty";
        int number = Integer.parseInt(str); // преобразование строки в число
    }
}

public class Task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            Answer.arrayOutOfBoundsException();
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            Answer.divisionByZero();
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            Answer.numberFormatException();
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}