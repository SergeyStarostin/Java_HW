package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewRus - представление в MVC-шаблоне.
 * Содержит методы для вывода информации на экран
 * и получения ввода от пользователя.
 */
public class ViewRus implements iGetView {

    /**
     * Объект Scanner для получения ввода пользователя.
     * Используется кодировка Cp866 для поддержки русских символов.
     */
    public Scanner in = new Scanner(System.in, "Cp866");

    /**
     * Метод выводит список студентов на экран.
     * 
     * @param students Список студентов, которых нужно вывести.
     */
    public void printAllStudents(List<Student> students) {
        System.out.println("==========Вывод списка студентов==========");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("==========Конец списка==========");
    }

    /**
     * Метод запрашивает у пользователя ввод и возвращает введенное значение.
     * 
     * @param message Сообщение, которое будет выведено перед ожиданием ввода.
     * @return Введенное пользователем значение.
     */
    public String prompt(String message) {
        System.out.printf(message);
        return in.nextLine();
    }
}