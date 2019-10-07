/**
 *
 * @author Rashad
 */
import java.util.ArrayList;

public class ArrayStack<T> implements StackInterface<T> {

    private ArrayList<T> list;
    int numberOfEntries = 0;

    public ArrayStack() {
        list = new ArrayList<T>();
    }


    public void push(T anEntry) {
        list.add(anEntry);
        numberOfEntries++;
    }


    public T pop() {
        if(list.size()==0)
            throw new IllegalStateException("Stack is empty");
        numberOfEntries--;
        return list.remove(list.size()-1);
    }
    
    public T front() {
        if (numberOfEntries == 0) 
            throw new IllegalStateException("Stack is empty");
        return list.get(1);
    }
    
    public T peek() {
        return list.get(numberOfEntries);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }


}