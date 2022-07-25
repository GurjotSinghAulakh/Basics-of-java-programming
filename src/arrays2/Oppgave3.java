package arrays2;

import java.util.ArrayList;

/**
 * It creates an array of integers, then copies the values from the array into an ArrayList
 */ 

public class Oppgave3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
