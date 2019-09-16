/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashad
 */
import java.util.*;
public class BagTest extends ArrayBag {
    public static void main(String[] args){
        //declerations
        boolean mainMenuLoop = true;
        boolean check = true;
        int responce = 0;
        int answer = 0;
        ArrayBag Bag = new ArrayBag();
        System.out.println("Welcome to your bag");
        do{

            System.out.println("\nWhat would you like to do?\n"
                    + "\n1- Get current size of bag"
                    + "\n2- Check to see if bag is empty"
                    + "\n3- Add to the bag"
                    + "\n4- Remove unspecified item from bag"
                    + "\n5- Remove specified item from bag"
                    + "\n6- Empty the bag"
                    + "\n7- Check frequency of item"
                    + "\n8- See if item exists in bag"
                    + "\n9- Quit");
            //main menu

            responce = input(1,9);
            if(responce == 1) {
                
                System.out.println("The size of the bag is "
                        + Bag.getCurrentSize());
                continue;
            }
            else if(responce == 2) {
                if(Bag.isEmpty()){
                    System.out.println("\nThis bag is empty");
                }
                else {
                    System.out.println("\nThis bag is not empty");
                }
                continue;
            }
            else if (responce == 3) {
                System.out.println("\nWhat Integer between 1-100"
                        + " would you like to enter?");
                responce = input(1,100);
                check = Bag.add(responce);
                if (check) {
                    System.out.println("\n" + responce
                            + " was added to the bag"); 
                }
                else {
                    System.out.println("\n" + responce
                            + " was not added to the bag");
                }
            }
            else if (responce == 4) {
                Bag.remove();
                System.out.println("an unspecified entry was removed");
            }
            else if (responce == 5 ) {
                System.out.println("\n What integer between 1 - 100"
                        + " would you like to remove?");
                responce = input(1, 100);
                check = Bag.remove(responce);
                if (check) {
                    System.out.println("\n" + responce
                            + " was taken out of the bag");
                }
                else {
                    System.out.println("\n" + responce
                            + " was not taken out of the bag");
                }
            }
            else if (responce == 6) {
                Bag.clear();
                System.out.println("\n The bag has been emptied");
            }
            else if (responce == 7) {
                System.out.println("\nWhat integer between 1-100 would you"
                        + " like to check the frequency of?");
                responce = input(1, 100);
                answer = Bag.getFrequencyOf(responce);
                System.out.println("\nThere is "+ answer 
                        + " instances of " + responce);
            }
            else if (responce == 8) {
                System.out.println("\nWhat integer between 1-100 would you"
                        + " like to see if it exists in the bag?");
                responce = input(1, 100);
                check = Bag.contains(responce);
                if (check) {
                    System.out.println("\n" + responce
                            + " is in the bag");
                }
                else {
                    System.out.println("\n" + responce
                            + " was not in the bag");
                }

            }
            else {
                mainMenuLoop = false;
            }        
        }while (mainMenuLoop);
        System.exit(0);
    }
       

   
public static int input(int begin, int end) {
    //while loop till valid inout
    boolean loop2 = true;
    //persons input
    int responce2 = 0;
    //creates scanner
    Scanner kb = new Scanner(System.in);
    while(loop2) {
        try{
            responce2 = kb.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input\n");
            kb.nextLine();
            continue;
        }
        if(begin <= responce2 && responce2 <= end) {
            break;
        }
        else{
            System.out.println("Invalid Input\n");
            kb.nextLine();
            continue;
        }
    }
    return responce2;
    
}

   
}


//tesstsfsd


