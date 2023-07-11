import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmployeeController;
import Domen.Employee;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Domen.Person;
import StudentService.AverageAge;

/*
 * Главный класс приложения.
 */
public class Main {
    /**
     * Метод main, запускающий приложение.
     * 
     * @param args аргументы командной строки.
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception {

        // Создание объекта сотрудника
        Employee person1 = new Employee("Кирилл", "Олегов", 55, "Москва", 401);

        // Выплата зарплаты сотруднику
        EmployeeController.paySalary(person1);

        // Вычисление среднего количества часов и средней ЗП
        Integer studHour[] = { 64, 234, 16, 168, 120 };
        System.out.printf("Среднее количество часов: %.2f\n", EmployeeController.mean(studHour));
        Double emplSalary[] = { 80500.55, 68654.63, 75000.0 };
        System.out.printf("Средняя ЗП: %.2f\n", EmployeeController.mean(emplSalary));

        // Вычисление среднего возраста студентов, преподавателей и сотрудников
        AverageAge<Student> averageAgeStudents = new AverageAge<>();
        averageAgeStudents.add(new Student("Аркадий", "Филатов ", 20, "Тольятти", 201));
        averageAgeStudents.add(new Student("Сергей", "Свиридов ", 21, "Самара", 202));
        averageAgeStudents.add(new Student("Русиф", "Ниязов ", 23, "Мурманск", 203));
        System.out.println(averageAgeStudents + " (для студентов)");

        AverageAge<Teacher> averageAgeTeachers = new AverageAge<>();
        averageAgeTeachers.add(new Teacher("Петр", "Волонтеров ", 35, "Москва", 301, "Доцент"));
        averageAgeTeachers.add(new Teacher("Максим", "Прохоров ", 45, "Москва", 302, "Кандидат наук"));
        averageAgeTeachers.add(new Teacher("Валерий", "Прохоров ", 46, "Москва", 303, "Старший научный сотрудник"));
        System.out.println(averageAgeTeachers + " (для преподавателей)");

        AverageAge<Employee> averageAgeEmployees = new AverageAge<>();
        averageAgeEmployees.add(new Employee("Кирилл", "Олегов ", 55, "Москва", 401));
        averageAgeEmployees.add(new Employee("Фома", "Александров ", 48, "Москва", 402));
        averageAgeEmployees.add(new Employee("Александр", "Кириллов ", 46, "Москва", 403));
        System.out.println(averageAgeEmployees + " (для сотрудников)");

        // System.out.println("=========================================================================================");

        /*
         * Создаем экземпляры класса Student
         */
        // Student s1 = new Student("Михаил", "Ивашкевич ", 20, "Павлов ", 101);
        // Student s2 = new Student("Алла", "Фролова ", 19, "Самара ", 102);
        // Student s3 = new Student("Алексей", "Бушуев ", 22, "Рижск ", 103);
        // Student s4 = new Student("Степан", "Шишович ", 19, "Москва ", 104);
        // Student s5 = new Student("Ника", "Сурнина ", 20, "Чита ", 105);
        // Student s6 = new Student("Матвей", "Сакардин ", 22, "Калуга ", 106);
        // Student s7 = new Student("Сергей", "Петров ", 18, "Москва ", 107);
        // Student s8 = new Student("Борис", "Крюков ", 19, "Самара ", 108);
        // Student s9 = new Student("Иван", "Димидов ", 21, "Кряж ", 109);
        // Student s10 = new Student("Петр", "Павлов ", 20, "Уфа ", 110);
        // Student s11 = new Student("Артем", "Рогожин ", 22, "Москва ", 111);
        // Student s12 = new Student("Андрей", "Иванов ", 21, "Чита ", 112);
        // Student s13 = new Student("Давид", "Рыжков ", 19, "Москва ", 113);
        // Student s14 = new Student("Игорь", "Петров ", 21, "Валы ", 114);
        // Student s15 = new Student("Оксана", "Литова ", 22, "уфа ", 115);
        // Student s16 = new Student("Виктория", "Мамелина ", 22, "Москва ", 116);
        // Student s17 = new Student("Мария", "Сидорова ", 20, "Орел ", 117);
        // Student s18 = new Student("Вера", "Петрова ", 22, "Москва ", 118);

        // /*
        // * Создаем и заполняем коллекции экземплярами класса Student
        // */
        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s1);
        // listStud1.add(s2);
        // listStud1.add(s3);
        // listStud1.add(s4);
        // listStud1.add(s5);

        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud1.add(s6);
        // listStud1.add(s7);
        // listStud1.add(s8);
        // listStud2.add(s9);
        // listStud2.add(s10);
        // listStud2.add(s11);
        // listStud2.add(s12);

        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud3.add(s13);
        // listStud3.add(s14);
        // listStud3.add(s15);
        // listStud3.add(s16);
        // listStud3.add(s17);
        // listStud3.add(s18);

        // /*
        // * Создаем экземпляры класса StudentGroup
        // */
        // StudentGroup group1 = new StudentGroup(1, listStud1);
        // StudentGroup group2 = new StudentGroup(2, listStud2);
        // StudentGroup group3 = new StudentGroup(3, listStud3);

        // /*
        // * Создаем и заполняем коллекцию экземплярами класса StudentGroup
        // */
        // List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        // listSteam.add(group1);
        // listSteam.add(group2);
        // listSteam.add(group3);

        // /*
        // * Создаем экземпляр класса StudentSteam
        // */
        // StudentSteam steam1 = new StudentSteam(1, listSteam);

        // /*
        // * С помощью цикла построчно выводим группы со списком студентов, не
        // * отсортированно
        // */
        // for (StudentGroup group : steam1) {
        // System.out.printf("Группа %d\n", group.getNumOfGroup());
        // for (Student stud : group) {
        // System.out.println(stud);
        // }
        // }
        // System.out.println("=========================================================================================");
        // /*
        // * Сортируем
        // */
        // Collections.sort(steam1.getGroups());
        // Collections.sort(group1.getStudents());
        // Collections.sort(group2.getStudents());
        // Collections.sort(group3.getStudents());

        // /*
        // * С помощью цикла построчно выводим группы со списком студентов,
        // отсортированые
        // * по колличеству студентов в группе
        // */
        // for (StudentGroup group : steam1) {
        // System.out.println(group);
        // }

        /*
         * Вывод на экран экземпляра класса StudentSteam с помощью переопределенного
         * метода ToString
         */
        // System.out.println(steam1);

        // /*
        // * С помощью цикла построчно выводим студентов, не отсортированно
        // */
        // for (Student stud : group1) {
        // System.out.println(stud);
        // }
        // System.out.println("=============================================================================================");

        // /*
        // * Сортируем
        // */
        // Collections.sort(group1.getStudents());

        /*
         * С помощью цикла построчно выводим студентов, отсортированно согласно логике
         * метода compareTo() интерфейса Comparable для сравнения студентов по возрасту
         * и идентификатору.
         */
        // for (Student stud : group1) {
        // System.out.println(stud);
        // }
    }
}