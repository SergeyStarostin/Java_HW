package Domen;

/**
 * Класс представляет студента и содержит информацию о его имени, фамилии,
 * возрасте, адресе и идентификаторе.
 * Класс также реализует интерфейс Comparable для сравнения студентов по
 * возрасту и идентификатору.
 */
public class Student extends Person implements Comparable<Student> {

    /*
     * Идентификатор студента
     */
    private long studentID;

    /**
     * Конструктор класса Student.
     * 
     * @param firstName  имя студента
     * @param secondName фамилия студента
     * @param age        возраст студента
     * @param address    адрес студента
     * @param studentID  идентификатор студента
     */
    public Student(String firstName, String secondName, int age, String address, long studentID) {
        super(firstName, secondName, age, address);
        this.studentID = studentID;
    }

    /**
     * Метод для получения идентификатора студента.
     * 
     * @return идентификатор студента
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * Метод для установки идентификатора студента.
     * 
     * @param studentID идентификатор студента
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /**
     * Переопределенный метод toString() для вывода информации о студенте.
     * 
     * @return информация о студенте в виде строки
     */
    @Override
    public String toString() {
        return "Имя = " + super.getFirstName() +
                "\tФамилия = " + super.getSecondName() +
                "\tВозраст = " + super.getAge() +
                "\tАдрес = " + super.getAddress() +
                "\tstudentID = " + studentID;
    }

    // /**
    // * Реализация метода compareTo() интерфейса Comparable для сравнения студентов
    // по возрасту и идентификатору.
    // * @param o студент, с которым нужно сравнить текущего студента
    // * @return результат сравнения в виде целого числа (0 - равны, 1 - текущий
    // студент больше, -1 - текущий студент меньше)
    // */
    // @Override
    // public int compareTo(Student o) {
    // System.out.println(super.getFirstName() + " - " + o.getFirstName());
    // if(super.getAge() == o.getAge()){
    // if(this.studentID == o.studentID){
    // return 0;
    // }
    // if(this.studentID < o.studentID){
    // return -1;
    // }
    // return 1;
    // }
    // if(super.getAge() < o.getAge()){
    // return -1;
    // }
    // return 1;
    // }

    /**
     * Реализация метода compareTo() интерфейса Comparable для сравнения студентов
     * по идентификатору.
     * 
     * @param o студент, с которым нужно сравнить текущего студента
     * @return результат сравнения в виде целого числа (0 - равны, 1 - текущий
     *         студент больше, -1 - текущий студент меньше)
     */
    @Override
    public int compareTo(Student o) {
        if (this.studentID == o.studentID) {
            return 0;
        }
        if (this.studentID < o.studentID) {
            return -1;
        }
        return 1;
    }
}