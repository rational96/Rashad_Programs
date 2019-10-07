/**
 * file:StackInterface.java
 * @author Rashad
 * class: CS 2400-04
 * 
 * assignment: program 2
 * date last modified: 10/7/2019
 * purpose:just a stack interface
 * 
 */
public interface StackInterface<T> {
   public void push(T anEntry);
   public T pop();
   public T front ();
   public T peek();
   public boolean isEmpty();
}
