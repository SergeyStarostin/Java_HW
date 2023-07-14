package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

/**
 * Класс ModelHashMap реализует интерфейс iGetModel и представляет собой модель
 * данных студентов в виде хэш-таблицы.
 */
public class ModelHashMap implements iGetModel {
    private HashMap<Long, Student> students;

    /**
     * Конструктор класса ModelHashMap, создающий новую пустую хэш-таблицу.
     */
    public ModelHashMap() {
        students = new HashMap<Long, Student>();
    }

    /**
     * Метод для добавления нового студента в хэш-таблицу.
     * 
     * @param firstName  имя студента
     * @param secondName фамилия студента
     * @param age        возраст студента
     * @param studentID  идентификатор студента
     */
    public void addStudent(String firstName, String secondName, int age, long studentID) {
        students.put(studentID, new Student(firstName, secondName, age, studentID));
    }

    /**
     * Метод для получения списка всех студентов из хэш-таблицы.
     * 
     * @return список всех студентов
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<Student>();
        for (var stud : students.entrySet())
            studList.add(stud.getValue());
        return studList;
    }

    /**
     * Метод для удаления студента из хэш-таблицы по его идентификатору.
     * 
     * @param studentID идентификатор студента, которого нужно удалить
     * @return true, если студент был успешно удалён, и false, если такого студента
     *         не было в хэш-таблице
     */
    @Override
    public boolean deleteStudent(long studentID) {
        if (students.containsKey(studentID)) {
            students.remove(studentID);
            return true;
        }
        return false;
    }
}