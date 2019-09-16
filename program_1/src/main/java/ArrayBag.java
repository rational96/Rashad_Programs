
//Rashad Khan
public class ArrayBag<T> implements BagInterface<T> {
    private  T[] bag ;


     private int numbrOfEntries = 0;

    @Override
     public int getCurrentSize() {
        return numbrOfEntries;
     }

    @Override
     public boolean add(T newEntry) {
        boolean result = true;
             bag[numbrOfEntries] = newEntry;
             numbrOfEntries++;
            
        
        return result;
     }

     


     @Override
     public boolean isEmpty() {
         return numbrOfEntries == 0;
     }

     @Override
     public void clear() {
         while (!isEmpty()) {
         remove();
            }
     }

     @Override
     public T remove() {
        T result = null;
        if (numbrOfEntries > 0) {
            numbrOfEntries--;
            result = bag[numbrOfEntries];
        } 
        else {
            bag[numbrOfEntries] = null;
            result = bag[numbrOfEntries];
        }
        return result;
     }

     @Override
     public boolean remove(T anEntry) {
         int index = getIndexOf(anEntry);
         T result = removeEntry(index);
         return anEntry.equals(result);
     }

     public T removeEntry(int Index) {
        T result = null;
        if(!isEmpty() && (Index >= 0)) {
             result = bag[Index];
             numbrOfEntries--;
             bag[Index] = bag[numbrOfEntries];
             bag[numbrOfEntries] = null;
        }
        return result;
     }

     public int getIndexOf(T anEntry) {
      int value = 0;
      boolean found = false;

      for (int i = 0; !found && (i < numbrOfEntries); i++) {
        if (anEntry.equals(bag[i])) {
            found = true;
            value = i;
        }
       }
       return value;
     }

    @Override
     public boolean contains(T anEntry) {

      for (int i = 0; i < numbrOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
             return true;
       }
      }
      return false;
     }

     @Override
     public int getFrequencyOf(T anEntry) {
            int counter = 0; 

            for(int i = 0; i < numbrOfEntries; i++)
            {
                if(anEntry.equals(bag[i])) {
                    counter++;
                }
            }
                    return counter;
    }

    @Override
     public T[] toArray() {
         T[] result = (T[])new Object[numbrOfEntries];
         for(int i = 0; i < numbrOfEntries; i++) {
            result[i] = bag[i];
         }	
             return result;
    }
 

}


