package YouTubeLessons.Queue;
// Очередь - первый удаляется, последний добавляется
import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public T remove(){
        return list.remove(0);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
