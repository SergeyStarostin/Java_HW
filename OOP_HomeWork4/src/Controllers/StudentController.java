package Controllers;

import java.util.List;
import Domen.Student;
import Domen.StudentGroup;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**
 * Класс контроллера для управления студентами.
 */
public class StudentController implements iUserController<Student>, iGroupController<StudentGroup> {
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    /**
     * Создает нового студента.
     * 
     * @param firstName  Имя студента.
     * @param secondName Фамилия студента.
     * @param age        Возраст студента.
     * @param address    Адрес студента.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        dataService.create(firstName, secondName, age, address);
    }

    /**
     * Создает новую группу студентов.
     * 
     * @param listStud Список студентов, входящих в группу.
     */
    @Override
    public void createGroup(List<Student> listStud) {
        groupService.createGroup(listStud);
    }
}