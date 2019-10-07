/**
 *
 * @author Rashad
 */
public interface StackInterface<T> {
   public void push(T anEntry);
   public T pop();
   public T front ();
   public T peek();
   public boolean isEmpty();
}
