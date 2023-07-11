package Domen;

import java.util.Comparator;

/**
 * Класс-компаратор для сравнения объектов типа User по имени и фамилии.
 * 
 * @param <T> тип объектов, которые будут сравниваться (должны быть подклассом
 *            User)
 */
public class UserComparator<T extends Person> implements Comparator<T> {

    /**
     * Метод сравнения двух объектов типа User по имени и фамилии.
     * 
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return отрицательное число, если первый объект меньше второго;
     *         положительное число, если первый объект больше второго;
     *         ноль, если объекты равны
     */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}