package YouTubeLessons.Queue;

/* Стек - вершина, в которую добавляется элементы "сверху" и "сверху" они и берутся, а затем те, которые были добавлены ранее
    Last in - First out (LIFO)
* */

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list = new ArrayList<>(){};


    public void push (T item){
        list.add(0, item);
    }

    public T pop(){
        return list.remove(0);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
