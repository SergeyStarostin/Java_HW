package Solution;

import java.util.List;

public class Task02<T>
{
/*
2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/
    private List<T> list;
    public List<T> getList(){
        return list;
    }
    public Task02(List<T> list){
        this.list = list;
    }
    public void enqueue(T argument){
        this.list.add(argument);
    }
    public T dequeue(){
        T temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }
    public T first(){
       return this.list.get(0);
    }
}
