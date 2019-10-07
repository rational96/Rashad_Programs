/**
 *
 * @author Rashad
 * 
 * this code strikes pain to my very core...
 */
import java.util.*;
public class Driver {
    public static void main(String[] args){
        
        int[] test = new int[50];
        StackInterface<Integer> AS = new ArrayStack<>();
        StackInterface<Integer> LLS = new LinkedListStack<>();
        QueueInterface<Integer> AQ = new ArrayQueue<>();
        QueueInterface<Integer> LLQ = new LinkedListQueue<>();
        Random rand = new Random(100);
 //makes an array with 50 random numbers for all the lists to use
        System.out.println("List of random numbers are:");
        for (int i = 0 ; i < 50 ; i++) {
           test[i] = rand.nextInt(100);
           System.out.print(test[i] + " ");
        }
        
// stores numbers in each list
        for (int i = 0 ; i < 50 ; i++) {
            AS.push(test[i]);
            LLS.push(test[i]);
            AQ.enqueue(test[i]);
            // LLQ.enqueue(test[i]);                            error
        }
        System.out.println("\nThe following lists are \nArrayStack"
                + "   LinkedListStack   ArrayQueue   LinkedListQueue");
        
//prints list accordingly
        while (!AS.isEmpty() && !LLS.isEmpty() && !AQ.isEmpty()) {
            System.out.printf("     " + AS.pop() + "            "
                    + " "  + LLS.pop() + "              " + AQ.dequeue() + "\n");
            AS.pop();
            LLS.pop();
            AQ.dequeue();
            // LLQ.dequeue();                                   error
        }
        
    }
}
