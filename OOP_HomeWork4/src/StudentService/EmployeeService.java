package StudentService;

import java.util.ArrayList;
import java.util.List;
import Domen.Employee;
import Domen.UserComparator;

/**
 * Класс EmployeeService реализует интерфейс iUserService для работы с объектами
 * типа Employee.
 */
public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> employees;

    /**
     * Конструктор класса EmployeeService.
     */
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    /**
     * Метод для получения всех объектов типа Employee.
     * 
     * @return список всех объектов типа Employee.
     */
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * Метод для создания нового объекта типа Employee.
     * 
     * @param firstName  имя сотрудника.
     * @param secondName фамилия сотрудника.
     * @param age        возраст сотрудника.
     * @param address    адрес сотрудника.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        Employee per = new Employee(firstName, secondName, age, address, count);
        count++;
        employees.add(per);
    }

    /**
     * Метод для получения списка объектов типа Employee, отсортированных по ФИО и
     * группе.
     * 
     * @param empId идентификатор сотрудника.
     * @return отсортированный список объектов типа Employee.
     */
    public List<Employee> getSortedByFIOStudentGroup(long empId) {
        List<Employee> employees = new ArrayList<Employee>(this.employees);
        employees.sort(new UserComparator<Employee>());
        return employees;
    }
}