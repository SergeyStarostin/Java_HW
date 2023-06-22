import java.util.Scanner;
import PyramidSorting.pyramid;
import PhoneBookSours.phoneBook;
import ChessBoard.queen;

public class Main {
    public static void main(String[] args)  
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("1) Сортировка в телефонной книге");
            System.out.println("2) Реализация пирамидальной сортировки (HeapSort)");
            System.out.println("3) На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга");
            System.out.print("Ввыедите номер задачи: ");
            int tasks = in.nextInt();

            switch(tasks)
            {
                case 1:
                phoneBook phonebook = new phoneBook();
                phonebook.addContact("Кириллов Олег", "890356692456");
                phonebook.addContact("Бушуев Алексей", "89327657812");
                phonebook.addContact("Фомин Александр", "8927458512");
                phonebook.addContact("Сурнина Александра", "8902117845");
                phonebook.addContact("Демидов Денис", "890938654");
                phonebook.addContact("Афонасьев Кирилл", "89379807856");
                phonebook.addContact("Бушуев Алексей", "89277767349");
                phonebook.addContact("Демидов Денис", "89059465741");
                phonebook.addContact("Афонасьев Кирилл", "89378568156");
                phonebook.addContact("Кириллов Олег", "89095735145");
                phonebook.addContact("Бушуев Алексей", "89277745341");
                phonebook.printSortContacts();
                break;

                case 2:
                int [] array = new int[] {45, 239, 5, 8869, 786, 14, 45};
                int n = array.length;
                System.out.println("Заданный массив:");
                for (int i = 0; i < n; ++i)
                    System.out.println(array[i]);
                                
                pyramid.sort(array);
                System.out.println("Отсортированный массив:");
                for (int i = 0; i < n; ++i)
                    System.out.println(array[i]);
                break;

                case 3:
                queen solution = new queen();
                solution.placeQueens();
                break;
            }
        }
    }
}