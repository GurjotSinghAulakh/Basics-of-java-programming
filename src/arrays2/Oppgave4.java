package arrays2;

import java.util.ArrayList;

/**
 * It creates an ArrayList of Integers, then converts it to an array of ints
 */ 

public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < 10; i++){
            list.add(i);
        }
        
        int[] array = new int[list.size()];
        
        for (int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}