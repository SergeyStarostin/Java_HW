package Solution;

import java.util.ArrayList;

public class Task02 {
/* 
Пусть дан произвольный список целых чисел, удалить из него четные числа.
*/
    public static void RemoveEvenNumbers(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(50);
        numbers.add(88);
        numbers.add(11);
        numbers.add(6);
        System.out.println("Список: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + numbers);
    }
}