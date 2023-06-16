package Solution;

import java.util.ArrayList;
import java.util.Collections;

public class Task03 {
/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/
    public static void SortingNumbers() 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Список целых чисел: " + list);
        
        int minNumber = Collections.min(list);
        System.out.println("Минимальное значение: " + minNumber);

        int maxNumber = Collections.max(list);
        System.out.println("Максимальное значение: " + maxNumber);

        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        double averageNumber = (double) sum / list.size();
        System.out.println("Среднее значение max и min: " + averageNumber);
    }
}