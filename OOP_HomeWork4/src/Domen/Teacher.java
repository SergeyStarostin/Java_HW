package Domen;

/**
 * Класс, представляющий преподавателя.
 * Наследуется от класса User.
 */
public class Teacher extends Person {

    /** Уникальный идентификатор преподавателя */
    private long teacherId;

    /** Ученая степень преподавателя */
    private String academicDegree;

    /**
     * Конструктор класса Teacher.
     * 
     * @param firstName      Имя преподавателя.
     * @param secondName     Фамилия преподавателя.
     * @param age            Возраст преподавателя.
     * @param address        Адрес преподавателя.
     * @param teacherId      Уникальный идентификатор преподавателя.
     * @param academicDegree Ученая степень преподавателя.
     */
    public Teacher(String firstName, String secondName, int age, String address, long teacherId,
            String academicDegree) {
        super(firstName, secondName, age, address);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /**
     * Метод для получения уникального идентификатора преподавателя.
     * 
     * @return Уникальный идентификатор преподавателя.
     */
    public long getTeacherId() {
        return teacherId;
    }

    /**
     * Метод для установки уникального идентификатора преподавателя.
     * 
     * @param teacherId Уникальный идентификатор преподавателя.
     */
    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * Метод для получения ученой степени преподавателя.
     * 
     * @return Ученая степень преподавателя.
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /**
     * Метод для установки ученой степени преподавателя.
     * 
     * @param academicDegree Ученая степень преподавателя.
     */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Переопределенный метод toString для класса Teacher.
     * 
     * @return Строковое представление объекта класса Teacher.
     */
    @Override
    public String toString() {
        return "Имя = " + super.getFirstName() +
                "\tФамилия = " + super.getSecondName() +
                "\tВозраст = " + super.getAge() +
                "\tАдрес = " + super.getAddress() +
                "\tteacherId = " + teacherId +
                "\tУчёная степень = " + academicDegree;
    }
}