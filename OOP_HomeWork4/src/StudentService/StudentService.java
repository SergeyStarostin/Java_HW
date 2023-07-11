package StudentService;

import java.util.ArrayList;
import java.util.List;
import Domen.Student;
import Domen.UserComparator;

/**
 * Класс для работы с объектами типа Student.
 */
public class StudentService implements iUserService<Student> {
    private int count; // счетчик количества объектов
    private List<Student> students; // список объектов типа Student

    /**
     * Конструктор класса. Инициализирует список объектов типа Student.
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод для получения списка всех объектов типа Student.
     * 
     * @return список всех объектов типа Student.
     */
    public List<Student> getAll() {
        return students;
    }

    /**
     * Метод для создания нового объекта типа Student и добавления его в список.
     * 
     * @param firstName  имя студента.
     * @param secondName фамилия студента.
     * @param age        возраст студента.
     * @param address    адрес студента.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        Student per = new Student(firstName, secondName, age, address, count); // создаем новый объект типа Student
        count++; // увеличиваем счетчик на 1
        students.add(per); // добавляем объект в список
    }

    /**
     * Метод для получения списка всех объектов типа Student, отсортированных по
     * ФИО.
     * 
     * @param studentID идентификатор студента.
     * @return список всех объектов типа Student, отсортированных по ФИО.
     */
    public List<Student> getSortedByFIOStudentGroup(long studentID) {
        List<Student> students = new ArrayList<Student>(this.students); // создаем копию списка объектов типа Student
        students.sort(new UserComparator<Student>()); // сортируем список по ФИО
        return students; // возвращаем отсортированный список
    }
}