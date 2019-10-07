/**
 * file:QueueInterface.java
 * @author Rashad
 * class: CS 2400-04
 * 
 * assignment: program 2
 * date last modified: 10/7/2019
 * purpose:
 */
public interface QueueInterface <T> {
   public void enqueue(T x);
   public T dequeue();
   public T front ();
   public T peek();
   public boolean isEmpty();
}

