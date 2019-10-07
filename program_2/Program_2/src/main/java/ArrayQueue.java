/**
 *
 * @author Rashad
 */
import java.util.*;
public class ArrayQueue<T> implements QueueInterface<T> {
    private ArrayList<T> list;

    public ArrayQueue(){
	list = new ArrayList<T>();
    }

	@Override
    public T peek() {
	return list.get(list.size()-1);
    }
	
	@Override
    public boolean isEmpty() {
	return list.isEmpty();
    }

	@Override
    public T front() {
	if(list.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
	return list.get(0);
    }
	
	@Override
    public void enqueue(T element) {
	list.add(element);
    }
	
	@Override
    public T dequeue() {
	if(list.size() <= 0){
            throw new IllegalStateException("Queue is empty");
        }
	return list.remove(0);
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