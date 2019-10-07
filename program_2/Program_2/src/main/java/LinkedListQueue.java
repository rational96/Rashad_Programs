/**
 *
 * @author Rashad
 */
import java.util.*;

public class LinkedListQueue<T> implements QueueInterface<T> {
    class Node {
		public int data;
		public Node next;
    }

    private Node first;
    private Node last;

    public LinkedListQueue() {
	first = null;
    }

    @Override
    public void enqueue(T anEntry) {
       	    Node n = new Node();
            n.data = anEntry;
            Node temp = first;
            while (temp.next != null)
                temp = temp.next;
            n.next = temp.next;
            temp.next = n;
            last.data = anEntry;
	
    }

    @Override
    public T dequeue() {
	if (first == null) {
            throw new NoSuchElementException();
	}
        else {
            T ret = first.data;
            first = first.next;
            return ret;
	}
    }
    
        @Override
    public T front() {
	T ret = first.data;
        return ret;
    }
    
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        else {
            return last.data;
        }
    }
        
    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
