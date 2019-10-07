/**
 * file:LinkedListQueue.java
 * @author Rashad
 * class: CS 2400-04
 * 
 * assignment: program 2
 * date last modified: 10/7/2019
 * purpose:
 */
import java.util.*;

public class LinkedListQueue<T> implements QueueInterface<T> {
    class Node {
		public T data;
		public Node next;
    }

    private Node first;
    private Node last;

    public LinkedListQueue() {
	first = null;
        last = null;
    }

    @Override
//adds to queue
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
//removes fromm queue
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
//shows front
    public T front() {
	T ret = first.data;
        return ret;
    }
// shows next entity    
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        else {
            return last.data;
        }
    }
//returns true if empty        
    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
