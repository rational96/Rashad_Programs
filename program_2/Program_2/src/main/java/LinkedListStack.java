/**
 *
 * @author Rashad
 */
import java.util.*;

public class LinkedListStack<T> implements StackInterface<T> {

    class Node
    {
	public T data;
	public Node next;
    }

    private Node first;
    private Node last;
    int numberOfEntries = 0;
    
    public LinkedListStack() {
        first = null;
    }

    public void push(T anEntry)	{
	Node n = new Node();
	n.data = anEntry;
	n.next = first;
	first = n;
        numberOfEntries++;
        if (numberOfEntries == 1) 
            last = first;
            
    }
        @Override
    public T pop() {
        if (first == null) {
            throw new NoSuchElementException();
	}
        else {
            Node temp = first;
            first = first.next;
            return temp.data;
	}
    }
    
        @Override
    public T front() {
	if (first == null) {	
            throw new NoSuchElementException();
	}
        else {
            T ret = last.data;
            return ret;
	}
    }
        @Override
    public T peek() {
	if (first == null) {	
            throw new NoSuchElementException();
	}
        else {
            T ret = first.data;
            return ret;
	}
    }
    
    public boolean isEmpty() {
        if (first==null)
            return true;
        return false;
    }



}