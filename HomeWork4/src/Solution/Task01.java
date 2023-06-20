package Solution;

import java.util.Collections;
import java.util.List;

public class Task01<T> 
{

    private List<T> list;

    public Task01(List<T> list){
        this.list = list;
    }
    public List<T> getList() {
        return list;
    }
    public void setAddListElement(T element) {
        this.list.add(element);
    }
    public void reverseList(List<T> list){
        Collections.reverse(list);
    }
}