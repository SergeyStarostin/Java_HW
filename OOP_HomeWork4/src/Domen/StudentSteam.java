package Domen;

import java.util.Iterator;
import java.util.List;

/*
 * Класс, представляющий поток студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку групп.
 */
public class StudentSteam implements Iterable<StudentGroup> {
    /*
     * groups содержит ссылку на список групп студентов в потоке, по которому будет
     * производиться итерация.
     * numOfSteam - Номер потока.
     */
    private List<StudentGroup> groups;
    private int numOfSteam;

    /**
     * Конструктор класса.
     * 
     * @param numOfSteam номер потока
     * @param groups     список групп студентов в потоке
     */
    public StudentSteam(int numOfSteam, List<StudentGroup> groups) {
        this.numOfSteam = numOfSteam;
        this.groups = groups;
    }

    /**
     * Метод для получения списка групп студентов в потоке.
     * 
     * @return список групп студентов
     */
    public List<StudentGroup> getGroups() {
        return groups;
    }

    /**
     * Метод для получения номера потока.
     * 
     * @return номер потока
     */
    public int getNumOfSteam() {
        return numOfSteam;
    }

    /**
     * Метод для установки списка групп студентов в потоке.
     * 
     * @param groups список групп студентов
     */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод для установки номера потока.
     * 
     * @param numOfSteam номер потока
     */
    public void setNumOfSteam(int numOfSteam) {
        this.numOfSteam = numOfSteam;
    }

    /**
     * Метод для получения итератора по списку групп студентов в потоке.
     * 
     * @return итератор по списку групп студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            // Текущая позиция в списке групп студентов.
            private int index = 0;

            /**
             * Метод для проверки наличия следующего элемента в списке групп студентов.
             * 
             * @return true, если следующий элемент есть, false - в противном случае
             */
            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            /**
             * Метод для получения следующей группы студентов из списка.
             * 
             * @return следующая группа студентов
             */
            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }
        };
    }

    /**
     * Переопределенный метод toString() для вывода информации о потоке.
     * 
     * @return информация о потоке в виде строки
     */
    @Override
    public String toString() {
        String result = "Номер потока = " + numOfSteam +
                ", количество групп = " + this.groups.size() +
                ", список студентов:\n";
        for (StudentGroup group : groups) {
            for (Student student : group) {
                result += "Имя: " + student.getFirstName() +
                        "\tФамилия: " + student.getSecondName() +
                        "\tВозраст: " + student.getAge() +
                        "\tАдрес: " + student.getAddress() +
                        "\tstudentID: " + student.getStudentID() + "\n";
            }
        }
        return result;
    }
}