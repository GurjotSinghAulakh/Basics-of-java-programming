package arrays2;

import java.util.ArrayList;

/**
 * It creates an ArrayList of integers, adds some numbers to it, removes some numbers from it, and then
 * prints out the numbers in the ArrayList
 */

public class Oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < 10; i++){
            list.add(i);
        }
        
        list.add(5);
        list.add(8);

        list.remove(2);
        list.remove(3);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}