/**
 * file:ArrayQueue.java
 * @author Rashad
 * class: CS 2400-04
 * 
 * assignment: program 2
 * date last modified: 10/7/2019
 * purpose:
 */
import java.util.*;
public class ArrayQueue<T> implements QueueInterface<T> {
    private ArrayList<T> list;

    public ArrayQueue(){
	list = new ArrayList<T>();
    }
    	@Override
// adds to the list
    public void enqueue(T element) {
	list.add(element);
    }
	@Override
// removes next entity
    public T dequeue() {
	if(list.size() <= 0){
            throw new IllegalStateException("Queue is empty");
        }
	return list.remove(0);
    }
    	@Override
//shows front of list
    public T front() {
	if(list.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
	return list.get(0);
    }	
	@Override
//shows next entity
    public T peek() {
	return list.get(list.size()-1);
    }
	@Override
//returns true if empty
    public boolean isEmpty() {
	return list.isEmpty();
    }



	
}




/*
public class ArrayQueue <T> implements QueueInterface<T> {
    private ArrayList<T> queue;
    public ArrayQueue() {
        queue = (ArrayList<T>) new ArrayList<T>();
}
    private int numbrOfEntries = 0;
    
   public void enqueue(T newEntry) {
        queue.add(newEntry);
        numbrOfEntries++;
   }
   public T dequeue() {
       
   }
   public T front () {
       
   }
   public T peek() {
       
   }
   public boolean isEmpty() {
       
   }    
}
*/