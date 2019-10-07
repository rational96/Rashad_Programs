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

//adds entity
    public void push(T anEntry) {
        list.add(anEntry);
        numberOfEntries++;
    }
//removes and returns last entity
    public T pop() {
        if(list.size()==0)
            throw new IllegalStateException("Stack is empty");
        numberOfEntries--;
        return list.remove(list.size()-1);
    }
 //shows front of the list   
    public T front() {
        if (numberOfEntries == 0) 
            throw new IllegalStateException("Stack is empty");
        return list.get(1);
    }
//shows next entity    
    public T peek() {
        return list.get(numberOfEntries);
    }
//returns true if list is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }


}