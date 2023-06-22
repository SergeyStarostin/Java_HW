import Solution.Task01;
import Solution.Task02;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("1) Реализация метода, который вернет “перевернутый” список");
        System.out.println("2) Реализация очереди, с помощью LinkedList со следующими методами:enqueue() и dequeue()");
        System.out.print("Ввыедите номер задачи: ");
        int tasks = in.nextInt();
                
        switch(tasks)
        {
            case 1:
                Task01<String> list = new Task01<>(new LinkedList<>());
                list.setAddListElement("1");
                list.setAddListElement("2");
                list.setAddListElement("3");
                list.setAddListElement("4");
                    
                System.out.println("Начальный лист = " + list.getList());
                list.reverseList(list.getList());
                System.out.println("Перевернутый лист = " + list.getList() + "\n");   
                    break;

                case 2:
                    Task02<Integer> element = new Task02<>(new LinkedList<>());
                    element.enqueue(1);
                    element.enqueue(2);
                    element.enqueue(3);
                    element.enqueue(4);

                    System.out.println("Заполненый лист: " + element.getList() + "\n");
                    System.out.println("Возвращение первого элемента <" + element.dequeue() + "> и его удаление" );
                    System.out.println("Лист, без первого элемента: " + element.getList() + "\n");
                    System.out.println("Возвращение первого элемента <" + element.first() + "> без удаления");
                    System.out.println("Проверка на сохранность первого элемента: " + element.getList());
                    break;
        }
    }

}