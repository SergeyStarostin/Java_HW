import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHashMap;
import Model.Student;
import View.ViewRus;
import View.ViewEng;

/**
 * Главный класс приложения.
 */
public class Main {
   /**
    * Объект сканера для считывания пользовательского ввода.
    */
   public static Scanner in = new Scanner(System.in, "Cp866");

   /**
    * Возвращает объект отображения в зависимости от выбранного языка.
    * 
    * @param lang выбранный язык
    * @return объект отображения
    * @throws IllegalArgumentException если выбран неподдерживаемый язык
    */
   public static iGetView view(String lang) {
      iGetView view;
      if (lang.equals("RUS")) {
         view = new ViewRus();
      } else if (lang.equals("ENG")) {
         view = new ViewEng();
      } else {
         throw new IllegalArgumentException("Неподдерживаемый язык!");
      }
      return view;
   }

   /**
    * Точка входа в приложение.
    * 
    * @param args аргументы командной строки
    * @throws Exception если возникла ошибка
    */
   public static void main(String[] args) throws Exception {
      System.out.printf("Выберите язык: RUS/ENG: ");
      String lang = in.nextLine().toUpperCase();

      ModelHashMap studentsHash = new ModelHashMap();
      studentsHash.addStudent("Аркадий", "Филатов", 20, (long) 101);
      studentsHash.addStudent("Сергей", "Свиридов", 21, (long) 102);
      studentsHash.addStudent("Русиф", "Ниязов", 22, (long) 103);
      studentsHash.addStudent("Петр", "Волонтеров", 22, (long) 104);
      studentsHash.addStudent("Максим", "Прохоров", 23, (long) 105);
      studentsHash.addStudent("Елена", "Васина", 23, (long) 106);

      List<Student> studentsList = new ArrayList<Student>(Arrays.asList(
            new Student("Аркадий", "Филатов", 20, (long) 101),
            new Student("Сергей", "Свиридов", 21, (long) 102),
            new Student("Русиф", "Ниязов", 22, (long) 103),
            new Student("Петр", "Волонтеров", 22, (long) 104),
            new Student("Максим", "Прохоров", 23, (long) 105),
            new Student("Елена", "Васина", 23, (long) 106)));

      FileRepo fileRepo = new FileRepo("StudentDB.txt");
      for (Student person : studentsList) {
         fileRepo.addStudent(person);
      }
      fileRepo.saveAllStudentsToFile();

      iGetView view = view(lang);
      iGetModel modelHashMap = studentsHash;
      iGetModel modelList = new Model(studentsList);
      iGetModel modelFileRepo = fileRepo;

      Controller control = new Controller(view, modelHashMap, lang);
      control.run();
   }
}