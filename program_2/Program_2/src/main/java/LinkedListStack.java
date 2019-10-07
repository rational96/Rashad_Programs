/**
 * file:LinkedListStack.java
 * @author Rashad
 * class: CS 2400-04
 * 
 * assignment: program 2
 * date last modified: 10/7/2019
 * purpose:uses a stack system by linked list
 */
import java.util.*;

public class LinkedListStack<T> implements StackInterface<T> {

    class Node
    {
	public T data;
	public Node next;
    }
//holds data for the begining and end of list
    private Node first;
    private Node last;
//keeps track of input numbers
    int numberOfEntries = 0;
    
    public LinkedListStack() {
        first = null;
    }
//adds new entry
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
// removes one entry at the end and returns the value
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
//shows what is at the front of the list
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
//shows next entity
    public T peek() {
	if (first == null) {	
            throw new NoSuchElementException();
	}
        else {
            T ret = first.data;
            return ret;
	}
    }
// checks to see if empty
    public boolean isEmpty() {
        if (first==null)
            return true;
        return false;
    }



}