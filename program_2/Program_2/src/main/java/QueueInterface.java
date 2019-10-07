/**
 *
 * @author Rashad
 */
public interface QueueInterface <T> {
   public void enqueue(T x);
   public T dequeue();
   public T front ();
   public T peek();
   public boolean isEmpty();
}

