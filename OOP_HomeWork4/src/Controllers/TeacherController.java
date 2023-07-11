package Controllers;

import Domen.Teacher;
import StudentService.TeacherService;

/**
 * Контроллер для управления объектами типа Преподаватель.
 */
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    /**
     * Создает нового преподавателя с заданными параметрами.
     * 
     * @param firstName  имя преподавателя
     * @param secondName фамилия преподавателя
     * @param age        возраст преподавателя
     * @param address    адрес преподавателя
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        teacherService.create(firstName, secondName, age, address);
    }
}